package br.edu.cs.poo.exemplo.gui;

public class EntidadeMediator {
	private static final String CODIGO_NAO_EXISTENTE = "Código não existente";
	private EntidadeDAO dao = new EntidadeDAO();
	
	public String incluir(Entidade ent) {
		String msg = validar(ent);
		if (msg == null) {
			if (!dao.incluir(ent)) {
				msg = "Código já existente";
			}
		}
		return msg;
	}
	public String alterar(Entidade ent) {
		String msg = validar(ent);
		if (msg == null) {
			if (!dao.alterar(ent)) {
				msg = CODIGO_NAO_EXISTENTE;
			}
		}
		return msg;		
	}
	public String excluir(String codigo) {
		String msg = null;
		if (!dao.excluir(codigo)) {
			msg = CODIGO_NAO_EXISTENTE;
		}
		return msg;		
	}
	private String validar(Entidade ent) {
		if (ent.getNome() == null || ent.getNome().trim().equals("")) {
			return "Nome deve ser preenchido";
		} else if (ent.getRenda() < 0.0) {
			return "Renda deve ser maior ou igual a zero";
		} else {
			return null;
		}
	}
	public Entidade buscar(String codigo) {
		return dao.buscar(codigo);
	}
}