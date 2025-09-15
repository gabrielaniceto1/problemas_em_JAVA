package exemplos1;

public class Quadrado extends Retangulo{
	Quadrado(double lado){
		super(lado, lado);
	}
	double obterLado() {
		return this.altura;
	}
}
