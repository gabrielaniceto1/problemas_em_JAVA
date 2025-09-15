package exemplos1;
import java.util.Scanner;

public class ProgramaQuadrado {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		double lado = INPUT.nextDouble();
		Quadrado quadrado1 = new Quadrado(lado);
		System.out.println(quadrado1.calcularArea());
		System.out.println(quadrado1.calcularPerimetro());
		INPUT.close();
	}

}
