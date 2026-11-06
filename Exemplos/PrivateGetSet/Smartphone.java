package exemplos2;

public class Smartphone {

	private String modelo;
	private String marca;
	private double valor;
	
	public Smartphone(String modelo, String marca, double valor) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}