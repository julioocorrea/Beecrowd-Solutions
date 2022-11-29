import java.util.Scanner;

public class URI1006 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			double A = input.nextDouble();
			double B = input.nextDouble();
			double C = input.nextDouble();
			double media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10;
			
			System.out.println(String.format("MEDIA = %.1f", media));
			
			input.close();
		}
}
