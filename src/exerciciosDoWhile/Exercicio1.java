package exerciciosDoWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0, sum = 0;
		
		do {		
	   
			System.out.println("\nDigite um número: ");
			num = input.nextInt();
			
			if(num > 0) {
				sum+= num;
			}		
	
		} while(num != 0);
		
		System.out.printf("\nA soma dos números positivos é: %d", sum);
	}
}
