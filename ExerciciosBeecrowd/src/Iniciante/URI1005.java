import java.util.Scanner;

public class URI1005 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			double A = input.nextDouble();
			double B = input.nextDouble();
			double media = ((A * 3.5) + (B * 7.5)) / 11;
			
			System.out.println(String.format("MEDIA = %.5f", media));
			
			input.close();
		}
}
