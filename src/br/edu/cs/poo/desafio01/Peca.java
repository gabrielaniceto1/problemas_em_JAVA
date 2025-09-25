package br.edu.cs.poo.desafio01;

class Peca {
	CabecaPeca esquerda;
	CabecaPeca direita;
	public String toString() {
		return esquerda + "|" + direita;
	}
}