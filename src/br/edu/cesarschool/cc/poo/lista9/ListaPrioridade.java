package br.edu.cesarschool.cc.poo.lista9;

public class ListaPrioridade<T> {
	ElementoLista<T> primeiro;
	
	ElementoLista<T> irParaUltimo() {
		if (primeiro == null) {
			return null;
		}
		ElementoLista<T> ax = primeiro;
		while(ax.proximo != null) {
			ax = ax.proximo;
		}
		return ax;
	}
	
	public void adicionarNoFim(T conteudo) {
		ElementoLista<T> novo = new ElementoLista<T>(null, conteudo, 0);
		if (primeiro == null) {
			primeiro = novo;
		}
		else {
			ElementoLista<T> ultimo = irParaUltimo();
			ultimo.proximo = novo;
		}
	}
	
	public void removerUltimo() {
		if (primeiro != null) {
			if (primeiro.proximo == null) {
				primeiro = null;
			}
			else {
			ElementoLista<T> ax = primeiro;
			while(ax.proximo != null && ax.proximo.proximo != null) {
				ax = ax.proximo;
				}
			ax.proximo = null;
			}
		}
	}

	public T lerUltimo() {
		if (primeiro != null) {
			return irParaUltimo().conteudo;
		}
		return null;
	}
	public void adicionarComPrioridade(T conteudo, int prioridade) {
		ElementoLista<T> novo = new ElementoLista<T>(null, conteudo, prioridade);
		if (primeiro == null) {
			primeiro = novo;
		}
		else {
			ElementoLista<T> elemento = primeiro;
			ElementoLista<T> anterior = null;
			boolean encaixou = false;
			do {
				if (elemento.prioridade > prioridade) {
					if (anterior == null) {
						novo.proximo = primeiro;
						primeiro = novo;
					}
					else {
						anterior.proximo = novo;
						novo.proximo = elemento;
					}
					encaixou = true;
					break;
				}
				anterior = elemento;
				elemento = elemento.proximo;
			} while (elemento != null);
			if (!encaixou) {
				anterior.proximo = novo;
			}
		}
	}
}
