package lista;
import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[]args) {
		Scanner johnny = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.println("Medidas do triangulo");
		System.out.println("valor de a:");
		a = johnny.nextFloat();
		
		System.out.println("valor de b:");
		b = johnny.nextFloat();
		
		System.out.println("valor de c:");
		c = johnny.nextFloat();
		
		// a b+c , b a+c , c b+a 		
		if (a < b+c && a < a+c && c < b+a) {
			System.out.println("as medidas formam um triangulo");
		} else {
			System.out.println("as medidas nao formam um triangulo");
		}
				
		johnny.close();
	}
}

/*
31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados.
*/
