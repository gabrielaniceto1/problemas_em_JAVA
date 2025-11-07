package br.edu.cesarschool.cc.poo.lista8;

public class ContaCorrente extends Conta {
	String correntista;
	public ContaCorrente(String numero, double saldo, String correntista) {
		super(numero, saldo);
		this.correntista = correntista; 
	}
}