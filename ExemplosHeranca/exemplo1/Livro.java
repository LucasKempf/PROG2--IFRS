package exemplo4;

public class Livro extends Produto{

	private String titulo;
	private String autor;
	
	public Livro(int codigo, double valor, String titulo, String autor) {
		super(codigo, valor);
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}