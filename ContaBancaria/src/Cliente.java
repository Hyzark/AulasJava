import java.util.Objects;

public class Cliente {

	//CRIANDO VARIAVEIS DO TIPO DE EMCAPSULAMENTO "private"
	
	private String nome;
	private int cpf;
	private int numConta;
	
	//CRIANDO UM CONSTRUTOR 
	//O METODO "construtor" DETERMINA QUE ACOES DEVEM SER EXCUTADAS APOS A INSTANCIA DE UM OBEJETO
	public Cliente() {
		
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	@Override
	public String toString() {
		return "\n nome=" + nome + "\n cpf=" + cpf + "\n numConta=" + numConta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}

	
	
	
}
