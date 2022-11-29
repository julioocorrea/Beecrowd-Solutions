package MaratonaDeProgamacao;

import java.util.Scanner;

public class HoraDaCorrida_2968 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double porcentagem = 0;
			int V = input.nextInt();
			int N = input.nextInt();
			
			int totalDePlacas = V * N;
			
			for (double i = 10; i <= 90; i += 10) {
				porcentagem = i * totalDePlacas / 100;	
				if (i == 90) {
					System.out.print((int)Math.ceil(porcentagem) + "\n");
				} else {
					System.out.print((int)Math.ceil(porcentagem) + " ");
				}
			}
						
			input.close();
			
		}
}
