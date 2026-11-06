package exemplos2;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Cavalo", 300, 4);
		Curso c1 = new Curso("ADS", 6, "IFRS");
		Smartphone s1 = new Smartphone("Iphone 18", "Iphone", 8350.90);
		Filme f1 = new Filme ("Vingadores", 2027 , "Comics");
		
		System.out.println("--------ANIMAL--------");
		System.out.println("Raça: "+a1.getRaca());
		System.out.println("Peso: "+a1.getPeso()+ "kg.");
		System.out.println("Patas: "+a1.getPatas());
		System.out.println("--------CURSO--------");
		System.out.println("Curso: "+c1.getNome());
		System.out.println("Duração: "+c1.getDuracao()+" semestres.");
		System.out.println("Instituição: "+c1.getInstituicao());
		System.out.println("--------SMARTPHONE--------");
		System.out.println("Modelo: "+s1.getModelo());
		System.out.println("Marca: "+s1.getMarca());
		System.out.println("Preço: R$"+s1.getValor());
		System.out.println("--------FILME--------");
		System.out.println("Nome: "+f1.getNome());
		System.out.println("Ano de lançamento: "+f1.getAnoLancamento());
		System.out.println("Gênero: "+f1.getGenero());
		
		
	}

}
