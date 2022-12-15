package equipe02;

import java.util.Scanner;

public class Matriz04 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		byte [] numeros = new byte[5];
		
		for(byte i = 0; i < 5; i++) {
			System.out.println("informe o "+(i+1)+"°valor:");
			numeros[i] = sc.nextByte();
		}
		
		for (byte contadora = 0; contadora < 5; contadora++) {
			System.out.println("O "+(contadora+1)+" valor informado é: "+numeros[contadora]);
		}
		
		sc.close();
		
	}
}
