package exerciciosFor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int even = 0, odd = 0;
		int count = 0, num = 0;
		
		for(count = 1; count <= 10; count++) {
			System.out.printf("\nDigite o %d° número: ", count);
			num = input.nextInt();
			
			if(num % 2 == 0) {
				even++;				
			} else if(num % 2 != 0) {
				odd++;
			}
		}
		
		System.out.printf("\nTotal de números pares: %d ", even);
		System.out.printf("\nTotal de números ímpares: %d ", odd);
		
	}
}
