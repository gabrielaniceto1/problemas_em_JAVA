package exemplos1;

public class ContaBancaria {
	String numeroConta;
	double saldo = 0;
	ContaBancaria(String numeroConta, double saldo){
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	double depositar(double valor) {
		saldo += valor;
		return saldo;
	}
	boolean sacar(double valor){
		if(valor > saldo) {
			return false;
		}
		else {
			saldo -= valor;
			return true;
		}
	}

}
