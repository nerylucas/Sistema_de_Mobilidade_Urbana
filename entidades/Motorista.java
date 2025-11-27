package entidades;

public class Motorista extends Usuario {

    private String cnh;
    private StatusMotorista status;
    private Veiculo veiculo;

    public Motorista(String nome, String cpf, String email, String telefone, String senha,
                     String cnh, Veiculo v) {

        super(nome, cpf, email, telefone, senha);
        this.cnh = cnh;
        this.veiculo = v;
        this.status = StatusMotorista.OFFLINE;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public StatusMotorista getStatus() {
        return status;
    }

    public void setStatus(StatusMotorista status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo v) {
        this.veiculo = v;
    }

    
    public void aceitarCorrida(Corrida c) {
        if (status != StatusMotorista.ONLINE) {
            System.out.println("Motorista não pode aceitar corrida agora!");
            return;
        }

        c.setStatus(StatusCorrida.ACEITA);
        this.status = StatusMotorista.EM_CORRIDA;

        System.out.println(getNome() + " aceitou a corrida.");
    }

    public void finalizarCorrida(Corrida c) {
        c.finalizarViagem();
        this.status = StatusMotorista.ONLINE;
        System.out.println(getNome() + " finalizou a corrida.");
    }

    public void avaliarPassageiro(Passageiro passageiro, int nota, String comentario) {
		Avaliacao a = new Avaliacao(nota, comentario, this, passageiro);
		passageiro.receberAvaliacao(a);
    }
}
