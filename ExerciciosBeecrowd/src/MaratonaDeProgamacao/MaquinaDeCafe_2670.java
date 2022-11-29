package MaratonaDeProgamacao;

import java.util.Scanner;

public class MaquinaDeCafe_2670 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tempo = 0;
		int A1 = input.nextInt();
		int A2 = input.nextInt();
		int A3 = input.nextInt();
		
		if ((A2 >= A3 && A2 >= A1)) {
			tempo = (A3 + A1) * 2;
		}
		else if (A3 >= A1 && (A1 + A2) <= A3) {
			tempo = (A1 * 4) + (A2 * 2);
		}
		else if (A1 >= A3 && (A3 + A2) <= A1) {
			tempo = (A3 * 4) + (A2 * 2);
		}
		else {
			tempo = (A3 + A1) * 2;
		}
		
		System.out.println(tempo);
		
		input.close();	
	}
}
