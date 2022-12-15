package lista;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[]args) {
		Scanner pw = new Scanner(System.in);
		
		int anoAtual, anoNascimento, idadeUsuario, diferenca;
		
		System.out.println("Ano atual: ");
		anoAtual = pw.nextInt();
		
		System.out.println("Ano de nascimento: ");
		anoNascimento = pw.nextInt();
		
		idadeUsuario = anoAtual - anoNascimento;
		
		
		
		if (idadeUsuario >= 16) {
			System.out.println("Permissao para votar: Aprovada ");
		}
		else {
			diferenca = 16 - idadeUsuario;
			System.out.println("Permissao para votar: Reprovada. Volte daqui "+diferenca+" anos.");
		}
		
		System.out.print("Voce tem "+idadeUsuario+" anos.");
		idadeUsuario = pw.nextInt();
		
		pw.close();
	}
}
