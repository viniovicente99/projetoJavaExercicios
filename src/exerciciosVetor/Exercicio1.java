package exerciciosVetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numbersArray[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int userNumber;
		boolean numberFound = false;
		int position = 0;
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		userNumber = input.nextInt();
		
		for(int i = 0; i < numbersArray.length; i++) {
			if(numbersArray[i] == userNumber) {
				numberFound = true;
				position = i;
				break;
			}		
		}
				
		if(numberFound == true) {
			System.out.printf("\nO número %d está localizado na posição: %d", userNumber, position);			
		}
		
		if(numberFound == false) {
			System.out.printf("\nNúmero %d não foi encontrado!", userNumber);
		}
		
		input.close();
		
	}

}
