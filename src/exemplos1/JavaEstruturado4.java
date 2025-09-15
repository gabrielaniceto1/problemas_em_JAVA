package exemplos1;
import java.util.Scanner;

public class JavaEstruturado4 {
	static class Calculadora{
		double numero1;
		double numero2;
		Calculadora(double numero1, double numero2){
			this.numero1 = numero1;
			this.numero2 = numero2;
		}
		double soma() {
			return numero1 + numero2;
		}
		double subtracao() {
			return numero1 - numero2;
		}
		double multiplicacao() {
			return numero1 * numero2;
		}
		double divisao() {
			if(numero2 == 0) {
				return 0;
			}
			else {
				return numero1 / numero2;
			}
		}
	}
	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		while(true) {
			int opcao = INPUT.nextInt();
			double numero1 = INPUT.nextDouble();
			double numero2 = INPUT.nextDouble();
			Calculadora fim = new Calculadora(numero1, numero2);
			if(opcao == 1) {
				System.out.println(fim.soma());
				break;
			}
			else if(opcao == 2) {
				System.out.println(fim.subtracao());
				break;
			}
			else if(opcao == 3) {
				System.out.println(fim.multiplicacao());
				break;
			}
			else if(opcao == 4) {
				double valido = fim.divisao();
				if(valido == 0) {
					System.out.println("DIV ZERO");
				}
				else {
				System.out.println(valido);
				break;
				}	
			}
			else {
				System.out.println("DIGITE UM NUMERO INTEIRO VALIDO");
			}
		}
		INPUT.close();
	}

}
