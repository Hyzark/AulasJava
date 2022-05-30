import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Sabonete teste = new Sabonete("Sabonete: cheiro=Azedo, cor=Verde");
		Sabonete teste1 = new Sabonete("Sabonete: cheiro=lol, cor=2");
		Sabonete teste2 = new Sabonete("Sabonete: cheiro=poggers, cor=marelo");

		List<Sabonete> listadesabonete = new ArrayList<Sabonete>(); // Apenas irá aceitar instanciar objetos do tipo
																	// "Conta"

		listadesabonete.add(teste);
		listadesabonete.add(teste1);
		listadesabonete.add(teste2);

		for (Sabonete sabonete : listadesabonete) {
			System.out.println(sabonete.toString());
		
		
			

		Sabonete sabonete2 = new Sabonete(teste);

//		try(BufferedReader reader = new BufferedReader(new FileReader("Entrada.TXT"))){
//			String line;
//			String string ="";
//			
//			while ((line = reader.readLine())!= null) {
//				string += line + "\n";
//				
//			}
//			System.out.println(string);
//		}

		System.out.println(sabonete2);
		}
	}
}
