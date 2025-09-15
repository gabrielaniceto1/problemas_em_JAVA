package exemplos1;

import java.util.Scanner;

public class ProgramaContaBancaria {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		System.out.println("Digite, respectivamente, a sua conta e o seu saldo ");
		String contaBancaria = INPUT.next();
		double saldo = INPUT.nextDouble();
		ContaBancaria cliente = new ContaBancaria(contaBancaria, saldo);
		
		while(true) {
			boolean opcao;
			double valor;
			System.out.println("digite true para deposito ou false para saque e em seguida digite o valor ");
			opcao = INPUT.nextBoolean();
			valor = INPUT.nextDouble();
			if(valor <= 0) {
				break;
			}
			if(opcao == true) {
				System.out.println("Valor atualdo saldo: " + cliente.depositar(valor));
			}
			else if(opcao == false) {
				if(cliente.sacar(valor) == true) {
					System.out.println("Valor atual do saldo: " + cliente.saldo);
				}
				else {
					System.out.println("Saque não pode ser efetuado ");
				}
			}
		}
		INPUT.close();
	}

}
