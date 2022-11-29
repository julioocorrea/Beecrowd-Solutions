import java.util.Scanner;

public class URI1009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String nome = input.nextLine();
		double salario = input.nextDouble();
		double vendas = input.nextDouble();
		double salarioFinal = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n" , salarioFinal);
		
		input.close();
	}
}
