package exemplos1;
import java.util.Scanner;

public class JavaEstruturado1 {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		int numero = INPUT.nextInt();
		if(numero < 0) {
			System.out.println("MENOR QUE ZERO");
		}
		else if(numero > 16) {
			System.out.println("OVERFLOW");
		}
		else {
			for(int i = numero - 1; i >= 1; i--) {
				numero *= i;
			}
			System.out.println(numero);
		}
		INPUT.close();
	}

}
