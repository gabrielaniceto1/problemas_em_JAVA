package exemplos1;
import java.util.Scanner;

public class ProgramaCirculo {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo em questão: ");
		double raio = INPUT.nextDouble();
		Circulo circulo1 = new Circulo(raio);
		System.out.println(circulo1.calcularArea());
		System.out.println(circulo1.calcularPerimetro());
		INPUT.close();
	}

}
