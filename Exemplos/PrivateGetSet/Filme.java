package exemplos2;

public class Filme {

	private String nome;
	private int anoLancamento;
	private String genero;
	
	public Filme(String nome, int anoLancamento, String genero) {
		super();
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}