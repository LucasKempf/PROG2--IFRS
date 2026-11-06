package exemplos4;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(120, 55);
		
		Carro c1 = new Carro("Volkswagen", "Golf", m1);
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getMotor().getPotencia());
		System.out.println(c1.getMotor().getLitros());
	}

}
