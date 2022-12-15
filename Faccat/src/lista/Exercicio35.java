package lista;
import java.util.Scanner;

public class Exercicio35 {
	static void alcool() {
		System.out.println(" ALCOOL  R$ 2,90");
		System.out.println(" ate 20 litros, desconto de 3% por litro \n acima de 20 litros, desconto de 5% por litro");
	}
	static void gasolina() {
		System.out.println(" GASOLINA R$ 3,30");
		System.out.println(" ate 20 litros, desconto de 4% por litro \n acima de 20 litros, desconto de 6% por litro");
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		alcool();
		System.out.println();
		gasolina();
		System.out.println();
		int caso;
		
		
		System.out.print(" ALCOOL - 1 \n GASOLINA - 2 \n SELECIONAR: ");
		caso = sc.nextInt();
		
		
		switch (caso) {
		case 1: {
			float alcool = 2.90f;
			float quantidade;
			float desconto3_5;
			float diferenca;
			float desconto3 = 0.03f * alcool;
			float desconto5 = 0.05f * alcool;
			
			System.out.print("Litro: ");
			quantidade = sc.nextFloat();
			
			if (quantidade <= 20) {
				desconto3 = desconto3 * quantidade;
				alcool = (alcool * quantidade) - desconto3;
				System.out.println("Total a pagar: R$"+alcool);
				System.out.println("Desconto de 3%: R$"+desconto3);
			} else {
				diferenca = quantidade - 20;
				desconto5 = desconto5 * diferenca;
				desconto3_5 = desconto5 + 1.74f;
				alcool = (alcool * quantidade) - (desconto3_5);
				System.out.println("Total a pagar: R$"+alcool);
				System.out.println("Desconto de 5%: R$"+desconto3_5);
			}
		}
		break;
		case 2: {
			float gasolina = 3.30f;
			float quantidade;
			float desconto4_6;
			float diferenca;
			float desconto4 = 0.04f * gasolina;
			float desconto6 = 0.06f * gasolina;
			
			System.out.print("Litro: ");
			quantidade = sc.nextFloat();
			
			if (quantidade <= 20) {
				desconto4 = desconto4 * quantidade;
				gasolina = (gasolina * quantidade) - desconto4;
				System.out.println("Total a pagar: R$"+gasolina);
				System.out.println("Desconto de 4%: R$"+desconto4);
			} else {
				diferenca = quantidade - 20;
				desconto6 = desconto6 * diferenca;
				desconto4_6 = desconto6 + 2.64f;
				gasolina = (gasolina * quantidade) - (desconto4_6);
				System.out.println("Total a pagar: R$"+gasolina);
				System.out.println("Desconto de 6%: R$"+desconto4_6);	
			}
		}
		break;
		default:
			System.out.println("Digito invalido");
		}
		sc.close();
	}
}

/*
Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/