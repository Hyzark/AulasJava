//FAZENDO AS IMPORTAÇÕES
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//INSTANCIANDO A CLASSE
public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
                //INSTANCIANDO "jogadores"
		Jogadores bappe = new Jogadores();
		//INSTANCIANDO UMA LIST DE "jogadores"
		List<Jogadores> listaDeJogadores = new ArrayList<Jogadores>();
		//ADICIONANDO A INSTÂNCIA DE JOGADORES NA LIST
		listaDeJogadores.add(bappe);

		for (int i = 0; i < 3; i++)
			
		{
			

			System.out.println("Qual seu jogador favorito?");
			bappe.setNome(in.next());
			System.out.println("Qual o numero da camisa dele?");
			bappe.setNum(in.nextInt());

                        //ESCREVENDO NO TXT
			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Jogadores.txt"))) {
			
				for (Jogadores fut : listaDeJogadores) {
					escrever.write(fut.toString());
				}
			}
		}
                //LENDO NO CONSOLE
		try (BufferedReader reader = new BufferedReader(new FileReader("Jogadores.txt"))) {
			String line;
			String fut = "";
                        //WHILE PARA FAZER A SEPARAÇÃO DAS LIST NO CONSOLE, BASICAMENTE ESTÉTICA
			while ((line = reader.readLine()) != null) {
				fut += line + "\n";
				System.out.println(fut);

			}
		}
	}
}
