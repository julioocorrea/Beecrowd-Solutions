import java.util.Scanner;

public class URI1010 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//int codPeca1 = input.nextInt();
			int numPeca1 = input.nextInt();
			double valorPeca1 = input.nextDouble();
			
			
			
			//int codPeca2 = input.nextInt();
			int numPeca2 = input.nextInt();
			double valorPeca2 = input.nextDouble();
			
			
			double valorTotalPeca1 = numPeca1 * valorPeca1;
			double valorTotalPeca2 = numPeca2 * valorPeca2;
			double valorFinal = valorTotalPeca1 + valorTotalPeca2;
			
			System.out.printf ("VALOR A PAGAR: R$ %.2f\n", valorFinal);
			
			input.close();
		}
}
