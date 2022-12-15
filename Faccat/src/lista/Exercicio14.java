package lista;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float numero;
		
		System.out.println("Digite um valor: ");
		numero = sc.nextFloat();
		
		if (numero>10) {
			System.out.println(numero+" E MAIOR QUE 10!");
		} else {
			System.out.println(numero+" NAO E MAIOR QUE 10!");
		}
		
		sc.close();
	}
}


/*
14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!
*/