package equipe02;

public class ExemploTipoVariavel {
	static int m = 100; // estatico
	
	static void soma() {
		int a = 10; // variavel local
		int b = 20;
		int somatorio = a+b;
		System.out.println(somatorio);
	}
	
	public static void main(String[] args) {
		int data = 50; // instancia 
		System.out.println(data);
		System.out.println(m);
		soma();
	}
}
