//MAIN
public class Main {

	public static void main(String[] args) {
	//INSTANCIA DE OBJETOS 
		ContaCorrente c1 = new ContaCorrente();
		ContaInvestimento c2 = new ContaInvestimento();
		//APLICANDO OS MÉTODOS
		c1.depositar(90);
		c1.Sacar(90);
		c1.transferir(90, c2);
		
		System.out.println("Saldo total: " +  c1.CalcularSaldo());
		
		c2.depositar(90);
		c2.Sacar(90);
		c2.transferir(90, c1);
		//SYSO PARA O CONSOLE
		System.out.println("Saldo total: " + c2.CalcularSaldo());
		

	}

}
