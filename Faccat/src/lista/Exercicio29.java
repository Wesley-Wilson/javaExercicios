package lista;
import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite um valor para A: ");
		a = sc.nextInt();
		
		System.out.println("Digite um valor para B: ");
		b = sc.nextInt();
		
		System.out.println("Digite um valor para C: ");
		c = sc.nextInt();
		
		
		if(c < a && c < b) {
			System.out.println(a+b);
		}
		
		if(b < a && b < c) {
			System.out.println(a+c);
		}
		
		if(a < c && a < b) {
			System.out.println(c+b);
		}
		

		
		sc.close();
	}
}

//a+b, a+c, b+c
//b+a, c+a, c+b
/*
29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores.
*/