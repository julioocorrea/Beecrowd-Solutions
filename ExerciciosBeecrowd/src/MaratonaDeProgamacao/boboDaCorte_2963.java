package MaratonaDeProgamacao;

import java.util.Scanner;

public class boboDaCorte_2963 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] notasCandidatos = new int[N]; 
		
		for (int i = 0; i < notasCandidatos.length; i ++) {
			notasCandidatos[i] = input.nextInt();
		}
		
		boolean validacao = true;
		for (int i = 0; i < notasCandidatos.length; i ++) {	
			if (notasCandidatos[i] > notasCandidatos[0]) {
				validacao = false;
				break;
			}
		}
		
		if (validacao == true) {
			System.out.println("S");
		}
		else if (validacao == false) {
			System.out.println("N");
		}
		
		
		
		input.close();
	}	
}
