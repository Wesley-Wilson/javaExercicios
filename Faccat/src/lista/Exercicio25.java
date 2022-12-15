package lista;

import java.util.Scanner;

public class Exercicio25 {
	
	static void conta() {
		System.out.println("funciona playva");
	}
	
	public static void main(String[]args) {
		Scanner gabriel = new Scanner(System.in);
		
		float saldo, debito, credito,contaUsuario,saldoAtual;
		
		System.out.println("Insira os três digitos para acessar sua conta: ");
		contaUsuario = gabriel.nextInt();
		
		if (contaUsuario == 101) {
			conta();
		} else {
			while(contaUsuario != 202) {
				System.out.println("Conta não encontrada, tente novamente: ");
				contaUsuario = gabriel.nextInt();
				
			}
			System.out.println("Bem-vindo Gabriel!");
			System.out.println("Digite seu saldo: ");
			saldo = gabriel.nextFloat();
			System.out.println("Digite o debito: ");
			debito = gabriel.nextFloat();
			System.out.println("Digite seu credito: ");
			credito = gabriel.nextFloat();
			saldoAtual = saldo - debito + credito;
			if (saldoAtual >= 0) {
				System.out.println("R$"+saldoAtual+" POSITIVO");
			} else {
				System.out.println("R$"+saldoAtual+" NEGATIVO");
			}
			gabriel.close();
		}
		
	}
}


/*
25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
*/