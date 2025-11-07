package br.edu.cesarschool.cc.poo.lista8;

import java.util.Comparator;

public class ComparadorCorrentista implements Comparator<ContaCorrente>{

	public int compare(ContaCorrente o1, ContaCorrente o2) {
		ContaCorrente o1f = (ContaCorrente) o1;
		ContaCorrente o2f = (ContaCorrente) o2;
		if(o1f == null || o2f == null) return 0;
		return o1f.correntista.compareTo(o2f.correntista);
	}

}
