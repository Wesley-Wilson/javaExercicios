package lista;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int carro;
		float salarioFixo, salarioTotal, comissaoVenda, comissaoCarroVendido ;
		
		salarioFixo = 5000;
		comissaoVenda = 3000; // 5% R$60.000,00
		comissaoCarroVendido = 300; // 300 de comissão por carro vendido
		
		System.out.println("Quantidade de carros vendido: ");
		carro = sc.nextInt();
		
		comissaoCarroVendido = comissaoCarroVendido * carro;
		comissaoVenda = comissaoVenda * carro;
		salarioTotal = salarioFixo + comissaoVenda + comissaoCarroVendido;
		
		System.out.println("Quantidade de carro vendido: "+carro);
		System.out.println("O salário final do vendedor é de R$"+salarioTotal);
		System.out.println("Incluindo salario de R$"+salarioFixo);
		System.out.println("Comissao por carro vendido (R$300,00)");
		System.out.println("Comissao de 5% sobre as vendas(R$60.000,00 cada veículo) R$ 3.000,00");
		
		sc.close();
	}
}
