package lista;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float horaMes;
		float horaSemana;
		float diferencaHora;
		float horaExtra;
		float salarioHora;
		float salarioTotal;
		
		System.out.println("Hora mes: ");
		horaMes = sc.nextFloat();
		
		System.out.println("Salario por hora trabalhada: ");
		salarioHora = sc.nextFloat();
		
		horaSemana = horaMes / 4;
		if (horaSemana>40) {
			horaExtra = (salarioHora * 50/100)  + salarioHora;
			diferencaHora = horaSemana - 40;
			horaExtra = horaExtra * diferencaHora;
			salarioTotal = horaMes * salarioHora + horaExtra;
			System.out.println("O salario total do funcionario foi de R$"+salarioTotal);
		} else {
			salarioTotal = horaMes * salarioHora;
			System.out.println("O salario total do funcionario foi de R$"+salarioTotal);
		}
		
		sc.close();
		
	}
}


/*
22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).
*/