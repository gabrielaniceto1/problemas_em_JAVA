package exemplos1;
import java.util.Scanner;

public class ProgramaElipse {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		System.out.println("Digite, respectivamente, o raio maior e o raio menor da elipse");
		double raioMaior = INPUT.nextDouble();
		double raioMenor = INPUT.nextDouble();
		Elipse elipse1 = new Elipse(raioMaior, raioMenor);
		System.out.println(elipse1.calcularArea());
		System.out.println(elipse1.calcularPerimetro());
		INPUT.close();
	}
}
