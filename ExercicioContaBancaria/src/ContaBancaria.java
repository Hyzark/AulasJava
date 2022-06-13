
public  abstract class ContaBancaria {//UMA CLASSE ABSTRATA NAO PERMITE QUE OS OBJETOS SEJAM INSTANCIDOS A PARTIR DELA

	protected double saldo = 100;
	
	
	//METODOS
	public void depositar(double x) {
		saldo += x;
		System.out.println("Você depositou 90 reais, agora seu saldo eh:" + saldo);
	}
	
	public void Sacar(double x) {
		saldo -= x;
		System.out.println("Você sacou 90 reais, agora seu saldo eh:" + saldo);
	}

	public void transferir(double x, ContaBancaria c2) {
		saldo -= x;
		c2.saldo += x;
		System.out.println("Você Transferiu 90 reais, agora seu saldo eh:" + saldo);
		
		
	}
	
	public abstract double CalcularSaldo();
		
	

}



