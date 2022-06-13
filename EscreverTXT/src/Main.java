// IMPORTANDO
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//INSTÂNCIA DE UMA CLASSE
public class Main {

	public static void main(String[] args) throws IOException{
//ESCREVENDO A STRING EM UM ARQUIVO DE TXT
		String s = "TEXTOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))){//TRY ELE IRÁ EXECUTAR ESSA LINHA DE CÓDIGO E SABENDO QUE ESSA SERÁ UMA TAREFA "ARRISCADA" ELE IRÁ PERMANECER TODOS OS DADOS ANTERIORES, CASO HAJA ALGUM TIPO DE PROBLEMA NO CÓDIGO  
			escrever.write(s);

		}
		
	}

}
