package lista;

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		
		valor = valor % 2;
		
		if(valor==0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}

/*
27) Ler um valor e escrever se é positivo, negativo ou zero.
*/