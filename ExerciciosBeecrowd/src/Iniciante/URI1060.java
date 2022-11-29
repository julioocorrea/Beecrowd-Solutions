import java.util.Scanner;

public class URI1060 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			double numero[] = new double [6];
			int pares = 0;
			
			for (int i=0; i<6;i++) {
				numero[i] = input.nextDouble();
				
				if (numero[i] > 0) {
					pares++;
				}
				
			}
			
			System.out.println(pares +  " valores positivos");
			input.close();
		}
}
