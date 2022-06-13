import java.util.Scanner;
public class Aplicacao {
//O CONCEITO DE POLIMORFISMO EH USAR UM UNICO METODO PARA FAZER DIVERSAS COISAS
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		//INSTANCIA DE OBJ
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois números");
		System.out.println();
		System.out.println("Digite o primeiro número");
		System.out.println();
		int x = in.nextInt();
		System.out.println("Digite o segundo número");
		int y = in.nextInt();
		System.out.println("Digite o terceiro número");
		int z = in.nextInt();
		int soma = matematica.somar(x, y);
		
		System.out.println("O resultado eh: " + soma);
		//APLICANDO A SOBRECARGA 
		soma = matematica.somar(x, y, 5);
		
		System.out.println("O resultado eh: " + soma);
		
		double soma2 = matematica.somar(x, y);
		
		System.out.println("O resultado eh: " + soma2);

	}

}
