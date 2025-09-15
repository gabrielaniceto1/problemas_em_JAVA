package br.edu.cesarschool.cc.poo.figurageometrica;

public class Elipse extends FiguraGeometrica{
	private double raioMenor;
	private double raioMaior;
	public Elipse(String descricao, double raioMenor, double raioMaior) {
		super(descricao);
		this.raioMenor = raioMenor;
		this.raioMaior = raioMaior;
	}
	//public String getDescricao() {
		//return super.getDescricao();
	//}
	public double getRaioMenor() {
		return raioMenor;
	}
	public void setRaioMenor(double raioMenor) {
		this.raioMenor = raioMenor;
	}
	public double getRaioMaior() {
		return raioMaior;
	}
	public void setRaioMaior(double raioMaior) {
		this.raioMaior = raioMaior;
	}
	public double calcularArea() {
		return Math.PI * raioMenor * raioMaior;
	}
	public double calcularPerimetro() {
		return Math.PI * (raioMenor + raioMaior);
	}
	
}
