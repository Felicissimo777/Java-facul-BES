package QUESTÃOPILHA;

import java.util.Scanner;

public class Livromain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Livro pilha = new Livro();
		int opcao;
		do {
			System.out.println("== MENU ==");
			System.out.println("1.adicionar");
			System.out.println("2.remover");
			System.out.println("3.sair");
			opcao = scanner.nextInt();
			switch(opcao) {
			
			case 1 :
				System.out.println("Digite o nome Livro");
				String nome = scanner.nextLine();
				pilha.push(opcao);
				System.out.println("Livro adicionado");
				break;
				
			case 2 : 
				if(!pilha.isEmpty()) {
				int livroremovido = pilha.pop();
				System.out.println("Livro removido " + livroremovido);
				}else {
					System.out.println("pilha está vazia");
				}
			break;
			
		
			case 3 :
				System.out.println("estudando...");
				System.out.println("O Restante dos livros " + pilha.peek());
				break;
				
				default:
					System.out.println("Opção invalida");
					break;
			}
			
			}while(opcao!=3);
		scanner.close();
	}

}
	}

}
