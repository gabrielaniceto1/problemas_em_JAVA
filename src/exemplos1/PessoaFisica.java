package exemplos1;
import java.time.LocalDate;

public class PessoaFisica extends Pessoa{
	double altura;
	PessoaFisica(String nome, LocalDate dataDeNascimento, double altura){
		super(nome, dataDeNascimento);
		this.altura = altura;
	}
	LocalDate obterDataDeNascimento() {
		return this.dataCriacao;
	}
}
