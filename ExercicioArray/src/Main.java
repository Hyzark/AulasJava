import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		
		for (int i = 0; i < 2; i++) {
			
			Pessoa conta = new Pessoa();
			conta.setEn(new Endereço());
			
			System.out.println("Qual seu nome?");
			conta.nome = in.next();
			System.out.println("Qual sua idade?");
			conta.idade = in.nextInt();
			System.out.println("Qual é sua rua?");
			conta.en.setRua(in.next());
			System.out.println("Qual o numero da sua casa?");
			conta.en.setNume(in.nextInt());
			System.out.println("Qual é seu bairro?");
			conta.en.setBairro(in.next());
			
			System.out.println("Qual seu sexo?");
			System.out.println("Digite 1 para Masculino");
			System.out.println("Digite 2 para Feminino");
			
			
			int s = in.nextInt();
			if (s == 1) {
				Sexo sexo = Sexo.Masculino; // buffer memoria temporaria rapida
				conta.setSexo(sexo);
				
				
			}else if (s == 2) {
				Sexo sexo = Sexo.Feminino;
				conta.setSexo(sexo);
			}
			
			
			
			listaDePessoas.add(conta);
		}

		for (Pessoa lol : listaDePessoas) {
			System.out.println(lol);
			
			
		}
	}
}