
public class Main {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		if(cliente1.getConta().Sacar(100)==true) {
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Saque não será realizado porque seu saldo é insuficinete");
		}
		System.out.println("Seu saldo atual é de: " + cliente1.getConta());
		
		
		switch(cliente1.getConta().sacarNW(100)) {
		case 100: System.out.println("Saque realizado co sucesso");
		break;
		case 101: System.out.println("Saque reaçizado com suceso, mas voce está no limite");
		break;
		case 102: System.out.println("Operação não pode ser realizada por voce não ter limite suficiente");
		}
		
		try {
			cliente1.getConta().sacarEx(0);
		} catch (ContaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Não foi possivel realizar a operação" + e.getMessage());
		}
	}

}
