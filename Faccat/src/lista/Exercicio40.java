package lista;

import java.util.Scanner;
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;

public class Exercicio40 extends Frame {
	Exercicio40(){
		Button b = new Button("Clique aqui");
		b.setBounds(30, 100, 80, 30);
		
		add(b);
		
		setSize(300, 300);
		
		setTitle("Primeiro exemplo frame");
		setLayout(null);
		setVisible(true);
	}
	
	
	public static void main(String[]args) {
		Exercicio40 f = new Exercicio40();
	}

}
