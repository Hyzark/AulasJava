
public class ContaBancaria {

	private double saldo;
	private Cliente cliente;
	private double limite;
	
	
	
	
	public void depositar(double x) {
		saldo += x;
		System.out.println("Você depositou 90 reais, agora seu saldo eh:" + saldo);
	}
	
	public boolean Sacar(double x) {
		if(this.saldo>x) {
			return false;
		}
		this.saldo = x;
		return true;
		
	}

	public boolean transferir(double x, Cliente cliente2) {
		if(this.saldo<x) {
			return false;
		}
		this.saldo -= x;
		cliente2.getConta().depositar(valor);
		return true;
	}
		
		public int sacarNW(double valor) {
			if((this.saldo < valor) && (this.saldo >= limite*-1)){
				return 101;
			}else if (this.saldo >= limite *-1) {
				return 100;
			}
		}
		public int transferirNW(Cliente cliente, double valor) {
			if((this.saldo < valor) && (this.saldo >= limite*-1)){
				this.saldo-=valor;
			}else if((this.saldo < valor) && (this.saldo >= limite*-1))		{
				return 101;
			}
			this.saldo=valor;
			cliente.getConta().depositar(valor);
			return 100;
		}
	
			
		//-------------teste exeception-------------
		
		public void sacarEx(double valor) throws ContaException{
		
		    if (this.saldo < valor) {
		    	throw new ContaException("Saldo insuficiente");
			}else if(this.saldo - valor) < limite *-1){
				
				throw new ContaException("Limite insuficiente");
			}
		}
		//-----------------------------------------
		public void depositar(double valor) {
			this.saldo += valor;
		}
		
}


