import java.util.Scanner;

public class URI1017 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int tempo = input.nextInt();
			int velocidadeMedia = input.nextInt();
			
			int distanciaPercorrida = tempo * velocidadeMedia;
			
			double combustivel = distanciaPercorrida / 12.0;
			
			System.out.printf("%.3f\n", combustivel);
			
			
			input.close();
		}
}
