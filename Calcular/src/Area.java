
public class Area {

	//AQUI FOI UTILIZADA UMA SOBRECARGA DE METODOS, ONDE ELES SAO DIFIRENCIADOS PELOS PARAMETROS
	//SOBRECARGA EH QUASE QUE UM POLIMORFISMO, ONDE VOCE USA OS MESMOS METODOS PARA FAZER COISAS DIFERENTES.
	
	//PRIMEIRO METODO EH PARA CALCULAR A AREA DO QUADRADO
	double  cal(double h) {
		
		return h*h;
		
	}
	
	//PRIMEIRO METODO EH PARA CALCULAR A AREA DO TRIANGULO
	double cal ( double h, double l, double a) {
		
		return (h*l)/2;
		
	}
	
	//PRIMEIRO METODO EH PARA CALCULAR A AREA DO RETANGULO
	double  cal ( double h, double l) {
		
		return h*l;

	}

}
