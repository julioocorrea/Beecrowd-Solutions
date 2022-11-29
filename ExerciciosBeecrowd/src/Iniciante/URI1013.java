import java.util.Scanner;

public class URI1013 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				
			int distancia = input.nextInt();
			double combustivel = input.nextDouble();
			
			double consumoMedio = distancia / combustivel;
			
			System.out.printf ("%.3f km/l\n", consumoMedio);
			
			input.close();
		}
}
