package equipe02;

import java.util.Scanner;

public class Subtracao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int numero1;
		int resultado;
		
		System.out.println("Subtracao");
		System.out.print("Digite o primeiro valor: ");
		numero = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero1 = sc.nextInt();
		
		resultado = numero - numero1;
		
		System.out.println("A diferenca de "+numero+" - "+numero1+" = "+resultado);
		sc.close();
	}
}
