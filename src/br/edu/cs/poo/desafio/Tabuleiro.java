package br.edu.cs.poo.desafio;

public class Tabuleiro {
	CasaTabuleiro inicio;
	CasaTabuleiro fim;
	int tamanho;
	
	
	int incluirDoInicio(Peca peca) {
		//caso não tenha nada na lista
		if(inicio == null) {
			inicio = new CasaTabuleiro();
			inicio.peca = peca;
			inicio.anterior = null;
			inicio.proximo = null;
			fim = inicio;
			tamanho++;
			return 0;
		}
		//caso tenha apenas 1 elementro na lista
		if(inicio == fim) {
			CasaTabuleiro atual = new CasaTabuleiro();
			atual.peca = peca;
			if(peca.esquerda == inicio.peca.direita) {
				inicio.proximo = atual;
				atual.anterior = inicio;
				atual.proximo = null;
				fim = atual;
				tamanho++;
				return 1;
			}
			else if(peca.direita == inicio.peca.direita) {
				CabecaPeca temp = atual.peca.direita;
				atual.peca.direita = atual.peca.esquerda;
				atual.peca.esquerda = temp;
				
				inicio.proximo = atual;
				atual.anterior = inicio;
				atual.proximo = null;
				fim = atual;
				tamanho++;
				return 1;
			}
			else if(peca.esquerda == inicio.peca.esquerda) {
				CabecaPeca temp = inicio.peca.esquerda;
				inicio.peca.esquerda = inicio.peca.direita;
				inicio.peca.direita = temp;
				
				inicio.proximo = atual;
				atual.anterior = inicio;
				atual.proximo = null;
				fim = atual;
				tamanho++;
				return 1;
			}
			else if(peca.direita == inicio.peca.esquerda) {
				CabecaPeca temp = atual.peca.direita;
				atual.peca.direita = atual.peca.esquerda;
				atual.peca.esquerda = temp;
				
				CabecaPeca temp2 = inicio.peca.esquerda;
				inicio.peca.esquerda = inicio.peca.direita;
				inicio.peca.direita = temp2;
				
				inicio.proximo = atual;
				atual.anterior = inicio;
				atual.proximo = null;
				fim = atual;
				tamanho++;
				return 1;
			}
		}
		//caso seja uma carroça e pode inserir no meio
		else if(peca.direita == peca.esquerda) {
			CasaTabuleiro aux = inicio;
			int cont = 0;
			while(aux.proximo != null) {
				CasaTabuleiro next = aux.proximo;
				if(peca.direita == aux.peca.direita && next.peca.esquerda == peca.direita) {
					CasaTabuleiro atual = new CasaTabuleiro();
					atual.peca = peca;
					
					atual.anterior = aux;
					atual.proximo = next;
					
					aux.proximo = atual;
					next.anterior = atual;
					
					int retorno = tamanho - cont -1;
					tamanho++;
					return retorno;
				}
				cont++;
				aux = aux.proximo;
			}
		}
		else {
			//insere no inicio da lista
			if(peca.direita == inicio.peca.esquerda || 
				peca.esquerda == inicio.peca.esquerda) {
				CasaTabuleiro atual = new CasaTabuleiro();
				atual.peca = peca;
				if(peca.esquerda == inicio.peca.esquerda) {
					CabecaPeca temp = atual.peca.direita;
					atual.peca.direita = atual.peca.esquerda;
					atual.peca.esquerda = temp;
				}
				
				atual.proximo = inicio;
				atual.anterior = null;
				
				inicio.anterior = atual;
				inicio = atual;
				tamanho++;
				return 2;
			}
			//insere no fim da lista
			if(peca.direita == fim.peca.direita || 
					peca.esquerda == fim.peca.direita){
				CasaTabuleiro atual = new CasaTabuleiro();
				atual.peca = peca;
				
				if(peca.direita == fim.peca.direita) {
					CabecaPeca temp = atual.peca.direita;
					atual.peca.direita = atual.peca.esquerda;
					atual.peca.esquerda = temp;
				}
				fim.proximo = atual;
				atual.anterior = fim;
				atual.proximo = null;
				
				fim = atual;
				tamanho++;
				return 1;
			}
		}
		return 0;
	}
	int incluirDoFim(Peca peca) {
		//caso não tenha nada na lista
		if(inicio == null) {
			inicio = new CasaTabuleiro();
			inicio.peca = peca;
			inicio.anterior = null;
			inicio.proximo = null;
			fim = inicio;
			tamanho++;
			return 0;
		}
		//caso tenha apenas 1 elementro na lista
		if(inicio == fim) {
			CasaTabuleiro atual = new CasaTabuleiro();
			atual.peca = peca;
			if(peca.direita == inicio.peca.esquerda) {
				inicio.anterior = atual;
				inicio.proximo = null;
				atual.proximo = inicio;
				atual.anterior = null;
				
				inicio = atual;
				return 1;
			}
			else if(peca.esquerda == inicio.peca.esquerda) {
				CabecaPeca temp = atual.peca.direita;
				atual.peca.direita = atual.peca.esquerda;
				atual.peca.esquerda = temp;
				
				inicio.anterior = atual;
				inicio.proximo = null;
				atual.proximo = inicio;
				atual.anterior = null;
				
				inicio = atual;
				return 1;
			}
			else if(peca.direita == inicio.peca.direita) {
				CabecaPeca temp = inicio.peca.direita;
				inicio.peca.direita = inicio.peca.esquerda;
				inicio.peca.esquerda = temp;
				
				inicio.anterior = atual;
				inicio.proximo = null;
				atual.proximo = inicio;
				atual.anterior = null;
				
				inicio = atual;
				return 1;
			}
			else if(peca.esquerda == inicio.peca.direita) {
				CabecaPeca temp = atual.peca.direita;
				atual.peca.direita = atual.peca.esquerda;
				atual.peca.esquerda = temp;
				
				CabecaPeca temp2 = inicio.peca.direita;
				inicio.peca.direita = inicio.peca.esquerda;
				inicio.peca.esquerda = temp2;
				
				inicio.anterior = atual;
				inicio.proximo = null;
				atual.proximo = inicio;
				atual.anterior = null;
				
				inicio = atual;
				return 1;
			}
		}
		//caso seja uma carroça e pode inserir no meio
		else if(peca.direita == peca.esquerda) {
			CasaTabuleiro aux = fim;
			int cont = 0;
			while(aux.anterior != null) {
				CasaTabuleiro prev = aux.anterior;
				if(peca.direita == aux.peca.esquerda && prev.peca.direita == peca.direita) {
					CasaTabuleiro atual = new CasaTabuleiro();
					atual.peca = peca;
					
					atual.anterior = prev;
					atual.proximo = aux;
					
					aux.anterior = atual;
					prev.proximo = atual;
					
					int retorno = tamanho - cont -1;
					tamanho++;
					return retorno;
				}
				cont++;
				aux = aux.anterior;
			}
		}
		
		else {
			//insere no inicio da lista
			if(peca.direita == inicio.peca.esquerda || 
					peca.esquerda == inicio.peca.esquerda) {
					CasaTabuleiro atual = new CasaTabuleiro();
					atual.peca = peca;
					if(peca.esquerda == inicio.peca.esquerda) {
						CabecaPeca temp = atual.peca.direita;
						atual.peca.direita = atual.peca.esquerda;
						atual.peca.esquerda = temp;
					}
					
					atual.proximo = inicio;
					atual.anterior = null;
					
					inicio.anterior = atual;
					inicio = atual;
					tamanho++;
					return 2;
				}
			//insere no fim da lista
			if(peca.direita == fim.peca.direita || 
					peca.esquerda == fim.peca.direita){
				CasaTabuleiro atual = new CasaTabuleiro();
				atual.peca = peca;
				
				if(peca.direita == fim.peca.direita) {
					CabecaPeca temp = atual.peca.direita;
					atual.peca.direita = atual.peca.esquerda;
					atual.peca.esquerda = temp;
				}
				fim.proximo = atual;
				atual.anterior = fim;
				atual.proximo = null;
				
				fim = atual;
				tamanho++;
				return 1;
			}
		}
		return 0;
	}
}
