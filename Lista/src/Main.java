import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List lista = new ArrayList();
//
//		lista.add("Mbappe");
//		lista.add(12);
//		lista.add(true);
//		
////		for(int x=0;x<lista.size(); x++) {
////		System.out.println(lista.get(0));
////		}
//		
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		lista.remove(0);
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		lista.add(0, "def");
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		
//		System.out.println();
//		
//		lista.set(0, "ghi");
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		
//		System.out.println();
//		
//		lista.clear(); //LIMPANDO A LIST
//		if (lista.isEmpty()) {
//			System.out.println("Sua lista está vazia");
//		}
		
		Conta conta1 = new Conta("Agua", 60.00);
		Conta conta2 = new Conta("Luz", 160.00);
		//LIST EM JAVA EH UMA INTERFACE E EH IMPLEMENTADA POR ARRAYLIST, LINKEDLIST , VECTOR E STACK
		List<Conta> listaDeContas = new ArrayList<Conta>(); //Apenas irá aceitar instanciar objetos do tipo "Conta"
		//ADD OS ITENS A LISTA
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		//FAZENDO O SEPARAMENTO DOS ITENS 
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		

	}

}
