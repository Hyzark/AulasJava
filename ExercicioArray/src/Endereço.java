
public class Endereço {

	String rua;
	String nume;
	String bairro;
	
	
	public Endereço() {
		
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
	
	
	@Override
	public String toString() {
		return ( ", Mora na rua: " + rua +  " , do bairro: "+ bairro+ " , Na casa do numero: "+ nume);
	}
	public Endereço(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[3].split(":");
		rua = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[4].split(":");
		nume = arrayAuxiliar3[1].trim();
		String[] arrayAuxiliar4 = arrayAuxiliar1[5].split(":");
		bairro = arrayAuxiliar4[1].trim();
		
	}
}
