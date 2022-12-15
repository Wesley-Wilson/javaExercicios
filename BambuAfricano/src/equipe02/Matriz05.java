package equipe02;
import java.util.Scanner;

public class Matriz05 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		byte [][] numeros = new byte[3][3];
		
		for (byte i = 0; i < numeros.length; i++) {
			for (byte j = 0; j < 3; j++) {
				System.out.print("Informe um valor: ");
				numeros[i][j] = sc.nextByte();
			}
		}
		
		for (byte contadora = 0; contadora < numeros.length; contadora++) {
			for (byte contadora2 = 0; contadora2 < numeros[contadora].length; contadora2++) {
				System.out.print(numeros[contadora][contadora2]+" ");
				if ((numeros[contadora][contadora2] == numeros [0][2]) || (numeros[contadora][contadora2] == numeros [1][2])){
					System.out.print("\n");
				}
			}
		}
		
		sc.close();
	}	
}	
