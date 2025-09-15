package exemplos1;
import java.util.Scanner;

public class JavaEstruturado2 {
	
	public static void main(String[] args) {
		double[] numeros = new double[5];
		final Scanner INPUT = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			numeros[i] = INPUT.nextDouble();
		}
		double somaTotal = 0, multiplicacaoTotal = 1, somaInversa = 0;
		for(int i = 0; i < 5; i++) {
			somaTotal += numeros[i];
			multiplicacaoTotal *= numeros[i];
			somaInversa += 1 / numeros[i];
		}
		System.out.println(somaTotal / numeros.length);
		System.out.println(Math.pow(multiplicacaoTotal, 1.0 / numeros.length));
		System.out.println(numeros.length / somaInversa);
		INPUT.close();
	}

}
