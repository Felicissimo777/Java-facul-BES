package aulapoo04;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public  Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("Modelo : " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("cor: " + this.cor);
		System.out.println("tampada: " + this.tampada);
	}

}
