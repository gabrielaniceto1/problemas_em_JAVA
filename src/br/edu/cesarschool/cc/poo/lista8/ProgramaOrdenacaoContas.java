package br.edu.cesarschool.cc.poo.lista8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgramaOrdenacaoContas {
	private static final ContaPoupanca[] CONTAS = {
	        new ContaPoupanca("0021",  980.00, "Bianca", 0.5),
	        new ContaPoupanca("0109", 1500.50, "Carlos", 0.6),
	        new ContaPoupanca("0017",  250.75, "Sasha",    0.4),
	        new ContaPoupanca("0073", 3200.00, "Bruno", 0.7),
	        new ContaPoupanca("0035",  750.20, "Geovana",    0.4)
	    };
	 private static void imprimir(List<? extends ContaCorrente> lista) {
	        for (ContaCorrente c : lista) {
	            System.out.println(c.numero + " - " + c.saldo + " - " + c.correntista);
	        }
	    }
	public static void main(String[] args) {
        List<ContaPoupanca> contas = new ArrayList<>(Arrays.asList(CONTAS));

        Collections.sort(contas, new ComparadorCorrentista());
        System.out.println("== Ordenado por correntista ==");
        imprimir(contas);

        Collections.sort(contas);
        System.out.println("\n== Ordenado por número ==");
        imprimir(contas);
	}

}
