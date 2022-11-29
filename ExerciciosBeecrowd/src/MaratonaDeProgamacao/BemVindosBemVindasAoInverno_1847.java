package MaratonaDeProgamacao;

import java.util.Scanner;

public class BemVindosBemVindasAoInverno_1847 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tempD1 = input.nextInt();
		int tempD2 = input.nextInt();
		int tempD3 = input.nextInt();
		
		if (tempD2 < tempD1 && tempD3 >= tempD2) {
			System.out.println(":)");
		}
		else if (tempD2 > tempD1 && tempD3 <= tempD2) {
			System.out.println(":(");
		}
		else if (tempD2 > tempD1 && tempD3 > tempD2 && (tempD3 - tempD2) < (tempD2 - tempD1)) {
			System.out.println(":(");
		}
		else if (tempD2 > tempD1 && tempD3 > tempD2 && (tempD3 - tempD2) >= (tempD2 - tempD1)) {
			System.out.println(":)");
		}
		else if (tempD2 < tempD1 && tempD3 < tempD2 && (tempD2 - tempD3) < (tempD1 - tempD2)) {
			System.out.println(":)");
		}
		else if (tempD2 < tempD1 && tempD3 < tempD2 && (tempD2 - tempD3) >= (tempD1 - tempD2)) {
			System.out.println(":(");
		}
		else if (tempD2 == tempD1 && tempD3 > tempD2) {
			System.out.println(":)");
		}
		else if (tempD2 == tempD1 && tempD3 < tempD2) {
			System.out.println(":(");
		}
		
		
		
		input.close();	
	}
}
