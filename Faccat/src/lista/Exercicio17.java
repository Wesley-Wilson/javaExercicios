package lista;

import java.util.Scanner;

public class Exercicio17 {
	
	static void media() {
		Scanner sc = new Scanner(System.in);
		int nota1;
		int nota2;
		float media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextInt();
		
		media = (nota1 + nota2) / 2;
		
		if (media>=6) {
			System.out.println("Media: "+media+" APROVADO");
		} else {
		System.out.println("Media: "+media+" REPROVADO");
		}
		
		sc.close();
	}
	
	public static void main(String[]args) {
		media();
	}
}




/*
17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.
*/