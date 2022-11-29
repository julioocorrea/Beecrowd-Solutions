import java.util.Scanner;

public class URI1052 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int data = input.nextInt();
			
			while (data > 0 && data <=12) {
			
			if (data == 1) {
				System.out.println("January");
				break;
			}
			else if (data == 2) {
				System.out.println("February");
				break;
			}
			else if (data == 3) {
				System.out.println("March");
				break;
			}
			else if (data == 4) {
				System.out.println("April");
				break;
			}
			else if (data == 5) {
				System.out.println("May");
				break;
			}
			else if (data == 6) {
				System.out.println("June");
				break;
			}
			else if (data == 7) {
				System.out.println("July");
				break;
			}
			else if (data == 8) {
				System.out.println("August");
				break;
			}
			else if (data == 9) {
				System.out.println("September");
				break;
			}
			else if (data == 10) {
				System.out.println("October");
				break;
			}
			else if (data == 11) {
				System.out.println("November");
				break;
			}
			else if (data == 12) {
				System.out.println("December");
				break;
			}
			
			input.close();
		}
}
}
