import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(BufferedReader reader = new BufferedReader(new FileReader("Entrada.TXT"))){
			String line;
			String string ="";
			
			while ((line = reader.readLine())!= null) {
				string += line + "\n";
				
			}
			System.out.println(string);
		}
		
		String teste = "Sabonete: cheiro=Azedo, cor=Verde";
		
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
		
	}

}
