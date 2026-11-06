package exemplos4;

public class Motor {

	private int potencia;
	private int litros;
	
	public Motor(int potencia, int litros) {
		super();
		this.potencia = potencia;
		this.litros = litros;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

}