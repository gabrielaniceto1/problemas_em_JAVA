package br.edu.cesarschool.cc.poo.lista6;

public class CalculadoraAreas {
	public static double calcularArea(double lado) {
		return calcularArea((float)lado, (float)lado, 90.0f);
	}
	public static double calcularArea(double base, double altura) {
		return calcularArea((float) base, (float) altura, 90.0f);
	}
	public static double calcularArea(float base, float altura, float angulo) {
		double anguloRad = Math.toRadians(angulo);
        return base * altura * Math.sin(anguloRad);
	}
	public static double calcularArea(float raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}
