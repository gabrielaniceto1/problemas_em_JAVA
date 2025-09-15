package exemplos1;
import java.util.Scanner;

public class JavaEstruturado3 {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		double numeroFinal = 0;
		while(true) {
			double numero = INPUT.nextDouble();
			if(numero >= 5 && numero <= 5000) {
				numeroFinal += numero;
			}
			else if(numero < 0) {
				break;
			}
		}
		System.out.println(numeroFinal);
		INPUT.close();
	}

}
