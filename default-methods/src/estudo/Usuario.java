package estudo;

class Usuario {
	
	private String nome;
	private int pontos;
	private boolean moderador;
	
	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isModerador() {
		return moderador;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void tornarModerador() {
		this.moderador = true;
	}

}
