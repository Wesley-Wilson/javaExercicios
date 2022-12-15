package equipe02;

public class OperadoresUnarios {
	public static void main(String[]args) {
		int numero = 10;
		
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(--numero);
		// pega o valor absoluto de a que vale 20 + o incremento que vale 22
		
		int a = 20;
		// esta incrementando 
		System.out.println(a++ + ++a); // => 20 + 21+1 => 20 + 22 => 42
		
		int b = 30;
		//31 + 30 
		System.out.println(b++ + b++); // => 30 + 31
		System.out.println(b);
		System.out.println(++b + b++ + ++b); // 33 + 33 + 34+1
		System.out.println(b);
		System.out.println(a);
		System.out.println(a++ + b++ + ++a + ++b); // 22 + 35 + 24 + 37
	}
}
