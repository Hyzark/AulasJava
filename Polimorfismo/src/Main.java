//CLASSE MAIN
public class Main {

	public static void main(String[] args) {
		
//		Animal ani = new Cachorro();
//		
//		ani.falar();
//		
//		Animal lol = new Gato();
//		
//		lol.falar();
		
                //INSTANCIANDO "gato" DE GATO
		Gato gato = new Gato();
                //INSTANCIANDO CACHORRO
		Cachorro cachorro = new Cachorro();
		//APLICAÇÃO DO POLIMORFISMO NA MAIN, ONDE EU ADD UM PARÂMETRO CONTENDO A VARIÁVEL CORRESPONDENTE DA SUA CLASSE 
		falar(gato);
		falar (cachorro);
		
	}
	
	public static void falar(Animal a) {
		a.falar();
		
		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro)a;
			c.morder();
			
		}
		 
	}

}

