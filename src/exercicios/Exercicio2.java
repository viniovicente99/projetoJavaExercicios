package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float grade1, grade2, grade3, grade4, avg;
		
		System.out.println("Digite a primeira nota: ");
		grade1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		grade2 = input.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		grade3 = input.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		grade4 = input.nextFloat();
		
		avg = (grade1 + grade2 + grade3 + grade4) / 4;
		
		System.out.printf("Média final: %.1f%n", avg);
		
		input.close();

	}

}
