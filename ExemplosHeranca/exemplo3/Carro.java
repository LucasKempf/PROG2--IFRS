package exemplo2;

public class Carro extends Veiculo {

	private String motor;
	private String renavam;
	
	public Carro(String marca, String modelo, double valor, String motor, String renavam) {
		super(marca, modelo, valor);
		this.motor = motor;
		this.renavam = renavam;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	
}