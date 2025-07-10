package QUESTÃOFILA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QUESTAO01 {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();	
		Scanner scanner = new Scanner (System.in);
		int opcao;
		do {
			System.out.println("=== Menu ===");
			System.out.println("1. Abrir chamado ");
			System.out.println("2. Remover ");
			System.out.println("3. Sair ");
			System.out.println("Escolha uma opção");
			opcao = scanner.nextInt();
			scanner.nextLine();
			switch(opcao){
			
			case 1:
				System.out.println("Digite o seu nome:");
				String nome = scanner.nextLine();
				System.out.println("Digite o problema: ");
				String problema = scanner.nextLine();
				fila.add("Solicitante" + nome + "chamado " + problema);
				System.out.println("Chamado adicionado ");
				break;
			case 2:
				 if (!fila.isEmpty()) {
					 System.out.println("fila não tem chamado");
				 }else {
					 String chamado = fila.poll();
					 System.out.println("Atendendo o chamado " + chamado);
				 }
                    break;
				
			case 3:
				System.out.println("Encerrando o atendimento...");
				System.out.println("Restante dos chamados " + fila.peek());
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
			
			}while(opcao!= 3);
			
			scanner.close();		
		
	}
}
		


