package Atividade01;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Curso c1 = new Curso();
		
		System.out.println("Digite o nome do seu curso:");
		c1.curso = leitor.nextLine();
		System.out.println("Digite em semestres a duração do seu curso:");
		c1.duracao = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Digite o nome da instituição do seu curso:");
		c1.instituicao = leitor.nextLine();
		
		
		c1.imprimir();
		
		leitor.close();
	}

}
