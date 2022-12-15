package lista;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[]args) {
		Scanner ee = new Scanner(System.in);
		
		int valor1;
		int valor2;
		System.out.println("Digite o primeiro valor: ");
		valor1 = ee.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = ee.nextInt();
		
		if (valor1>valor2) {
			System.out.println("Crescente "+valor2+" , "+  valor1);
		} else {
			System.out.println("Crescente "+valor1+" , "+  valor2);
		}
		ee.close();
	}
	
}


/*
20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
*/