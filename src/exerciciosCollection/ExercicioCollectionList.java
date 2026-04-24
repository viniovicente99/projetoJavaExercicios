package exerciciosCollection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExercicioCollectionList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userInput = "";		
		ArrayList<String> colors = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			userInput = input.next();
			colors.add(userInput);						
		}
		
		System.out.println("\nlistar todas as cores: " + colors);
		Collections.sort(colors);
		System.out.println("\nOrdenar as cores: " + colors);
		
		input.close();

	}

}
