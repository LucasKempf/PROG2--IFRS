package exemplos1;

public class Politico {

	private String nome;
	private String partido;
	
	public Politico(String nome, String partido) {
		super();
		this.nome = nome;
		this.partido = partido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
}	