package lista;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float varCelciu, varFahrenheit;
		int numero;
		
		System.out.println("Conversor de temperatura");
		System.out.println("1 para Celcius \n2 para Fahrenheit");
		numero = sc.nextInt();
		
		switch (numero) {
		case 1: {
			System.out.println("Digite os graus Celcius");
			varCelciu = sc.nextFloat();
			varCelciu = varCelciu * 1.8f + 32;
			System.out.println(varCelciu+"F");
		}
		break;
		case 2: {
			System.out.println("Digite os graus Fahrenheit");
			varFahrenheit = sc.nextFloat();
			varFahrenheit = varFahrenheit - 32 / 1.8f;
			System.out.println(varFahrenheit+"C");
		}
		break;
		default:
			System.out.println("Digito invalido");
		}
		
		sc.close();

	}
}

