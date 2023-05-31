package dataStructure;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		Scanner in = new Scanner(System.in);
		
		int option, res = 1;
		
		
		while(res == 1){
			System.out.println("*******************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes ");
			System.out.println("3 - Retirar Cliente da Fila  ");
			System.out.println("0 - Sair  ");
			System.out.println("*******************************************");
			System.out.println("Entre com a opção desejada:  ");
			option = in.nextInt();
			
			
			switch (option) {
			case 1:
				System.out.println("Digite o nome");
				String name;
				name = in.next();
				fila.add(name);
				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				System.out.println("\nCliente " + fila);
				break;

			case 3:
				if(fila.size() == 0 ) {
					System.out.println("\nA fila está vazia!");
				}
				else {
					System.out.println("\nPróximo da Fila: " + fila.remove());
				}
	
				break;

			default:
				System.out.println("opção invalida");
				break;
			}
			
			System.out.println("*******************************************");
			System.out.println("[1] - Voltar ao Menu ");
			System.out.println("[0] - Sair ");
			res = in.nextInt();
			if(res == 0) {
				System.out.println("*******************************************");
				System.out.println("vai com Deus ");
			}else if (res != 1){
				System.out.println("opção invalida");
			}
			
		}
		
	
	}

}
