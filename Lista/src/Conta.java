//INSTANCIANDO UMA CLASSE
public class Conta {
//ATRIBUTOS
	String conta;
	double valor;
	
	//MÉLETODOS
	public Conta(String conta, double valor) {
		this.conta = conta;
		this.valor = valor;
	}
//TOSTRING
	@Override
	public String toString() {
		return "Conta [conta=" + conta + ", valor=" + valor + "]";
	}

	
}
