package exemplos1;

public class Elipse {
	double raioMaior;
	double raioMenor;
	Elipse(double raioMaior, double raioMenor){
		this.raioMaior = raioMaior;
		this.raioMenor = raioMenor;
	}
	double calcularArea() {
		return Math.PI * raioMaior * raioMenor;
	}
	double calcularPerimetro() {
		return Math.PI * (raioMaior + raioMenor) * (1 + (3 * Math.pow((raioMaior - raioMenor) / (raioMaior + raioMenor), 2)) /(10 + Math.sqrt(4 - 3 * Math.pow((raioMaior - raioMenor) / (raioMaior + raioMenor), 2))));
	}
}
