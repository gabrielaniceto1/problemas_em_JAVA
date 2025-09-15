package exemplos1;
import java.util.Scanner;

public class Atv2 {
private static final Scanner INPUT = new Scanner(System.in);
	public static void main(String[] args) {
		double numero;
		int contador = 0;
		double[] lista = new double[100];
		do {
			numero = INPUT.nextDouble();
			if(numero >= 2 && numero <= 20) {
			lista[contador] = numero;
			contador++;
			}
		} while(numero != 1);
		for(int i = 0; i < contador; i++) {
		System.out.println(lista[i]);
		}
	}

}
