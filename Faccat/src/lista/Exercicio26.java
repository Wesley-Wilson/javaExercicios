package lista;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float estoqueAtual, estoqueMinimo, estoqueMaximo, media;
		
		System.out.println("Quantidade atual em estoque: ");
		estoqueAtual = sc.nextFloat();
		
		System.out.println("Limite maximo de estoque: ");
		estoqueMaximo = sc.nextFloat();
		
		System.out.println("Limite minimo de estoque: ");
		estoqueMinimo = sc.nextFloat();
		
		media = (estoqueMaximo + estoqueMinimo) / 2;
		
		if (estoqueAtual >= media) {
			System.out.println("Nao efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
		
		sc.close();
	}
}





/*
26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'.
*/