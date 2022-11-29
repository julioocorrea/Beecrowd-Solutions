import java.util.Scanner;

public class URI1020 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				
			int idade = input.nextInt();
			
			int idadeAnos = idade / 365;
			int sobraIdadeAnos = idade % 365;
			
			int idadeMes = sobraIdadeAnos / 30;
			int sobraIdadeMes = sobraIdadeAnos % 30;
			
			int idadeDias = sobraIdadeMes;
			
			System.out.println(idadeAnos + " ano(s)");
			System.out.println(idadeMes + " mes(es)");
			System.out.println(idadeDias + " dia(s)");
			
			
			input.close();
		}
}
