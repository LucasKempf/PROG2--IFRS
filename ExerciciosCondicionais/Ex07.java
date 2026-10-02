package atividades;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		 Scanner leitor = new Scanner(System.in);

	        System.out.print("Digite seu salário: ");
	        double sal = leitor.nextDouble();

	        double nsal = sal;

	        if (sal <= 1000) {
	            nsal = sal + (sal * 0.20);
	        }

	        if (sal > 1000 && sal <= 2000) {
	            nsal = sal + (sal * 0.15);
	        }

	        if (sal > 2000) {
	            nsal = sal + (sal * 0.10);
	        }

	        System.out.printf("Seu novo salário é de R$ %.2f%n", nsal);

	        leitor.close();
	    }
	}