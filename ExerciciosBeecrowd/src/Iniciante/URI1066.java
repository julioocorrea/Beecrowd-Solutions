import java.util.Scanner;

public class URI1066 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int numero [] = new int [5];
			int par = 0;
			int impar = 0;
			int positivo = 0;
			int negativo = 0;
			
			
			
			for (int i = 0; i < 5 ; i ++) {
				numero [i] = input.nextInt();
				
				if (numero[i] % 2 == 0) {
					par++;
				}
				if (numero [i] % 2 != 0) {
					impar++;
				}
				if (numero[i] > 0) {
					positivo++;
				}
				if (numero[i] < 0) {
					negativo++;
				}
			}
			
			System.out.println(par + " valor(es) par(es)");
			System.out.println(impar + " valor(es) impar(es)");
			System.out.println(positivo + " valor(es) positivo(s)");
			System.out.println(negativo + " valor(es) negativo(s)");
			
			
			input.close();
		}
}
