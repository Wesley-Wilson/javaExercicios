package lista;
import java.util.Scanner;
public class Exercicio39 {
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		
		 int codigo, count = 1;
		 System.out.println("Codigo: ");
		 codigo = sc.nextInt();
		 
		 
		 while (codigo != 1234) {
			System.out.println("Senha incorreta tente novamente");
			count = count +1;
			codigo = sc.nextInt();
			System.out.println(count);
		}
		 
		 
		if(codigo == 1234) {
			System.out.println(count);
		}
		
		 
		 sc.close();
	}
}


/*	for(int count=10 ; count >= 5; count--){
		System.out.println(count);
	}
*/