package equipe02;

import java.util.Scanner;

public class Soma {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int resultado;
		System.out.print("Digite um valor: ");
		valor1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		
		System.out.println("A soma de "+valor1+" + "+valor2+" = é "+resultado);
		
		sc.close();
	}
}
