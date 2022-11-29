package MaratonaDeProgamacao;

import java.util.Scanner;

public class prefacio_1837 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int quociente = 0;
		int resto = 0;
		
		if (a >=0) {
		quociente = a / b;
		resto = a % b;
		} else {
			int x = 0;
			int y = 0;
			
			if (b < 0) {
				x = b * -1;
			} else {
				x = b;
			}
			
			for (resto = 0; resto < x; resto++) {
				y =  a - resto;
				if (y % b == 0) {
					break;
				}
			}
			
			quociente = y / b;
			
		}
		
		System.out.printf("%d %d",quociente ,resto );
		
		
		
		input.close();	
	}
}
