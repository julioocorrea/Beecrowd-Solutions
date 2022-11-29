import java.util.Scanner;

public class URI1018 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				
			int valor = input.nextInt();
			
			int nota100 = valor / 100;
			System.out.println(nota100 + " nota(s) de R$ 100,00");
			valor = valor % 100;
			
			int nota50 = valor / 50;
			System.out.println(nota50 + " nota(s) de R$ 50,00");
			valor = valor % 50;
			
			int nota20 = valor / 20;
			System.out.println(nota20 + " nota(s) de R$ 20,00");
			valor = valor % 20;
			
			int nota10 = valor / 10;
			System.out.println(nota10 + " nota(s) de R$ 10,00");
			valor = valor % 10;
			
			int nota5 = valor / 5;
			System.out.println(nota5 + " nota(s) de R$ 5,00");
			valor = valor % 5;
			
			int nota2 = valor / 2;
			System.out.println(nota2 + " nota(s) de R$ 2,00");
			valor = valor % 2;
			
			int nota1 = valor / 1;
			System.out.println(nota1 + " nota(s) de R$ 1,00");
				
			input.close();
		}
}
