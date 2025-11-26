package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String senha;
	
	private List<Avaliacao> avaliacoesRecebidas;
	private double mediaAvaliacoes;
	
	public Usuario(String nome, String cpf, String email, String telefone, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.avaliacoesRecebidas = new ArrayList<>();
		this.mediaAvaliacoes = 0.0;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getMediaAvaliacoes() {
		return mediaAvaliacoes;
	}
	
	public List<Avaliacao> getAvaliacoesRecebidas() {
		return avaliacoesRecebidas;
	}
	
	public void calcularMediaAvaliacoes() {
		if (avaliacoesRecebidas.isEmpty()) {
			mediaAvaliacoes = 0;
			return;
		}
		
		double soma = 0;
		for (Avaliacao a : avaliacoesRecebidas) {
			soma += a.getNota();
		}
		
		mediaAvaliacoes = soma / avaliacoesRecebidas.size();
	}
	
	public void receberAvaliacao(Avaliacao a) {
		this.avaliacoesRecebidas.add(a);
		calcularMediaAvaliacoes();
		
	}
}
