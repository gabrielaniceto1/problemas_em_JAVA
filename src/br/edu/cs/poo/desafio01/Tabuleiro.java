package br.edu.cs.poo.desafio01;

class Tabuleiro {
    CasaTabuleiro inicio;
    CasaTabuleiro fim;
    int tamanho;

    boolean adicionaTabuleiroVazio(Peca peca) {
        // Tabuleiro vazio
        if (inicio == null) {
            CasaTabuleiro novaCasa = new CasaTabuleiro();
            novaCasa.peca = peca;            	
            inicio = fim = novaCasa;
            tamanho = 1;
            return true;
        }
        return false;
    }
    
    boolean adicionaAposUltima(Peca peca) {
        if (peca.esquerda == fim.peca.direita || peca.direita == fim.peca.direita) {
            CasaTabuleiro novaCasa = new CasaTabuleiro();
            novaCasa.peca = peca;        	
            fim.proximo = novaCasa;
            novaCasa.anterior = fim;
            fim = novaCasa;
            tamanho++;
            return true;
        }  
        return false;
    }
    boolean adicionaAntesPrimeira(Peca peca) {
        // Verifica se a peça pode ser adicionada antes da primeira casa
        if (peca.esquerda == inicio.peca.esquerda || peca.direita == inicio.peca.esquerda) {
            CasaTabuleiro novaCasa = new CasaTabuleiro();
            novaCasa.peca = peca;        	        	
            novaCasa.proximo = inicio;
            inicio.anterior = novaCasa;
            inicio = novaCasa;
            tamanho++;
            return true;
        }    	
        return false;
    }
    
    int incluirDoInicio(Peca peca) {
        if (adicionaTabuleiroVazio(peca)) {
            return 0;
        }    	
        // Verifica casas intermediárias
        if (peca.direita == peca.esquerda) {
	        CasaTabuleiro atual = inicio;
	        int casasPercorridas = 0;
	        while (atual.proximo != null) {
	            CasaTabuleiro seguinte = atual.proximo;
	            if ((peca.esquerda == atual.peca.direita && peca.direita == seguinte.peca.esquerda) ||
	                (peca.direita == atual.peca.direita && peca.esquerda == seguinte.peca.esquerda)) {
	                CasaTabuleiro novaCasa = new CasaTabuleiro();
	                novaCasa.peca = peca;        		            	
	                novaCasa.anterior = atual;
	                novaCasa.proximo = seguinte;
	                atual.proximo = novaCasa;
	                seguinte.anterior = novaCasa;
	                tamanho++;
	                return tamanho - casasPercorridas + 1;
	            }
	            atual = atual.proximo;
	            casasPercorridas++;
	        }
        }     	
        if (adicionaAntesPrimeira(peca)) {
            return 2;
        }        
        if (adicionaAposUltima(peca)) {
            return 1;
        }
        return 0; // Não encaixou em lugar nenhum
    }

    int incluirDoFim(Peca peca) {
        if (adicionaTabuleiroVazio(peca)) {
            return 0;
        }
        // Verifica casas intermediárias (do fim para o início)
        if (peca.direita == peca.esquerda) {
	        CasaTabuleiro atual = fim;
	        int casasPercorridas = 0;
	        while (atual.anterior != null) {
	            CasaTabuleiro anterior = atual.anterior;
	            if ((peca.esquerda == anterior.peca.direita && peca.direita == atual.peca.esquerda) ||
	                (peca.direita == anterior.peca.direita && peca.esquerda == atual.peca.esquerda)) {
	                CasaTabuleiro novaCasa = new CasaTabuleiro();
	                novaCasa.peca = peca;	            	
	                novaCasa.proximo = atual;
	                novaCasa.anterior = anterior;
	                anterior.proximo = novaCasa;
	                atual.anterior = novaCasa;
	                tamanho++;
	                return tamanho - casasPercorridas + 1;
	            }
	            atual = atual.anterior;
	            casasPercorridas++;
	        }
        }        
        if (adicionaAposUltima(peca)) {
            return 2;
        }        
        if (adicionaAntesPrimeira(peca)) {
            return 1;
        }                
        return 0; // Não encaixou em lugar nenhum
    }
}