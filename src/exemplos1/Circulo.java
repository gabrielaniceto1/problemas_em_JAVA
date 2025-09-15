package exemplos1;

public class Circulo extends Elipse{
	Circulo(double raio){
		super(raio, raio);
	}
	double obterRaio(){
		return this.raioMaior;
	}
}
