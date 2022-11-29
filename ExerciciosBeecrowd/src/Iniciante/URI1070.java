import java.util.Scanner;

public class URI1070 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int numero = input.nextInt();
			
			for (int i = 1; i < 12 ; i = i+2) {
				System.out.println(numero + i);
			}
			
			input.close();
		}
}
