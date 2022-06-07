import java.util.Scanner;
public class main {

	public static void main(String[] args) { //ENTENDENDO O CONCEITO DE MÉTODO
		
		
		
		Lampada l1 = new Lampada(false); //TODA VEZ QUE É FEITA UMA INSTANCIA DE UM OBJETO, É NECESSÁRIO QUE EXISTA UM VALOR PRÉ DEFINIDO DE ACORDO COM O PARAMETRO. ISSO OCORRE POR CONTA DO "constructor"
		
		Scanner in = new Scanner(System.in); //SCANNER PARA PEGAR AS INFOS
		
		System.out.println("A lampada está " + l1.imprimir()); //CHAMANDO O MÉTODO DE "lampada"
		System.out.println();
		
		
		System.out.println("deseja ligar a lampada?");;
		String lol = in.nextLine();
		
		// IF PARA PERGUNTAR AO USUÁRIO SE ELE QUER QUE A LAMPADA SEJA LIGADA 
		if( (lol.equals("sim"))) {
		l1.ligar();  //CHAMANDO O MÉTODO
		System.out.println("Agora ela está: " + l1.imprimir()); //CHAMANDO O MÉTODO
		System.out.println();
		System.out.println( "Deseja desligar ela novamente?");
		String lo = in.nextLine();
		// SE A CONDIÇÃO FOR TRUE, ELE IRÁ SER DIRECIONADO AO UM NOVO IF, QUE TEM COMO FUNÇÃO, PERGUNTAR SE O USUÁRIO DESEJA DESLIGAR A LAMPADA NOVAMENTE
	    if( (lo.equals("sim"))) {
		l1.desligar();  //CHAMANDO O MÉTODO
		System.out.println("Agora ela está: " + l1.imprimir()); //CHAMANDO O MÉTODO
		}
		
		}else if( (lol.equals("nao"))) { //ELSE PARA CASO A CONDIÇÃO DER FALSE
			l1.ligar(); //CHAMANDO O MÉTODO
			System.out.println("Então ela irá continuar: " + l1.imprimir()); //CHAMANDO O MÉTODO
		System.out.println("Agora ela está: " + l1.imprimir());
	}else if( (lol.equals("nao"))) { 
		l1.desligar(); //CHAMANDO O MÉTODO
		System.out.println("Então ela irá continuar: " + l1.imprimir()); //CHAMANDO O MÉTODO
		
		}
	}
}
