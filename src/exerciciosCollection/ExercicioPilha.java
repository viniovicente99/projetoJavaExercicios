package exerciciosCollection;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userOption = 0;
		String bookName = "";
		Deque<String> stack = new ArrayDeque<String>();
		
		do {
			
			System.out.println(
					"***************************************"
					+ "\n\n     1 - Adicionar Livro na pilha"
					+ "\n     2 - Listar todos os Livros"
					+ "\n     3 - Retirar Livro da pilha"
					+ "\n     0 - Sair\n\n"
					+ "***************************************\n"
					+ "Entre com a opção desejada: "
					);
			userOption = input.nextInt();
			input.nextLine();
			
			switch (userOption) {			
				case 1:
					System.out.println("\nDigite o nome do Livro: ");
					bookName = input.nextLine();
					stack.push(bookName);
					
					System.out.println("\nPilha: \n");
                    for (String book : stack) {
                        System.out.println(book + "\n");
                    }

					System.out.println("\nLivro Adicionado!\n");
					break;
					
				case 2:
					if(stack.isEmpty()) {
						System.out.println("\nA pilha está vazia.\n");						
					} else {
						System.out.println("\nLista de Livros na pilha: \n\n");
						Iterator<String> iterator = stack.iterator();
						while(iterator.hasNext()) {
							System.out.println(iterator.next() + "\n");							
						}												
					}
					break;
					
				case 3:
					if(stack.isEmpty()) {
						System.out.println("\nA pilha está vazia.\n");	
					} else {
						stack.pop();
						System.out.println("\nPilha: \n");
						Iterator<String> iterator = stack.iterator();
						
						if(stack.isEmpty()) {
							System.out.println("\nA pilha está vazia.\n");							
						}
						
						while(iterator.hasNext()) {
							System.out.println("\n" + iterator.next() + "\n\n");							
						}
						
						System.out.println("\nO Livro foi retirado da pilha!\n");
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
