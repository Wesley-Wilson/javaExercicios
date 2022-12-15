package lista;

import java.util.Scanner;

public class Exercicio16 {
		
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		float maca = 1.30f;
		float macaDesconto = 1f;
		float quantidade;
		System.out.println("Quantas macas voce deseja: ");
		quantidade = sc.nextFloat();
		
		if (quantidade<12) {
			quantidade = quantidade * maca;
			System.out.printf("R$ %.2f ",quantidade);
		} else {
			quantidade = quantidade * macaDesconto;
			System.out.printf("R$ %.2f ",quantidade);
		}
		sc.close();
	}
}	

/*
16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.
*/