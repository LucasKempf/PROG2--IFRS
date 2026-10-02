package arrays;

public class Exemplo04 {

	public static void main(String[] args) {
		
		// String é uma classe, não é um tipo de dado primitivo
		String cidade = "Vale Real";
		
		// System.out.println(cidade.length()); // Tamanho da String
		// System.out.println(cidade.charAt(0)); // Obtém um caractere
		
		for (int i = 0; i < cidade.length(); i++) {
			System.out.println(cidade.charAt(i));
		}
	}
}