package exerciciosWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int age = 0, counter = 1;
		int below21 = 0, above50 = 0;
		
		while(counter <= 10) {
			System.out.println("Digite uma idade: ");
			age = input.nextInt();
			
			if(age < 0) {
				System.out.println("Digite somente idades válidas.");
				break;
			}
			
			counter++;
			
			if(age < 21) {
				below21++;			
			} else if(age > 50) {
				above50++;
			}
		}		
		
		System.out.printf("\nTotal de menores de 21 anos: %d", below21);
		System.out.printf("\nTotal de maiores de 50 anos: %d", above50);

		
	}

}
