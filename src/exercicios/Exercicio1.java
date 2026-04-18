package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float salary, bonus, sum;
		
		System.out.println("Digite o salário R$: ");		
		salary = input.nextFloat();
		
		System.out.println("Digite o abono R$: ");
		bonus = input.nextFloat();
		
		sum = salary + bonus;
		
		System.out.print("Novo salário R$: " + sum);
		
		input.close();
		

	}

}
