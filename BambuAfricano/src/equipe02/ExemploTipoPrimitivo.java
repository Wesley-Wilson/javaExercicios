package equipe02;

import java.util.Scanner;

public class ExemploTipoPrimitivo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		// primitivo char
		char sexo = 'A';
		System.out.println(sexo);
		// posição 0 como positivo, por conta disso não tem essa paridade. 
		// byte
		byte a = -128;
		byte b = 127; 
		System.out.println(a);
		System.out.println(b);
		short s = -32768;
		short r = 32767; 
		System.out.println(s);
		System.out.println(r);
		// int 
		int intA = -2147483648;
		int intB = 2147483647;
		System.out.println(intA);
		System.out.println(intB);
		// long
		
		long longA = -9223372036854775808l;
		long longB= 9223372036854775807l; 
		System.out.println(longA);
		System.out.println(longB);
		
		// variaveis com ,
		float flutuante = 234.5f;
		double d1 = 12.3;
		System.out.println(flutuante);
		System.out.println(d1);
		
		// String
		String nome = "Wesley";
		System.out.println(nome);
		
		sc.close();
	}
}
