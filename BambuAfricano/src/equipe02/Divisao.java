package equipe02;

import java.util.Scanner;

public class Divisao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double numero;
		double numero1;
		double resultado;
		
		System.out.println("Divisao");
		System.out.println("Digite o primeiro valor: ");
		numero = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		numero1 = sc.nextDouble();
		
		resultado = numero / numero1;
		
		System.out.println("A divisao de "+numero+" / "+numero1+" = "+resultado);
		
		sc.close();
	}
}
