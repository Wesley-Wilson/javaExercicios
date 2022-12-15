package lista;
import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String time0, time1; 
		int gol0, gol1;
		
		System.out.print("Nome do time: ");
		time0 = sc.next();
		
		System.out.print("Quantidade de gols feita por "+time0+":");
		gol0 = sc.nextInt();
		
		System.out.print("Nome do time rival: ");
		time1 = sc.next();
		
		System.out.print("Quantidade de gols feita por "+time1+":");
		gol1 = sc.nextInt();
		
		if(gol1 < gol0) {
			System.out.println("Vencedor: "+time0);
		} else if(gol0 < gol1) {
			System.out.println("Vencedor: "+time1);
		} else {
			System.out.println("EMPATE");
		}
		
		
		sc.close();
	}
}


/*
32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
*/