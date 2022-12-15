package lista;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		
		if (a < c && a < b) {
			if(b < c) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		} else if(b < a && b < c) {
			if(a < c){
				System.out.println(c);
			} else {
				System.out.println(a);
			} 
		} else if(c < a && c < b){
			if(a < b) {
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		}  
		
		sc.close();
	}
}

/*
28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
*/

// a < b && c
// b < c
// escreva: C maior
// senão: B maior 
// b < a && c 
// a < b
// escreva: B maior
// senão: A maior 
// c < a && b
// a < b 
// escreva: B maior
// senão> A maior 
