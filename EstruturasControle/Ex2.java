package EstruturasControle;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = leitor.nextInt();
		
		
		boolean primo = true;
		
		if (n<2) {
			primo = false;
			}else {
				for (int i = 2; i < n; i++) {
					if(n%i==0) {
						primo=false;
						break;
					}
				}
			}
		
		if(primo) {
			System.out.println(n+" é um número primo.");
		}else {
			System.out.println(n+ " não é um número primo.");
		}
			
		leitor.close();
	}
}