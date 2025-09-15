package exemplos1;

public class Carro {
	String marca;
	String modelo;
	int ano;
	double capacidadeDoTanque;
	double consumoMedioEstrada;
	double consumoMedioCidade;
	
	Carro(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	double calcularAutonomiaNaCidade() {
		return consumoMedioCidade * capacidadeDoTanque;
	}
	double calcularAutonomiaNaEstrada() {
		return consumoMedioEstrada * capacidadeDoTanque;
	}
}
