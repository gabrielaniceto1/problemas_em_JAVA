package br.edu.cesarschool.cc.poo.lista9;

class ElementoLista<T> {
	ElementoLista<T> proximo;
	T conteudo;
	int prioridade;
	
	ElementoLista(ElementoLista<T> proximo, T conteudo, int prioridade){
	super();
	this.proximo = proximo;
	this.conteudo = conteudo;
	this.prioridade = prioridade;
	}
}