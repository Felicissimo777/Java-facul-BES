package pooaula05;

public class Contabanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public Contabanco(){
		saldo=0;
		status = false;
	}
	public int getnumConta() {
		return this.numConta;
	}
	public void setnumConta(int numConta) {
		this.numConta = numConta;
	}
	public String gettipo() {
		return this.tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public String getdono() {
		return this.dono;
	}
	public void setdono(String dono) {
		this.dono = dono;
	}
	public float getsaldo() {
		return this.saldo;
	}
	public void setsaldo(float saldo) {
		this.saldo= saldo;
	}
	public boolean getstatus() {
		return this.status;
	}
	public void setstatus(boolean status) {
		this.status = status;
	}
	public void estadoatual() {
		System.out.println("conta: " + this.getnumConta());
		System.out.println("tipo: " + this.gettipo());
		System.out.println("dono: " + this.getdono());
		System.out.println("saldo: " + this.getsaldo());
		System.out.println("Status: " + this.getstatus());
	}
	public void abrirconta(String tipo) {
	this.settipo(tipo);
	this.setstatus(true);
	if(this.tipo == "CC") {
		this.saldo = 50;
	}else {
		if(this.tipo== "CP") {
			this.saldo = 150;
		}
	}
}
	public void fecharconta() {
		if(saldo > 0) {
			System.out.println("Conta com dinheiro ");
		}else {
			if(saldo < 0) {
				System.out.println("Conta em débito ");
			}else {
				setstatus(false);;
			}
		}
	}
	public void depositar(float v) {
		if(this.saldo == saldo + v) {
	}else {
		System.out.print("Impossivel de depositar");
	}
}
	public void sacar(float v) {
	    if (this.status == true) { 
	        if (this.saldo > v) { 
	            this.saldo -= v; 
	            System.out.println("Saque realizado com sucesso");
	        } else {
	            System.out.println("Saldo insuficiente"); 
	        }
	}
	}
	public void pagarmensalidade() {
		float v = 0;
		if(this.tipo == "CC") {
			v = 12;
		}else if(this.tipo == "CP") {
				v = 20;
			}
		if(this.getstatus()) {
			this.setsaldo(this.getsaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getdono());
		}else {
			System.out.println("Impossivel pagar a conta");
		}
	}
}
