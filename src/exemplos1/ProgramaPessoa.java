package exemplos1;
import java.util.Scanner;
import java.time.LocalDate;

public class ProgramaPessoa {

	public static void main(String[] args) {
		final Scanner INPUT = new Scanner(System.in);
		while(true) {
			System.out.println("Digite seu nome");
			String nome = INPUT.next();
			
			System.out.print("Digite a data de nascimento (formato: yyyy-MM-dd): ");
			String dataNascimento = INPUT.next();
			
			System.out.println("Digite sua altura");
			double altura = INPUT.nextDouble();
			
			if(altura <= 0) {
				break;
			}
			else {
				LocalDate data = LocalDate.parse(dataNascimento);
				String dataObjetiva = "2020-01-01";
				LocalDate dataEspecifica = LocalDate.parse(dataObjetiva);
				PessoaFisica cliente = new PessoaFisica(nome, data,altura);
				System.out.println("idade atual: " + cliente.calcularIdade());
				System.out.println("idade em 01/01/2020 " + cliente.calcularIdadeNaData(dataEspecifica));
			}
		}
		INPUT.close();
		
	}

}
