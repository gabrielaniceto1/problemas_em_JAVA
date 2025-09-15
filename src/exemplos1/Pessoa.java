package exemplos1;

import java.time.LocalDate;

public class Pessoa {
	String nome;
	LocalDate dataCriacao;
	Pessoa(String nome, LocalDate dataCriacao){
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}
	int calcularIdade() {
		int agora = LocalDate.now().getYear();
		return agora - dataCriacao.getYear();
	}
	int calcularIdadeNaData(LocalDate data) {
		return data.getYear() - dataCriacao.getYear();
	}
}
