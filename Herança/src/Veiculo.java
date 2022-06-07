
public class Veiculo { //O CONCEITO DE HERANÇA É BEM SIMPLES, JÁ QUE A PROPRIA PALAVRA JA DIZ TUDO. BASICAMENTE É NECESSÁRIO QUE HAJA UMA CLASSE PAI, PARA QUE SUB CLASSES POSSAM HERDAR MÉTODOS E ATRIBUTOS DA CLASSE PAI.

	//ATRIBUTOS
	private String nome_ve;
	protected String marca;
	protected String modelo;
	protected int ano;
	
	//MÉTODOS
	public void buzinar() {
		System.out.println("BI BI");
	}
	
	public void imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: " + ano);
	}
	
	public String getNome_ve() {
		return nome_ve;
	}
	public void setNome_ve(String nome_ve) {
		this.nome_ve = nome_ve;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
