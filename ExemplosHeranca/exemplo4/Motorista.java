package exemplo1;

public class Motorista extends Pessoa {

	private String cnh;

	public Motorista(String nome, int idade, String cnh) {
		super(nome, idade);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
}