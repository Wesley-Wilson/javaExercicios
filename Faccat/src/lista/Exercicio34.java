package lista;
import java.util.Scanner;

public class Exercicio34 {
	static void answer() {
		Scanner a = new Scanner(System.in);
		int x = 3;
		int y = 2;
		int z;
		
		
		z = (x*y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if(z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.println(z);
		
		a.close();
	}
	
	static void answer1() {
		Scanner a = new Scanner(System.in);
		int x = 150;
		int y = 3;
		int z;
		
		
		z = (x*y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if(z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.println(z);
		
		a.close();
	}
	
	static void answer2() {
		Scanner a = new Scanner(System.in);
		int x = 7;
		int y = -1;
		int z;
		
		
		z = (x*y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if(z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.println(z);
		
		a.close();
	}
	
	static void answer3() {
		Scanner a = new Scanner(System.in);
		int x = -2;
		int y = 5;
		int z;
		
		
		z = (x*y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if(z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.println(z);
		
		a.close();
	}
	
	static void answer4() {
		Scanner a = new Scanner(System.in);
		int x = 50;
		int y = 3;
		int z;
		
		
		z = (x*y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if(z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.println(z);
		
		a.close();
	}
	
	public static void main(String[]args) {
		answer();
		System.out.println();
		answer1();
		System.out.println();
		answer2();
		System.out.println();
		answer3();
		System.out.println();
		answer4();
		
	}
}
