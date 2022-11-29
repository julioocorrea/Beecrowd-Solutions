import java.util.Scanner;

public class URI1038 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int codigo = input.nextInt();
			int quantidade = input.nextInt();
			double conta = 0;
			
			
			if (codigo == 1) {
				double preco = 4.00;
				conta = quantidade * preco;
			}
			else if (codigo == 2) {
				double preco = 4.50;
				conta = quantidade * preco;
			}
			else if (codigo == 3) {
				double preco = 5.00;
				conta = quantidade * preco;
			}
			else if (codigo == 4) {
				double preco = 2.00;
				conta = quantidade * preco;
			}
			else if (codigo == 5) {
				double preco = 1.5;
				conta = quantidade * preco;
			}
			
			System.out.printf("Total: R$ %.2f\n", conta);

			
			input.close();
		}
}
