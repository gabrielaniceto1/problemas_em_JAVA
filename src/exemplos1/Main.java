package exemplos1;

public class Main {
	public static void main(String[] args) {
		Produto prod1 = new Produto(12, "cachorro quente", 12);
		System.out.println(prod1.valor);
		System.out.println(prod1.desconto(20));;
	}

}

