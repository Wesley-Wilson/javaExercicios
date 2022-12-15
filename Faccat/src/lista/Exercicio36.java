package lista;
import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int man, manx, woman, womanx;
		
		System.out.println("1-idade masculina: ");
		man = sc.nextInt();
		
		System.out.println("2-idade masculina: ");
		manx = sc.nextInt();
		
		System.out.println("1-idade feminina: ");
		woman = sc.nextInt();
		
		System.out.println("2-idade feminina: ");
		womanx = sc.nextInt();
		
		if (manx < man) {
			if(womanx < woman) {
				System.out.println("Homem mais velho: "+man+" Mulher mais nova: "+womanx+" = "+(man+womanx));
			} else {
				System.out.println("Homem mais velho: "+man+" Mulher mais nova: "+woman+" = "+(man+woman));
			}
		}
		
		if(man < manx) {
			if(womanx < woman) {
				System.out.println("Homem mais velho: "+manx+" Mulher mais nova: "+womanx+" = "+(manx+womanx));
			} else {
				System.out.println("Homem mais velho: "+manx+" Mulher mais nova: "+woman+" = "+(manx+woman));
			}
		}
		
		if (womanx < woman) {
			if(manx < man) {
				System.out.println("Mulher mais velha: "+woman+" Homem mais novo: "+manx+" = "+(woman+manx));
			} else {
				System.out.println("Mulher mais velha: "+woman+" Homem mais novo: "+man+" = "+(woman+man));
			}
		}
		
		if(woman < womanx) {
			if(manx < man) {
				System.out.println("Mulher mais velha: "+womanx+" Homem mais novo: "+manx+" = "+(womanx+manx));
			} else {
				System.out.println("Mulher mais velha: "+womanx+" Homem mais novo: "+man+" = "+(womanx+man));
			}
		}
		
		sc.close();
	}
}


// "Homem mais novo: "+man+" Mulher mais velha: "+womanx+":"+ man+womanx

/*
36) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
novo com a mulher mais velha.
*/