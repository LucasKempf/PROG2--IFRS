package exemplos3;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Prefeito p1 = new Prefeito("José", "PMDT");
		
		Cidade c1 = new Cidade("Arloana", p1);

		System.out.println(c1.getNome());
		System.out.println(c1.getPrefeito().getNome());
		System.out.println(c1.getPrefeito().getPartido());
		
	}

}
