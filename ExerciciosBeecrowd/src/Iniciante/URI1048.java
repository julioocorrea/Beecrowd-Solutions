import java.util.Scanner;

public class URI1048 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			double salario = input.nextDouble();
			double novoSalario = 0;
			double reajuste = 0;
			
			if (salario > 0 && salario <= 400) {
				reajuste = salario * 0.15;
				novoSalario = salario + reajuste;
				
				System.out.printf("Novo salario: %.2f\n", novoSalario);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 15 %");
			}
			else if (salario > 400 && salario <= 800) {
				reajuste = salario * 0.12;
				novoSalario = salario + reajuste;
				
				System.out.printf("Novo salario: %.2f\n", novoSalario);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 12 %");
			}
			else if (salario > 800 && salario <= 1200) {
				reajuste = salario * 0.10;
				novoSalario = salario + reajuste;
				
				System.out.printf("Novo salario: %.2f\n", novoSalario);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 10 %");
			}
			else if (salario > 1200 && salario <= 2000) {
				reajuste = salario * 0.07;
				novoSalario = salario + reajuste;
				
				System.out.printf("Novo salario: %.2f\n", novoSalario);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 7 %");
			}
			else {
				reajuste = salario * 0.04;
				novoSalario = salario + reajuste;
				
				System.out.printf("Novo salario: %.2f\n", novoSalario);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 4 %");
			}
			
			
			input.close();
		}
}
