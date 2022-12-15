package lista;
import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[]args) {
		Scanner pp = new Scanner(System.in);
		
		int x, y;
		System.out.print("primeiro valor: ");
		x = pp.nextInt();
		System.out.print("segundo valor: ");
		y = pp.nextInt();
		
		if (y < x) {
			System.out.println("PRIMEIRO E MAIOR");
		} else if(x < y) {
			System.out.println("SEGUNDO E MAIOR");
		} else {
			System.out.println("NUMEROS IGUAIS");
		}
		
		pp.close();
	}
}

/*
33) Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro.
*/