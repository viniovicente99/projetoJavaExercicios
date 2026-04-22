package exerciciosIfElse;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor A: ");
		a = input.nextInt();
		
		System.out.println("Digite o valor B: ");
		b = input.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = input.nextInt();
		
		int sum = a + b;		
		
		if(sum > c) {
			System.out.println("A soma de A e B é maior que C.");
		} else if (sum < c) {
			System.out.println("A soma de A e B é menor que C.");			
		} else {
			System.out.println("A soma de A e B é igual a C.");
		}
		
		input.close();

	}

}
