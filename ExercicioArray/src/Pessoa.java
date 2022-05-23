
public class Pessoa {

String nome;
int idade;
Endereço en;
Sexo sexo;
static int x;
	


public Pessoa() {
	x++;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
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
	return ("Cadastro "+ x +" " + nome + " idade: " + idade + ", Mora na rua: " + en.rua +  " do bairro: "+ en.bairro+ " Na casa do numero: "+ en.nume + " do sexo: " + sexo);
}




}
