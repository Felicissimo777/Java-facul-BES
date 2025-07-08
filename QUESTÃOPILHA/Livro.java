package QUESTÃOPILHA;

public class Livro {
	private int[]livro;
	private int topo;

	public Livro() {
		
		this.livro = new int[5];
		this.topo = -1;
	}
	public void push(int elemento) {
		if(topo == livro.length -1) {
			System.out.println("ERRO! Pilha está cheia");
			return;
		}else {
			topo++;
			livro[topo] = elemento;
		}
	}
	public int pop() {
		if(estaVazia()) {
			System.out.println("Sem livro para remover, a pilha está vazia");
		}else {
			topo = livro[topo];
			System.out.println("O livro " + topo + " foi removido da pilha.");
		}
		return topo;
		
	}
	public int peek() {
		if(estaVazia()) {
			System.out.println("Nada para visualizar a pilha está vazia");
		}else {
			System.out.println("Elemento do topo é " + topo);
		}
		return topo;
		
	}
	public boolean estaVazia() {
		return topo == -1;
	}
	public boolean isEmpty() {
		return false;

}
