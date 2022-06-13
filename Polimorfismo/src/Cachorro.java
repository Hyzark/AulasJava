
public class Cachorro extends Animal{
//APLICANDO O CONCEITO DE POLIMORFISMO, FAZENDO UM OVERRIDE NO MÉTODO "falar" PARA QUE ELE TENHA UMA OUTRA FUNÇÃO 
	@Override
	public void falar() {
		
		System.out.println("AU AU :3");
	}
	public void morder() {
		System.out.println("grr, nhac");
	}
	
	

}
