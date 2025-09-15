package exemplos1;

import java.util.Scanner;

public class Atv3 {
	public static double delta(double a, double b, double c) {
		double delta = (b * b) - 4 * a * c;
		return delta;
	}
	public static double raizPositiva(double a, double b, double c, double delta) {
		double raizPositiva = ((b*-1) + Math.sqrt(delta(a, b, c))) / (2*a);
		return raizPositiva;
	}
	public static double raizNegativa(double a, double b, double c, double delta) {
		double raizNegativa = ((b*-1) - Math.sqrt(delta(a, b, c))) / (2*a);
		return raizNegativa;
	}
	private static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a, b, c;
		a = INPUT.nextDouble();
		b = INPUT.nextDouble();
		c = INPUT.nextDouble();
		
		if(raizPositiva(a, b, c, delta(a, b, c)) > 0 && 
				raizNegativa(a, b, c, delta(a, b, c)) > 0) {
			System.out.println("Há duas raizes reais");
		}
		
		else if(raizPositiva(a, b, c, delta(a, b, c)) < 0 && 
				raizNegativa(a, b, c, delta(a, b, c)) < 0){
			System.out.println("Não há nenhuma raiz real");
		}
		else if(raizPositiva(a, b, c, delta(a, b, c)) < 0 || 
				raizNegativa(a, b, c, delta(a, b, c)) < 0) {
			System.out.println("Há apenas uma raiz real");
		}
		
		System.out.println(raizPositiva(a, b, c, delta(a, b, c)));
		System.out.println(raizNegativa(a, b, c, delta(a, b, c)));
	}

}
