import java.util.Scanner;

public class URI1036 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			double A = input.nextDouble();
			double B = input.nextDouble();
			double C = input.nextDouble();
			
			if ( A <= 0 || ((B * B) - (4 * A * C)) < 0) {
				System.out.println("Impossivel calcular");
			}
			
			else {
			double raiz = ((B * B) - (4 * A * C));
			double delta = Math.pow(raiz, 0.5);
					
				
			double x1 = (-B + delta) / (2 * A);
			double x2 = (-B - delta) / (2 * A);
	
			System.out.printf("R1 = %.5f\n", x1 );
			System.out.printf("R2 = %.5f\n", x2);
			}
		
			
			
			input.close();
		}
}
