package lista;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, total;
		
		System.out.println("Hora de inicio: ");
		inicio = sc.nextInt();
		
		System.out.println("Hora do termino: ");
		fim = sc.nextInt();
		
		if (inicio>fim) {
			total = (24 - inicio) + fim;
			System.out.println("O total de horas jogadas foram: "+total+"h");
		} else
			if (inicio<fim){
				total = fim - inicio;
			System.out.println("O total de horas jogadas foram: "+total+"h");
		} else 
			if (fim==inicio) {
				total = 24;
				System.out.println("O total de horas jogadas foram: "+total+"h");
			}
		
		sc.close();
	}
}
