package lista;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[]args) {
		Scanner dp = new Scanner(System.in);
		
		short numero;
		
		System.out.println("Digite um numero: ");
		numero = dp.nextShort();
		
		if (numero>=0) {
			System.out.println(numero+" POSITIVO");
		} else {
			System.out.println(numero+" NEGATIVO");
		}
		
		dp.close();
	}
}

/*
15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
*/