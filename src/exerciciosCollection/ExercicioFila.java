package exerciciosCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userOption = 0;
		String clientName = "";
		Queue<String> line = new LinkedList<String>();
		
		do {
			
			System.out.println(
					"***************************************"
					+ "\n\n     1 - Adicionar Cliente na Fila"
					+ "\n     2 - Listar todos os Clientes"
					+ "\n     3 - Retirar Cliente da Fila"
					+ "\n     0 - Sair\n\n"
					+ "***************************************\n"
					+ "Entre com a opção desejada: "
					);
			userOption = input.nextInt();
			input.nextLine();
			
			switch (userOption) {
				case 1:
					System.out.println("\nDigite o nome do(a) Cliente: ");
					clientName = input.nextLine();
					line.add(clientName);
					
					System.out.println("\nFila: \n");
                    for (String cliente : line) {
                        System.out.println(cliente + "\n");
                    }

					System.out.println("\nCliente Adicionado!\n");
					break;
				case 2:
					if(line.isEmpty()) {
						System.out.println("\nA fila está vazia.\n");						
					} else {
						System.out.println("\nLista de Clientes na fila: \n\n");
						Iterator<String> iterator = line.iterator();
						while(iterator.hasNext()) {
							System.out.println(iterator.next() + "\n");							
						}												
					}
					break;
					
				case 3:
					if(line.isEmpty()) {
						System.out.println("\nA fila está vazia.\n");	
					} else {
						line.poll();
						System.out.println("\nFila: \n");
						Iterator<String> iterator = line.iterator();
						
						if(line.isEmpty()) {
							System.out.println("\nA fila está vazia.\n");							
						}
						
						while(iterator.hasNext()) {
							System.out.println("\n" + iterator.next() + "\n\n");							
						}
						
						System.out.println("\nO Cliente foi Chamado!\n");
					}
					break;
					
				case 0:
					System.out.println("\nPrograma encerrado!\n");
					break;					
					
				default:
					if(userOption != 0) {
						System.out.println("\nDigite uma opção válida.\n");						
					}							
			}
			
		} while(userOption != 0);	

	}

}
