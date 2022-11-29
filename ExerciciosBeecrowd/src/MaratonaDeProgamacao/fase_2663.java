package MaratonaDeProgamacao;

import java.util.Scanner;

public class fase_2663 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maior = 0;
		int N = input.nextInt();
		int[] Notascompetidores = new int [N];
		int candidatosAceitos = 0;
		
		int K = input.nextInt();
		
		for (int i = 0; i < Notascompetidores.length; i ++) {
			Notascompetidores[i] = input.nextInt();
		}
		
		for (int i = 0; i < Notascompetidores.length; i++) {			
			if (i == 0) {
				maior = Notascompetidores[i];
			}
			maior = Math.max(Notascompetidores[i], maior);	
		}
		for (int i = 0; i < Notascompetidores.length; i++) {			
			if (Notascompetidores[i] >= maior) {
				candidatosAceitos ++;
			}
			else if (candidatosAceitos < K) {
				maior--;
				continue;
			}
			else if (candidatosAceitos >= K) {
				break;
			}
		}
		
		System.out.println(candidatosAceitos);
		
		
		
		input.close();
	}
}
