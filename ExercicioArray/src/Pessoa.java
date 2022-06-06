
public class Pessoa {

String nome;
String idade;
Endereço en;
Sexo sexo;
	
public Pessoa() {
	
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getIdade() {
	return idade;
}
public void setIdade(String idade) {
	this.idade = idade;
}
public Endereço getEn() {
	return en;
}
public void setEn(Endereço en) {
	this.en = en;
}
public void setSexo(Sexo sexo) {
	this.sexo = sexo;
}

@Override
public String toString() {
	return ("Cadastro: " + nome + ", idade: " + idade + " , sexo: " + sexo + en.toString());
}

public Pessoa(String texto) {
	String[] arrayAuxiliar1 = texto.split(",");
	String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
	nome = arrayAuxiliar2[1].trim();

	String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
	idade = arrayAuxiliar3[1].trim();
	
	String[] arrayAuxiliar4 = arrayAuxiliar1[2].split(":");
	sexo = Sexo.valueOf(arrayAuxiliar4[1].trim());
	
	
	Endereço lol = new Endereço(texto);
	en = lol;
	}


}



