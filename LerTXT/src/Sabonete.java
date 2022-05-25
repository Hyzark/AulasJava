
public class Sabonete {

	private String cor;
	private String cheiro;

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Sabonete: com a cor " + cor + ", cheiro=" + cheiro + "\n";
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCheiro() {
		return cheiro;
	}

	public Sabonete(String cor, String cheiro) {

		this.cor = cor;
		this.cheiro = cheiro;
	}

	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}

	public Sabonete(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
	}

}
