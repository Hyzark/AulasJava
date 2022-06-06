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

		List<Pessoa> listaDePessoasEscrever = new ArrayList<Pessoa>();
		List<Pessoa> listaDePessoaslida = new ArrayList<Pessoa>();

		for (int i = 0; i < 4; i++) {

			Pessoa conta = new Pessoa();
			conta.setEn(new Endereço());

			System.out.println("Qual seu nome?");
			conta.nome = in.next();
			System.out.println("Qual sua idade?");
			conta.idade = in.next();
			System.out.println("Qual é sua rua?");
			conta.en.setRua(in.next());
			System.out.println("Qual o numero da sua casa?");
			conta.en.setNume(in.next());
			System.out.println("Qual é seu bairro?");
			conta.en.setBairro(in.next());

			System.out.println("Qual seu sexo?");
			System.out.println("Digite 1 para Masculino");
			System.out.println("Digite 2 para Feminino");

			int s = in.nextInt();
			if (s == 1) {
				Sexo sexo = Sexo.Masculino; // buffer memoria temporaria rapida
				conta.setSexo(sexo);

			} else if (s == 2) {
				Sexo sexo = Sexo.Feminino;
				conta.setSexo(sexo);
			}

			listaDePessoasEscrever.add(conta);
		}
			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Entrada.txt"))) {
				for (Pessoa a : listaDePessoasEscrever){
					escrever.write(a.toString()+"\n");
				}
			}
				try (BufferedReader reader = new BufferedReader(new FileReader("Entrada.txt"))) {
					String line;

					while ((line = reader.readLine()) != null) {

						Pessoa contaler = new Pessoa(line);

						listaDePessoaslida.add(contaler);

					}
					for (Pessoa contaler : listaDePessoaslida) {
						System.out.println(contaler.toString());
					}

				}
			
		
	}
}