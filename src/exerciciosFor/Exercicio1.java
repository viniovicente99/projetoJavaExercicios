package exerciciosFor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    int num1 = 0, num2 = 0;
	    
	    System.out.println("Digite o primeiro número: ");
	    num1 = input.nextInt();
	    
	    System.out.println("Digite o segundo número: ");
	    num2 = input.nextInt();
	    
	    if(num1 >= num2) {
	    	System.out.println("Intervalo inválido.");	    	
	    } else {
	    	for(int i = num1; i <= num2; i++) {
	    		if(i % 3 == 0 && i % 5 == 0 ) {
	    			System.out.printf("\n %d é múltiplo de 3 e 5.", i);
	    		}	    		
	    	}
	    }
		

	}

}
