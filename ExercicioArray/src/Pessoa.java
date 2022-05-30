
public class Pessoa {

String nome;
String idade;
Endereço en;
Sexo sexo;
static int x;
	


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
	return ("Cadastro " + nome + " idade: " + idade + ", Mora na rua: " + en.rua +  " do bairro: "+ en.bairro+ " Na casa do numero: "+ en.nume + " do sexo: " + sexo);
}

public Pessoa(String texto) {
	String[] arrayAuxiliar1 = texto.split(",");
	String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
	this.nome = arrayAuxiliar2[1].trim();

	String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
	this.idade = arrayAuxiliar3[1].trim();
	
	arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
	this.en.bairro= arrayAuxiliar3[1].trim();
	arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
	this.en.nume= arrayAuxiliar3[1].trim();
	arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
	this.en.rua= arrayAuxiliar3[1].trim();
	
	String[] arrayAuxiliar4 = arrayAuxiliar1[1].split(":");
	if(arrayAuxiliar4[1] == "Masculino") {
		this.sexo = Sexo.Masculino; 
	}else {
		this.sexo = Sexo.Feminino; 
	}
}




}
