
public class Pessoas {

	String nome;
	int nume_figu;

	void receber(int nume_figu, Pessoas pessoa) {
		pessoa.nume_figu += nume_figu;

	}

	boolean dar(int nume_figu, Pessoas pessoa) {
		//boolean msg;

		if (this.nume_figu < nume_figu) {
			System.out.println("lol");
			return false;
		} else {
			this.nume_figu -= nume_figu;
			pessoa.receber(nume_figu, pessoa);

			return true;

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

		// System.out.println("Voc� n�o essa quatidade de figurinhas.");
		// msg = false;
		// }
		// return msg;
	}
}
