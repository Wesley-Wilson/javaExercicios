package lista;
import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceo valor: ");
		c = sc.nextInt();
		
		if(b < a && c < a) {
			if(c < b) {
				System.out.println(""+c+","+b+","+a);
			}else {
				System.out.println(""+b+","+c+","+a);
			}
		} else if(a < b && c < b) {
			if(c < a) {
				System.out.println(""+c+","+a+","+b);
			}else {
				System.out.println(""+a+","+c+","+b);
			}
		} else if(a < c && b < c) {
			if(a < b) {
				System.out.println(""+a+","+b+","+c);
			}else {
				System.out.println(""+b+","+a+","+c);
			}
		}
		
		
		sc.close();
	}
}

/*
30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente.
*/