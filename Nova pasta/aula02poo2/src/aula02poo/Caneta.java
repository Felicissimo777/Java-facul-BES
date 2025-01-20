package aula02poo;
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
		System.out.println("Uma Caneta " + this.cor);
		System.out.println("está tampada?  " + this.tampada);
		System.out.println("está tampada?  " + this.modelo);
		System.out.println("está tampada?  " + this.ponta);
		System.out.println("está tampada?  " + this.carga);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
		
	}

}
