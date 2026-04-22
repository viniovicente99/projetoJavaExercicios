package exerciciosIfElse;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número: ");
		number = input.nextInt();	
		
		int sub = number % 2;		
		
		if(sub == 0 && number >= 0 ) {
			System.out.println("O número é par e positivo.");
		} else if (sub == 0 && number < 0) {
			System.out.println("O número é par e negativo.");			
		} else if (sub != 0 && number >= 0) {
			System.out.println("O número é ímpar e positivo.");
		} else {
			System.out.println("O número é ímpar e negativo.");			
		}
		
		input.close();

	}

}
