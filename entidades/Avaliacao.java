package entidades;

import java.time.LocalDateTime;

public class Avaliacao {
	private int nota;
	private String comentario;
	private LocalDateTime data;
	private Usuario avaliador;
	private Usuario avaliado;
	
	public Avaliacao(int nota, String comentario, Usuario avaliador, Usuario avaliado) {
		this.nota = nota;
		this.comentario = comentario;
		this.avaliador = avaliador;
		this.avaliado = avaliado;
		this.data = LocalDateTime.now();
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public Usuario getAvaliador() {
		return avaliador;
	}
	
	public void setAvaliador(Usuario avaliador) {
		this.avaliador = avaliador;
	}
	
	public Usuario getAvaliado() {
		return avaliado;
	}
	
	public void setAvaliado(Usuario avaliado) {
		this.avaliado = avaliado;
	}

}
