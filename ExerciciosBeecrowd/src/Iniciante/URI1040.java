import java.util.Scanner;

public class URI1040 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			double N1 = (input.nextDouble() * 2) / 10;
			double N2 = (input.nextDouble() * 3) / 10;
			double N3 = (input.nextDouble() * 4) / 10;
			double N4 = (input.nextDouble() * 1) / 10;
			double N5;
			
			double media = N1 + N2 + N3 + N4;
			System.out.printf("Media: %.1f\n" , media);
			
			if (media >= 7.0) {
				System.out.println("Aluno aprovado.");
			}
			else if (media < 5.0) {
				System.out.println("Aluno reprovado.\n");
			}
			else if (media >= 5.0) {
				System.out.println("Aluno em exame.\n");
				
				N5 = input.nextDouble();
				System.out.printf("Nota do exame: %.1f\n", N5);
				
				media = (media + N5) / 2;
				
				if (media >= 5.0) {
					System.out.println("Aluno aprovado.");
				}
				else if (media < 5.0) {
					System.out.println("Aluno reprovado.");
				}
				
				System.out.printf("Media final: %.1f\n", media);
				
			}
			
			
			
			
			
			
			input.close();

		}
}
