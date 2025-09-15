package exemplos1;
import java.util.Scanner;

public class ProgramaCarro {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		Carro[] carros = new Carro[2];
		for(int i = 0; i  < carros.length; i++) {
			System.out.println("Digite a marca, modelo e ano do carro atual " + (i+1) +", respectivamente: ");
			String marca = INPUT.next();
			String modelo = INPUT.next();
			int ano = INPUT.nextInt();
			carros[i] = new Carro(marca, modelo, ano);
		}
		for(int i = 0; i  < carros.length; i++) {
			System.out.println("Agora, digite a capacidade do tanque, consumo medio na estrada e consumo medio na cidade do carro" + (i+1));
			carros[i].capacidadeDoTanque = INPUT.nextDouble();
			carros[i].consumoMedioEstrada = INPUT.nextDouble();
			carros[i].consumoMedioCidade = INPUT.nextDouble();
		}
		for(int i = 0; i  < carros.length; i++) {
			System.out.println(carros[i].calcularAutonomiaNaCidade() + " km totais foi a autonomia na cidade do carro " + (i+1));
			System.out.println(carros[i].calcularAutonomiaNaEstrada() + " km totais foi a autonomia na estrada do carro " + (i+1));
		}
		INPUT.close();
	}

}
