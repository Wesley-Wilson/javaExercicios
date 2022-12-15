package equipe02;


import java.util.Scanner;

public class MatrixNome {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String nome[][] = {{"amilton","bernado","cassio"}, {"wesley","wilson","santos"}};
		
		for (int i = 0; i < nome.length; i++) {
			for (int j = 0; j < nome[i].length; j++) {
				System.out.print(nome[i][j]+" ");
			}
		}
		
		sc.close();
	}
}

/*
for (byte i = 0; i < numeros.length; i++) {
			for (byte j = 0; j < 3; j++) {
				System.out.print("Informe um valor: ");
				numeros[i][j] = sc.nextByte();
			}
		}
*/