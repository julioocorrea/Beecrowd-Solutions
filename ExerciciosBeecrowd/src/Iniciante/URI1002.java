import java.util.Scanner;

public class URI1002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raio = input.nextDouble();
		double π = 3.14159;
		double area = π * (raio * raio);
		
		System.out.println(String.format("A=%.4f",area));
		
		input.close();
	}
}
