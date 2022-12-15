package lista;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String descFruit = " MORANGO                    MACA \n Ate 5 Kg                   Ate 5 Kg \n R$ 2,50 por Kg             R$ 1,80 por Kg \n Acima de 5 Kg              Acima de 5 Kg \n R$ 2,20 por Kg             R$ 1,50 por Kg";
		
		float morango, maca, total, desconto, totalKg;
		float morangoKg, macaKg;
		
		System.out.println(descFruit);
		System.out.println();
		System.out.print("Morango: ");
		morangoKg = sc.nextInt();
		
		System.out.print("Maca: ");
		macaKg = sc.nextInt();
		
		totalKg = morangoKg + macaKg;
		
		morango = 2.50f;
		maca = 1.80f;
		
		if (morangoKg > 5) {
			morango = 2.20f;
		} 
		
		if (macaKg > 5) {
			maca = 1.50f;
		} 
		
		total = (morango * morangoKg) + (maca * macaKg);
		
		if (total > 25 || totalKg > 8) {
			desconto = 0.10f;
			total = total - (total * desconto);
			System.out.println("Total: R$"+total);
		} else {
			System.out.println();
			System.out.println("Total: R$"+total);
		}
		
		sc.close();
		
	}
	
}

/*
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/