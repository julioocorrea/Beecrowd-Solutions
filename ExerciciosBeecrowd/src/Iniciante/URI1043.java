import java.util.Scanner;

public class URI1043 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			double A = input.nextDouble();
			double B = input.nextDouble();
			double C = input.nextDouble();
			double perimetro = A + B + C;
			double area = ((A+B) / 2) * C;
			
			if (B + C > A && A + C > B && A + B > C) {
				System.out.printf("Perimetro = %.1f" , perimetro);
			}
			else {
				System.out.printf("Area = %.1f", area);
			}
			
			input.close();
		}
}
