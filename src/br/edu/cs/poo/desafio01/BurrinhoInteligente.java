package br.edu.cs.poo.desafio01;

import java.util.*;

class BurrinhoInteligente {
	int tamConjunto = 28;
    Peca[] conjuntoDePecas = new Peca[tamConjunto];
    Tabuleiro tabuleiro = new Tabuleiro();
    Random random = new Random();
    Random randomSim = new Random();

    void gerarConjuntoDePecas() {
    	int i = 0;
        for (CabecaPeca esquerda : CabecaPeca.values()) {
            for (CabecaPeca direita : CabecaPeca.values()) {
                if (!pecaJaExiste(esquerda, direita)) {
                    Peca p = new Peca();
                    p.esquerda = esquerda;
                    p.direita = direita;
                    conjuntoDePecas[i++] = p;
                }
            }
        }
    }
    boolean pecaJaExiste(CabecaPeca a, CabecaPeca b) {
        for (Peca p : conjuntoDePecas) {
            if ((p != null) && ((p.esquerda == a && p.direita == b) || (p.esquerda == b && p.direita == a))) {
                return true;
            }
        }
        return false;
    }

    Peca tirarPecaAleatoria() {
        if (tamConjunto == 0) { 
        	return null;
        }
        int index = 0;
        do {
        	index = random.nextInt(tamConjunto);        
        } while(conjuntoDePecas[index] == null);
        tamConjunto--;
        Peca ax = conjuntoDePecas[index];
        conjuntoDePecas[index] = null;
        return ax;        
    }

    void devolverPeca(Peca peca) {
    	for (int i=0; i<conjuntoDePecas.length; i++) {
    		if (conjuntoDePecas[i] == null) {
    			conjuntoDePecas[i] = peca;
    			tamConjunto++;
    			break;
    		}
    	}
    }
    String escolherAleatorio() {
    	int res = random.nextInt(2);
    	if (res == 1) {
    		return "i";
    	} else {
    		return "f";
    	}
    }
    void jogar(boolean simulacao) {
    	gerarConjuntoDePecas(); 
        Scanner scanner = new Scanner(System.in);
        int jogadorAtual = 1;
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;
        int qtdRodadas = 1;
        Peca peca = tirarPecaAleatoria();
        tabuleiro.incluirDoInicio(peca);
        while (tamConjunto > 0) {     
        	System.out.println("######## RODADA " + (qtdRodadas++) + " , restam " + tamConjunto + " peças");
            if (qtdRodadas >= 100) {
                System.out.println("Quantidade de rodadas esgotada.");
                break;            	
            }        	
            System.out.println("\nJogador " + jogadorAtual + ", sua vez!");            
            String escolha = null;
            if (!simulacao) {
            	System.out.print("Deseja tentar encaixar pelo INÍCIO (i) ou pelo FIM (f)? ");
            	escolha = scanner.nextLine().trim().toLowerCase();
            } else {
            	escolha = escolherAleatorio(); 
            }
            peca = tirarPecaAleatoria();
            if (peca == null) {
                System.out.println("Não há mais peças disponíveis.");
                break;
            }
            System.out.println("Você tirou a peça [" + peca.esquerda + "|" + peca.direita + "]");
            int resultado;
            if (escolha.equals("i")) {
                resultado = tabuleiro.incluirDoInicio(peca);
            } else {
                resultado = tabuleiro.incluirDoFim(peca);
            }
            if (resultado > 0) {
                System.out.println("Peça encaixada! Pontos: " + resultado);
            } else {
                System.out.println("Não foi possível encaixar a peça. Ela volta ao conjunto.");
                devolverPeca(peca);
            }
            if (jogadorAtual == 1) {
            	pontosJogador1 += resultado;
            	jogadorAtual = 2;
            } else {
            	pontosJogador2 += resultado;
            	jogadorAtual = 1;
            }
            System.out.println("Jogador1 " + pontosJogador1 + " X " 
            		+ pontosJogador2 + " Jogador2");            
        }
        
        System.out.println("############# Fim do jogo!!");
        System.out.println("Quantidade de rodadas: " + qtdRodadas);
        System.out.println("Restaram " + tamConjunto + " peças!");
        System.out.println("O tabuleiro tem " + tabuleiro.tamanho + " peças!");
        System.out.println("PLACAR FINAL: Jogador1 " + pontosJogador1 + " X " 
        		+ pontosJogador2 + " Jogador2");  
    }
}