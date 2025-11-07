package br.edu.cesarschool.cc.poo.lista8;

public class ContaPoupanca extends ContaCorrente {
	double juros;
	public ContaPoupanca(String numero, double saldo, String correntista,
			double juros) {
		super(numero, saldo, correntista);
		this.juros = juros;
	}
	void render() {
		double rendimento = saldo*juros/100.0;
		super.creditar(rendimento);
	}
}