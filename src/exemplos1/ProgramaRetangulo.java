package exemplos1;
import java.util.Scanner;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		System.out.println("Digite respectivamente a base e altura do retangulo em questão: ");
		double base = INPUT.nextDouble();
		double altura = INPUT.nextDouble();
		
		Retangulo retangulo1 = new Retangulo(base, altura);
		
		System.out.println(retangulo1.calcularArea());
		System.out.println(retangulo1.calcularPerimetro());
		INPUT.close();
	}

}
