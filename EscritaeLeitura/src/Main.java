import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		Jogadores bappe = new Jogadores();
		
		List<Jogadores> listaDeJogadores = new ArrayList<Jogadores>();
		
		listaDeJogadores.add(bappe);

		for (int i = 0; i < 3; i++)
			
		{
			

			System.out.println("Qual seu jogador favorito?");
			bappe.setNome(in.nextLine());
			System.out.println("Qual o numero da camisa dele?");
			bappe.setNum(in.nextInt());


			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Jogadores.txt"))) {
			
				for (Jogadores fut : listaDeJogadores) {
					escrever.write(fut.toString());
				}
			}
		}
		try (BufferedReader reader = new BufferedReader(new FileReader("Jogadores.txt"))) {
			String line;
			String fut = "";

			while ((line = reader.readLine()) != null) {
				fut += line + "\n";
				System.out.println(fut);

			}
		}
	}
}
