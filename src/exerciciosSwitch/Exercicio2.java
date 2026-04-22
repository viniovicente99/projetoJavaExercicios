package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name = "";
		String jobTitle = "";
		int code = 0;
		float raise = 0;
		float salary = 0;
		
		System.out.println("Digite o nome do Colaborador: ");
		name = input.nextLine();
		
		System.out.println("Digite o código do Colaborador: ");
		code = input.nextInt();
		
		System.out.println("Digite o salário do Colaborador: ");
		salary = input.nextFloat();
		
		switch (code) {
		case 1:
			jobTitle = "Gerente";
			raise = 10;
			break;
			
		case 2:
			jobTitle = "Vendedor";
			raise = 7;
			break;
			
		case 3:
			jobTitle = "Supervisor";
			raise = 9;
			break;
			
		case 4:
			jobTitle = "Motorista";
			raise = 6;
			break;
			
		case 5:
			jobTitle = "Estoquista";
			raise = 5;
			break;
			
		case 6:
			jobTitle = "Técnico de TI";
			raise = 8;
			break;
			
		 default:
             System.out.println("Código inválido!");
             input.close();
             return;
     }

	     double newSalary = salary + (salary * raise / 100);
	
	     System.out.println("Colaborador: " + name);
	     System.out.println("Cargo: " + jobTitle);
	     System.out.println("Novo salário R$: " + newSalary);
	
	     input.close();

	}

}
