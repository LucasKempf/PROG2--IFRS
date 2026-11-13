package exemplo2;

public class Veiculo {

	private String marca;
	private String modelo;
	private double valor;
	
	public Veiculo(String marca, String modelo, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}