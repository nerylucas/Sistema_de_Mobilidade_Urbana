package entidades;

public class Passageiro extends Usuario {
	
	private boolean emDebito;
	
	public Passageiro(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);
		this.emDebito = false;

	}
	
	public boolean isEmDebito() {
		return emDebito;
	}
	
	public void setEmDebito(boolean emDebito) {
		this.emDebito = emDebito;
	}
	
	public void solicitarCorrida(String origem, String destino, MetodoPagamento mp) {
		System.out.println(getNome() + " solicitou uma corrida de " + origem + "para " + destino);
	}
	
	public void avaliarMotorista(Motorista m, int nota, String comentario) {
		Avaliacao a = new Avaliacao(nota, comentario, this, m);
		m.receberAvaliacao(a);
	}
	

}
