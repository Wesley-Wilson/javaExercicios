package lista;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sexo;
		float pesoIdeal;
		float altura;
		
		System.out.println(" 1-Masculino: M \n 2-Feminino: F");
		sexo = sc.nextInt();
		
		if (sexo==1) {
			System.out.println("Altura: ");
			altura = sc.nextFloat();
			pesoIdeal = (72.7f * altura) - 58;
			System.out.println(" Sexo: "+sexo+"\n Peso ideal: "+pesoIdeal+"kg");
		} else {
			System.out.println("Altura: ");
			altura = sc.nextFloat();
			pesoIdeal = (62.1f * altura) - 44.7f;
			System.out.println(" Sexo: "+sexo+"\n Peso ideal: "+pesoIdeal+"kg");
		}
		
		sc.close();
		
		
	}
}
