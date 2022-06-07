
public class Carro extends Veiculo{ //SUBCLASSE DA CLASSE PAI "veiculo"  //É NECESSARIO USAR O COMANDO "extends" PARA QUE ELA POSSA SE TORNAR UMA SUBCLASSE
	
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	@Override
	public void imprimir() {

		System.out.println("Tem quatro portas: "+ quatroPortas);
		super.imprimir();
	}
	
	

}
