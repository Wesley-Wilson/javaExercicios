package equipe02;
import java.util.Scanner;

public class MetodoJava02 {
	public static void main(String[]args) {
		System.out.println(soma());
	}
	
	public static int soma() {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite um numero: ");
		n2 = sc.nextInt();
		
		sc.close();
		
		return n1 + n2;
	}
}
