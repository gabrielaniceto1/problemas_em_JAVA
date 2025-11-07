package br.edu.cesarschool.cc.poo.lista8;

class Conta implements Comparable<Conta>{
	String numero;
	double saldo;
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	void creditar(double valor) {
		saldo += valor;
	}
	void debitar(double valor) {
		saldo -= valor;
	}
	public int compareTo(Conta outraConta) {
		return this.numero.compareTo(outraConta.numero);
	}
}