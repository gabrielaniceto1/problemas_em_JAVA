package exemplos1;
import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
	double faturamento;
	int quantidadeSocios;
	PessoaJuridica(String nome, LocalDate dataDeAbertura, double faturamento, int quantidadeSocios){
		super(nome, dataDeAbertura);
		this.faturamento = faturamento;
		this.quantidadeSocios = quantidadeSocios;
	}
	LocalDate obterDataDeAbertura(){
		return this.dataCriacao;
	}
}
