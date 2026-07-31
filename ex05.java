package atividades;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		/*printf 
		%s → texto (String)
		%.2f → número decimal com 2 casas
		%n → quebra de linha
		*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu sálario: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Qual a porcentagem de aumento salarial:");
		double perc = leitor.nextDouble();
		
		double aumento = (perc / 100) * salario;
		double nsalario = salario + aumento;
		
		System.out.println("Sálario: R$" + salario);
		System.out.println("Percentual de aumento: "+ perc + "%");
		System.out.println("Valor do aumento: R$" + aumento);
		System.out.println("Sálario novo: R$" + nsalario);
		
		
		leitor.close();
	}

}
