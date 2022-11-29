import java.util.Scanner;

public class URI1015 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			
			double quadrado1 = (x2-x1)*(x2-x1);
			double quadrado2 = (y2-y1)* (y2-y1);
			
			double somaQuadrado = quadrado1 + quadrado2;
			
			double distancia = Math.pow(somaQuadrado, 0.5);
			
			
			System.out.printf("%.4f\n", distancia);
			
			input.close();
		}
}
