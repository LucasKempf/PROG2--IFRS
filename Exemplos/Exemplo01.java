package arrays;

public class Exemplo01 {

	public static void main(String[] args) {
		
		//tenho os elementos de antemão
		int [] notas = {10, 9, 8};
		
		//altero os elementos
		notas[2] = 9;
		notas[1] = 8;
		
		//imprimo a posição (indice) que começa em 0 
		System.out.println(notas[0]);
		System.out.println(notas[1]);
		System.out.println(notas[2]);
		
		System.out.println("Tamanho: " + notas.length);
		
		//imprimi do começo ao fim
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		//imprimi do fim ao começo
		for (int i = notas.length-1; i >= 0; i--) {
			System.out.println(notas[i]);
		}
		
	}

}
