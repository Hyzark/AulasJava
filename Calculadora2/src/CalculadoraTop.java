//IMPORTANTO java.util.Scanner PARA FAZER A UTILIZAÇÃO DO SCANNER
import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		
		//CRIACAO DE DUAS VARIAVEIS DO TIPO INT
		int n1;
		int n2;
		int control = 0;
		//CRIACAO DE UMA VARIAVEL DO TIPO STRING PARA A OPERACAO QUE O USUARIO DESEJA EXECUTAR O CALCULO
		String op = "";
		
		//SCANNER EH UMA CLASSE QUE RECEBE AS INFORMACOES DIGITADAS PELO TECLADO, LITERALMENTE SCANNEANDO
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a operação desejada(+, -, *, /)");
		//AS INFORMACOES DO SCANNER ESTAO SENDO ATRIBUIDAS PARA A VARIAVEL "OP"
		op = entrada.nextLine();
		
		System.out.println("Digite um valor: ");
		//AS INFORMACOES DO SCANNER ESTAO SENDO ATRIBUIDAS PARA A VARIAVEL "n1"
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o segundo valor: ");
		//AS INFORMACOES DO SCANNER ESTAO SENDO ATRIBUIDAS PARA A VARIAVEL "n2"
		n2 = Integer.parseInt(entrada.nextLine());
		
		// FORAM CRIADOS 4 IFS, UM PARA CADA TIPO DE OPERACAO.
		
		//OPERACAO ADICAO
		if (op.equals("+")) {
		
			System.out.println("O resultado da soma é: "+(n1 + n2));
			control++;
		}
		
		//OPERACAO SUBTRACAO
		if (op.equals("-")) {
			
			System.out.println("O resultado da subtração é: "+(n1 - n2));
			control++;
		}
		
		//OPERACAO MULTIPLICACAO
		if (op.equals("*")) {
			
			System.out.println("O resultado da multiplicação é: "+(n1 * n2));
			control++;
		}
		
		//OPERACAO DIVISAO 
		if (op.equals("/")) {
			
			System.out.println("O resultado da divisão é: "+(n1 / n2));
			control++;
		}
		
		// EM CASO A INFO ATRIBUIDA PRO SCANNER FOR INVALIDA, OU SEJA, NAO CORRESPONDENTE A NENHUMA CONDICAO DOS 4 IFS.
		if (control == 0) {
			System.out.println("Operação inválida, tente novamente");
		}
	
	}

}
