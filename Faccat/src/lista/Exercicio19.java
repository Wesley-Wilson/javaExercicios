package lista;
import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.println("Digite um valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite um outro valor: ");
		valor2 = sc.nextInt();
		
		if (valor1>valor2) {
			System.out.println(valor1+" Maior");
		} else {
			System.out.println(valor2+" Maior");
		}
		
		sc.close();
	}
}


/*
19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
*/