import java.util.Scanner; //IMPORTANTO java.util.Scanner PARA FAZER A UTILIZAÇÃO DO SCANNER

public class Main { //INSTANCIA DE UMA CLASSE 

	public static void main(String[] args) { //ELE EH A CHAVE FUNDAMENTAL PARA O FUNCIONAMENTO DO CODIGO

		// int x = 100;
		// double y = 200.5;
		// int a = 0;
		// double b = 0;
		short z = (short) 100000; //CASTING EXPLICITO EH QUANDO NOS MUDAMOS UMA VARIAVEL DE UM TIPO MENOS ESPECIFICO PARA UM TIPO MAIS ESPECIFICO

		// System.out.println(z);
		// System.out.println();

	    x = (int) y; //CASTING IMPLICITO EH QUANDO NOS MUDAMOS UMA VARIAVEL DE UM TIPO MAIS ESPECIFICO PARA UM TIPO MENOS ESPECIFICO
		// y = x;

		// System.out.println(y);
		// System.out.println(x);

//		int idadePessoa = 18;
//		if (idadePessoa < 18) {
//			System.out.println("lol");
//		}else
//			System.out.println("vc pode beber mn");
//		System.out.println();
//		 
//		System.out.println("vc tem " + idadePessoa);

		Scanner in = new Scanner(System.in); //SCANNER EH UMA CLASSE QUE RECEBE AS INFORMACOES DIGITADAS PELO TECLADO, LITERALMENTE SCANNEANDO
		int num = 1;

//		System.out.println("Digite um número para que eu possa auxília-lo no dia da semana");
//		num = Integer.parseInt(in.nextLine());
//
	switch (num) { //SWITCH CASE EH UMA ESTRUTURA DE CONDICAO, MUITO SEMELHANTE AO "if", POREM HÁ DIFERENCAS ENTRE ELES, JA QUE O SWITCH VAI TRATAR OS CASOS DE UMA UNICA ENTRADA, DIFERENTEMENTE DO IF, QUE NAO TE RESTRINGE A QUANTAS ENTRADAS SERAO AVALIADAS
//
		case 1: CASE EH O TESTE DA CONDICAPO
//			System.out.println("Segunda");
			break;  // BREAK PARA FECHAR O "case"
//		case 2:
//			System.out.println("Terça");
//			break;
//		case 3:
//			System.out.println("Quarta");
//			break;
//		case 4:
//			System.out.println("Quinta");
//			break;
//		case 5:
//			System.out.println("Sexta");
//		case 6:
//			System.out.println("Sabádo");
//			break;
//		case 7:
//			System.out.println("Domingo");
//			break;
		default: // DEFAULT SERVE PARA O CODIGO VA PARA UM CAMINHO DIFERENTE CASO AS CONDICOES NAO BATAM COM NENHHUM CASE
//			System.out.println("Esse número eh invalido");
//			
//		}
//			char c = 'a';
//			
//			switch (c) {
//
//			case 'a':
//				System.out.println("Segunda");
//				break;
//			case 'b':
//				System.out.println("Terça");
//				break;
//			default:
//				System.out.println("valor inválido");
//				
//			}

//			String cor;
//			
//			System.out.println("Qual a cor do farol?");
//			cor = in.next();
//			
//			
//			switch (cor) {
//
//			case "Vermelho":
//				System.out.println("Pare.");
//				break;
//			case "Amarelo":
//				System.out.println("Tenção");
//			case "Verde":
//				System.out.println("Dale mn");
//				break;
//			default:
//				System.out.println("valor inválido");
//		}

//		int x = 0;
	while(x<10) {//WHILE EH UMA ESTRUTURA CONDICONAL QUE EXECUTA SUA FUNCAO ENQUANTO O VALOR FOR CORRESPONDENTE COMA CONDICAO //ELE TESTA PRIMEIRO PARA DEPOIS FAZER A EXECUCAO, DIFERENTEMENTE DO "do"
//		System.out.println(x);
		x++; //EM OUTRAS PALAVRAS X = X + 1
//			
//		}
//		
//		x=0;
		do {//DO FAZ PARTE DA ESTRUTURA CONDICONAL "while", POREM ELE IRA EXECUTAR ANTES DE FAZER O TESTE CONDICIONAL
//			System.out.println(x);
//			x++;
//		}while(x<10);

		for(int x=0; x>-10; x--) { //FOR EH UMA ESTRUTURA CONDICONAL QUE EXECUTA ATE O VALOR DO TESTE CONDICIONAL CHEGAR AO UM CERTO VALOR DETERMINADO
//			System.out.println(x);

//		System.out.println("Selecione 'T' para consultar tabuada.");
//		System.out.println("Selecione 'O' para fazer uma operação");
//		
//		
//		String lol = "";
//		lol = in.nextLine();
//		
		if( (lol.equals("T"))) { //IF EH UMA ESTRUTURA CONDICONAL, COM O MESMO FUNCIONAMENTO DO CASE, POREM, NAO SE RESTRINGINDO AO NUMERO DE ENTRADAS 
//			int t;
//			System.out.println("Qual tabuada deseja consultar?");
//			t = Integer.parseInt(in.nextLine());
//			for(int p=0; p<=10; p++) 
//				
//				System.out.println(t + "x" + p + " = " + p*t);
//			
		}else if ( (lol.equals("O"))) { //EH COMO SE FOSSE O "senao" JA QUE ELE IRA EXECUTAR CASO O TESTE CONDICIONAL DER "false"
//			
//			System.out.println("Qual dessas operações: (+, -, *, /) você deseja realizar?");
//			String op = "";
//			op = in.nextLine();
//			System.out.println("Escolha o primeiro valor");
//			int x;
//			x = Integer.parseInt(in.nextLine());
//			System.out.println();
//			System.out.println("Escolha o segundo valor");
//			int y;
//			y = Integer.parseInt(in.nextLine());
//			
//			switch (op) {
//			
//
//			case "+":
//				
//				System.out.println("Valor da sua conta é: " + (x+y));
//				break;
//				
//			case "-":
//				
//				System.out.println("Valor da sua conta é: " + (x-y));
//				break;
//				
//			case "/":
//		
//				System.out.println("Valor da sua conta é: " + (x/y));
//				break;
//		
//			case "*":
//		
//				System.out.println("Valor da sua conta é: " + (x*y));
//				break;
//			
//			default:
//				System.out.println("valor inválido");
//	}
//}
//	
//
		double x[] = { 1, 3, 4, 6 }; //INSTANCIANDO UMA MATRIZ, QUE EH UMA COLECAO DE VARIAVEIS DE MESMO TIPO, ACESSIVEIS COM UM UNICO NOME E ARMAZENADOS CONTIGUANTAMENTE NO ARMAZENAMENTO
//
//		for (int aux = 0; aux < x.length; aux++) {
//			System.out.println("Valor indice " + aux + " = " + x[aux]);
//		}
//		String nome[] = { "Marcus", "Luizin", "Manu", "Vitao" };
//
//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "Marcus") {
//				System.out.println("Indice de Marcus eh: " + aux1);
//
//			}
//		}
//		int[] arrayInt = new int[5];
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[3];

//		arrayInt[3] = 4;
//
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("Digite um numero qualquer");
//			numero[aux2] = teclado.nextInt();
//		}
//		for  (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("Indice"+aux2+" = "+numero[aux2]);
//		}
//	
//		int[] arrayInt = new int[5];
//
//		Object[] arrayObject = new Object[4];
//
//		arrayObject[0] = 12;
//		arrayObject[1] = "Luizin";
//		arrayObject[2] = 475.594;
//		arrayObject[3] = true;
//		arrayObject[4] = arrayInt;
//
//		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
//			System.out.println("Indice " + aux2 + " = " + arrayObject[aux2]);
//		}

		int[][] arrayBidirecional = new int[5][3];

		for (int li = 0; li < arrayBidirecional.length; li++) {

			for (int co = 0; co < arrayBidirecional[0].length; co++) {
				System.out.print("Indice [" + li + "]  [" + co+ "] = " + arrayBidirecional[li][co]+" ");
				
			}
			
			System.out.println();
		}
	}
}
