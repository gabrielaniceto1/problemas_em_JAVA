package br.edu.cs.poo.exemplo.gui;

import java.util.HashMap;
import java.util.Map;

public class EntidadeDAO {
	private Map mapa = new HashMap();
	
	public Entidade buscar(String codigo) {
		return (Entidade)mapa.get(codigo);
	}
	public boolean incluir(Entidade entidade) {
		if (buscar(entidade.getCodigo()) == null) {
			mapa.put(entidade.getCodigo(), entidade);
			return true;
		} else {
			return false;
		}
	}
	public boolean alterar(Entidade entidade) {
		if (buscar(entidade.getCodigo()) != null) {
			mapa.put(entidade.getCodigo(), entidade);
			return true;
		} else {
			return false;
		}
	}
	public boolean excluir(String codigo) {
		if (buscar(codigo) != null) {
			mapa.remove(codigo);
			return true;
		} else {
			return false;
		}
	}

}