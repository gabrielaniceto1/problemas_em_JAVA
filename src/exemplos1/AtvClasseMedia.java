package exemplos1;
import java.util.Scanner;

public class AtvClasseMedia {
	private static final Scanner INPUT = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Digite a quantidade de faltas no semestre ");
			int faltas = INPUT.nextInt();
			if(faltas >= 15) {
				System.out.println("Aluno reprovado por faltas");
			}
			else {
				System.out.println("digite a nota 1");
				double nota1 = INPUT.nextDouble();
				System.out.println("digite a nota 2");
				double nota2 = INPUT.nextDouble();
				
				double media = (nota1 + nota2) / 2;
				
				if(media < 3) {
					System.out.println("Aluno reprovado por media inferior a 3: " + media);
				}
				else if(media >= 7) {
					System.out.println("Aluno aprovado por media: " + media);
				}
				else {
					System.out.println("Digite a nota da recuperação");
					double recuperacao = INPUT.nextDouble();
					double mediaFinal = (media + recuperacao) / 2;
					
					if(mediaFinal >= 5) {
						System.out.println("Aluno aprovado na recuperação: " + mediaFinal);
					}
					else {
						System.out.println("Aluno reprovado pos recuperação " + mediaFinal);
					}
				}
			}
	}

}
