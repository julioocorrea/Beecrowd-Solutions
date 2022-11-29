import java.util.Scanner;

public class URI1049 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			String A, B, C;
			A = input.next();
			B = input.next();
			C = input.next();
			
			if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
				System.out.println("aguia");
			}
			if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
				System.out.println("pomba");
			}
			if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
				System.out.println("homem");
			}
			if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
				System.out.println("vaca");
			}
			if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
				System.out.println("pulga");
			}
			if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
				System.out.println("vaca");
			}
			if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
				System.out.println("sanguessuga");
			}
			if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
				System.out.println("minhoca");
			}
			
							
			
			input.close();
		}
}
