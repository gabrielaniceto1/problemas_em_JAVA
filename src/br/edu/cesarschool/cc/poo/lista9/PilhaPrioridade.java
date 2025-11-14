package br.edu.cesarschool.cc.poo.lista9;

class PilhaPrioridade<T> {
	ListaPrioridade<T> pilha = new ListaPrioridade<T>();
	T ler() {
		return pilha.lerUltimo();
	}
	
	void empilhar(T conteudo) {
		pilha.adicionarNoFim(conteudo);
	}
	
	T desempilhar() {
		T ultimo = pilha.lerUltimo();
		pilha.removerUltimo();
		return ultimo;
	}
	
	void empilhar(T conteudo, int prioridade) {
		pilha.adicionarComPrioridade(conteudo, prioridade);
	}
	
}
