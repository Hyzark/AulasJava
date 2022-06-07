
public class Lampada { //INSTANCIANDO UMA CLASSE

	private boolean ligada; //EMCAPSULAMENTO E O TIPO DA VARIAVEL
	
	
	public Lampada(boolean ligada) { //CRIAÇÃO DE UM MÉTODO //MÉTODO É EQUIVALENTE A UMA FUNÇÃO, NA DÚVIDA É UM VERBOKKKK
		
		this.ligada = ligada; //FUNÇÃO DO MÉTODO 
	}


	void ligar(){
		this.ligada = true;
		
	}
	
	void desligar(){
		this.ligada = false;
		
	}
	
	String imprimir() {
		
		if(ligada == true) 
			return "ligada";
		else
			return "Desligada";
			
		}
	}

