package dataStructure;

import java.util.Stack;
import java.util.Scanner;

public class CollectionStack {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		Scanner in = new Scanner(System.in);
		
		int option, res = 1;
		
		
		while(res == 1){
			System.out.println("*******************************************");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros ");
			System.out.println("3 - Retirar Livro da pilha  ");
			System.out.println("0 - Sair  ");
			System.out.println("*******************************************");
			System.out.println("Entre com a opção desejada:  ");
			option = in.nextInt();
			
			
			switch (option) {
			case 1:
				System.out.println("Digite o nome");
				in.nextLine();
				String name;
				name = in.nextLine();
				pilha.push(name);
				System.out.println("Livro Adicionado!");
				break;

			case 2:
				System.out.println("\nLista de Livros na Pilha " + pilha);
				break;

			case 3:
				if(pilha.size() == 0 ) {
					System.out.println("\nA Pilha está vazia!");
				}
				else {
					System.out.println("\nPróximo da Pilha: " + pilha.pop());
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
