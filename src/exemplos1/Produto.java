package exemplos1;

public class Produto {
	
	int id;
	String nome;
	double valor;
	
	public Produto(int id, String nome, double valor) {
		this.id = id;
		this.nome= nome;
		this.valor = valor;
	}
	public double desconto(double porcentagem) {
		double porcentagemFinal = 100 - porcentagem;
		return (this.valor * porcentagemFinal) / 100;
	}
}
