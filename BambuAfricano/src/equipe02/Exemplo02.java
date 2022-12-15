package equipe02;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println(nome);
		System.out.println(valor);
		sc.close();
	}
}
