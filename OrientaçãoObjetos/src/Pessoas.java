
public class Pessoas { //INSTANCIANDO UMA CLASSE

	//ATRIBUTOS
	String nome; 
	int nume_figu;

	//MÉTODOS
	void //DEFININDO O TIPO DE RETORNO DO MÉTODO COMO VOID(SEM RETORNO)
		receber(int nume_figu, Pessoas pessoa) {
		pessoa.nume_figu += nume_figu;

	}

	boolean //DEFININDO O TIPO DE RETORNO DO MÉTODO COMO BOOLEAN(TRUE OR FALSE)
		dar(int nume_figu, Pessoas pessoa) { 
		//boolean msg;

		//ESTRUTURA CONDICIONAL
		if (this.nume_figu < nume_figu) {
			System.out.println("lol");
			return false;//BOOLEAN
		} else {
			this.nume_figu -= nume_figu;
			pessoa.receber(nume_figu, pessoa);

			return true;//BOOLEAN

		}

		// if (nume_figu < pessoa.nume_figu) {

		// this.nume_figu -= nume_figu;
		// pessoa.receber(nume_figu, pessoa);

		// System.out.println(this.nome);
		// System.out.println(this.nume_figu);

		// System.out.println(pessoa.nome);
		// System.out.println(pessoa.nume_figu);
		// msg = true;
		// } else {

		// System.out.println("Você não essa quatidade de figurinhas.");
		// msg = false;
		// }
		// return msg;
	}
}
