import java.util.Scanner;

public class URI1047 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int horaInicial = input.nextInt();
			int minutoInicial = input.nextInt();
			int tempoInicial = horaInicial * 60 + minutoInicial;;
			
			int horaFinal = input.nextInt();
			int minutoFinal = input.nextInt();
			int tempoFinal = horaFinal * 60 + minutoFinal;
			
			int tempoTotal = (24*60 - tempoInicial) + tempoFinal;
			
			int hora = tempoTotal / 60;
			int minuto = tempoTotal % 60;
			
			if (hora >= 24 && minuto >=1) {
				hora = hora % 24;
			}
			
			
			System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
			
			input.close();
		}
}
