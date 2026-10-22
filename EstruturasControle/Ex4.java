package atividades;

public class Ex4 {

	public static void main(String[] args) {
		
		int anterior = 0;
		int atual = 1;
		int proximo = 0;
		
		System.out.println(anterior);
		System.out.println(atual);
		
		while (proximo < 500) {
			proximo = atual+anterior;
			
			System.out.println(proximo);
			
			anterior = atual;
			atual=proximo;
		}
		
	}

}