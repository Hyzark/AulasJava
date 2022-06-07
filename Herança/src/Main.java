
public class Main {

	public static void main(String[] args) { //EXECUÇÃO DO CONCEITO DE HERANÇA
		
		Veiculo v1 = new Veiculo(); //INSTANCIANDO UM OBJETO
		
		//CHAMANDO OS MÉTODOS ATRÁVES DO "set"
		v1.setAno(1990);
		v1.setMarca("Honda");
		v1.setModelo("City");
		
		v1.imprimir();
		
		v1.buzinar();
		
		Carro caru = new Carro();//INSTANCIANDO UM OBJETO
		
		caru.setAno(1990);
		caru.setMarca("Vascao");
		caru.setModelo("Manchester City");
		caru.setQuatroPortas(true);
		caru.imprimir();

		Caminhao ca = new Caminhao();//INSTANCIANDO UM OBJETO
		
		ca.setAno(2000);
		ca.setModelo("pog");
		
		
		
		ca.setMarca("shh nao grita");
		ca.buzinar();
		ca.imprimir();
		
		Moto moto = new Moto();//INSTANCIANDO UM OBJETO
		
		moto.setAno(1990);
		moto.setMarca("Vascao");
		moto.setModelo("Manchester City");
		moto.imprimir();
		moto.buzinar();
		moto.dargrau();
		


	}

}
