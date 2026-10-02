package arrays;

import java.util.Random;

public class Exemplo06 {

	public static void main(String[] args) {
		
		Random r = new Random();	
		
		int [] array = new int[1000];
		
		int soma0 = 0;
		
		int soma1 = 0;
		
		for (int i = 0; i < 1000; i++) {
			array[i] = r.nextInt(2);//(2) delimita o espaço de randomização nesse caso (0 e 1) 
			
			if (array[i]==0) {
				soma0 += 1;
			}else {
				soma1 +=1;
			}
		}
		
		System.out.println(soma0);
		System.out.println(soma1);
		
		//System.out.println(numero);
		
	}
	
}