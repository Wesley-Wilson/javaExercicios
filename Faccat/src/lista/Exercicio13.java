
package lista;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		float media;
		
		System.out.println("Nota da primeira avaliacao: ");
		n1 = sc.nextInt();
		
		System.out.println("Nota da segunda avaliacao: ");
		n2 = sc.nextInt();
		
		System.out.println("Nota da terceira avaliacao: ");
		n3 = sc.nextInt();
		
		media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		
		System.out.println("Media final: "+media);
		
		
		sc.close();
	}
}
