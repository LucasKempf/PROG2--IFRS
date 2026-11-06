package exemplos2;

public class Animal {

	private String raca;
	private double peso;
	private int patas;
	
	public Animal(String raca, double peso, int patas) {
		super();
		this.raca = raca;
		this.peso = peso;
		this.patas = patas;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}