package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sku, quantity;		
		String product = "";
		double price = 0; 
		
		System.out.println("Digite o código do produto: ");
		sku = input.nextInt();
		
		System.out.println("Digite a quantidade desejada do produto: ");
		quantity = input.nextInt();
		
		switch (sku) {
		case 1:
			product = "Cachorro Quente";
			price = 10.0;
			break;
			
		case 2:
			product = "X-Salada";
			price = 15.0;
			break;
			
		case 3:
			product = "X-Bacon";
			price = 18.0;
			break;
			
		case 4:
			product = "Bauru";
			price = 12.0;
			break;
			
		case 5:
			product = "Refrigerante";
			price = 8.0;
			break;
			
		case 6:
			product = "Suco de Laranja";
			price = 13.0;
			break;
			
		 default:
             System.out.println("Código inválido!");
             input.close();
             return;
     }

	     double total = price * quantity;
	
	     System.out.println("Produto: " + product);
	     System.out.println("Total: R$ " + total);
	
	     input.close();

	}

}
