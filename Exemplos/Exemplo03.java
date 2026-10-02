package arrays;

public class Exemplo03 {

	public static void main(String[] args) {
		
		String[] nomes = new String[4];
		
		nomes[0] = "Joana";		
		nomes[1] = "Joaquim";
		nomes[2] = "João";
		nomes[3] = "Júlio";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}

}
