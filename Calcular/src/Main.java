import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		  //INSTANCIANDO UM OBJETO DO TIPO "Area"
		  Area lol = new Area();
		
		//SYSOS DANDO AO USUARIO AS OPCOES DE QUAL FORMA GEOMETRICA EH POSSIVEL CALCULAR A AREA 
		System.out.println("Escoha qual área deseja calcular");
		System.out.println();
		System.out.println("1- Quadrado");
		System.out.println("2- Triângulo");
		System.out.println("3- Retângulo");
		
		//INSTANCIANDO O SCANNER
		Scanner in = new Scanner(System.in);
		
		//CRIANDO UMA VARIAVEL PARA GUARDAR A INFO QUE O USUARIO DIGITAR 
		int m = in.nextInt();
		
		//3 IFS FORAM CRIADOS, UM PARA CALCULAR A AREA DO TIPO DE FORMA GEOMETRICA SELECIONADA PELO USUARIO 
	    if(m == 1) {
	    	
	    	//SYSO PARA PERGUNTAR AO USUARIO A ALTURA DA FORMA
	    	System.out.println("Digite a altura");
	    	//UMA VARIAVEL PARA GUARDAR A INFO DIGITADA 
			double h = in.nextDouble();
			//CHAMANDO O METODO "cal" QUE TEM COMPO FUNCIONALIDADE EXECUTAR A OPERACAO DO CALCULO DA AREA
			//CRIANDO UMA VARIAVEL PARA ATRIBUIR O RESULTADO DA EQUACAO
	    	double pog = lol.cal (h);
	    	
			
			System.out.println("O resultado eh: " + pog);
	    	//ISSO IRA SE REPETIR PARA TODOS OS ELSES IFS
	    }
	    else if(m == 2){
	    	
	    	System.out.println("Digite a altura");
			double h = in.nextDouble();
			System.out.println("Digite a largura");
			double l = in.nextDouble();
			double pog = lol.cal (h, l, 2);
	    	
	    }
	    else if(m == 3){
	    	
	    	System.out.println("Digite a altura");
			double h = in.nextDouble();
			System.out.println("Digite a largura");
			double l = in.nextDouble();
			double pog = lol.cal (h, l);
			
			System.out.println("O resultado eh: " + pog);
	    	
	    }
			
//		System.out.println("Digite a altura");
//		double h = in.nextDouble();
//		System.out.println("Digite a largura");
//		double l = in.nextDouble();
//		
//		
//		
//		
//		
//		
//		double pog = lol.cal (h);
//		
//		System.out.println("O resultado eh: " + pog);
//		
//		pog = lol.cal (h, l, 2);
//		
//		System.out.println("O resultado eh: " + pog);
//		
//		pog = lol.cal (h, l);
//		
//		System.out.println("O resultado eh: " + pog);

	}

}
