package exemplos1;

public class Retangulo {
	double lado;
	double altura;
	Retangulo(double lado, double altura){
		this.lado = lado;
		this.altura = altura;
	}
	double calcularArea() {
		return lado * altura;
	}
	double calcularPerimetro(){
		return 2 * (lado + altura);
	}
}
