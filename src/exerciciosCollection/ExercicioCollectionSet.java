package exerciciosCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> setNumbers = new HashSet<Integer>();		
		Scanner input = new Scanner(System.in);
		int userInput = 0;

		while(setNumbers.size() < 10) {
			System.out.println("Digite um número inteiro não repetido: ");
			userInput = input.nextInt();
			
			if(!setNumbers.add(userInput)) {				
				System.out.println("Valor já existente.");
			}
		}
		 
		Iterator<Integer> iSetNumbers = setNumbers.iterator();
		
		System.out.println("\n\nListar todos os Elementos com o Iterator\n");
		
		while(iSetNumbers.hasNext()) {
			System.out.println(iSetNumbers.next() + "\n");			
		}
		
		
		
	}

}
