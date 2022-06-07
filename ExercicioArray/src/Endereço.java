
public class Endereço { //INSTANCIANDO UMA CLASSE

	//ATRIBUTOS
	String rua;
	String nume;
	String bairro;
	
	//CONSTRUTOR 
	public Endereço() {
	
        //MÉTODOS
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	//INSTANCIANDO UMA "toString"
	@Override
	public String toString() {
		return ( ", Mora na rua: " + rua +  " , do bairro: "+ bairro+ " , Na casa do numero: "+ nume);
	}
	public Endereço(String texto) { //CRIAÇÃO DA MATRIZ DE ENDEREÇO
		String[] arrayAuxiliar1 = texto.split(","); //INSTANCIANDO UMA ARRAY //.SPLIT SERVIRÁ PARA FAZER A QUEBRA E DAR UM DISTANCIAMENTO DOS ITENS
		String[] arrayAuxiliar2 = arrayAuxiliar1[3].split(":"); //":" SERVIRÁ PARA SEPARAR OS ITENS DA ARRAY
		rua = arrayAuxiliar2[1].trim(); //O Trim método remove da cadeia de caracteres atual todos os caracteres de espaço em branco à esquerda e à direita.

		String[] arrayAuxiliar3 = arrayAuxiliar1[4].split(":");
		nume = arrayAuxiliar3[1].trim();
		String[] arrayAuxiliar4 = arrayAuxiliar1[5].split(":");
		bairro = arrayAuxiliar4[1].trim();
		
	}
}
