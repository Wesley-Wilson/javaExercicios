package lista;
import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, senha;
		
		System.out.println("Codigo de usuario");
		codigo = sc.nextInt();
		
		if (codigo == 1234) {
			System.out.println("Senha: ");
			senha = sc.nextInt();
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("senha incorreta");
			}
		} else {
			System.out.println("Codigo Invalido");
		}
		
		
		// faça e switch case para ter tentativas. ou em for para gerar limite. como 2 tentativas restantes.
		sc.close();
	}
}

/*
38) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
*/