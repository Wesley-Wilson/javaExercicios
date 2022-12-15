package equipe02;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int numero1;
		int multiplicacao;
		
		System.out.println("Multiplicacao");
		System.out.println("Digite o primeiro valor: ");
		numero = sc.nextInt();
		
		System.out.print("Digite outro valor: ");
		numero1 = sc.nextInt();
		
		multiplicacao = numero * numero1;
		
		System.out.println("A multiplicacao de "+numero+" X " +numero1+" = "+multiplicacao);
		
		sc.close();
	}
}
