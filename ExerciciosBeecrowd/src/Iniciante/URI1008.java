import java.util.Scanner;

public class URI1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroFuncionario = input.nextInt();
		int horas = input.nextInt();
		double valorHora = input.nextDouble();
		double salario =  (horas  * valorHora) ;
		
		System.out.printf("NUMBER = %d\n", numeroFuncionario );
		System.out.printf("SALARY = U$ %.2f\n" , salario);
		
		input.close();
	}
}
