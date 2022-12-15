package equipe02;

public class Matriz03 {
	public static void main(String[]args) {
		int[][] numeros = {{1,7,91,5},{31,45,-315,70},{1,2,3,4}};
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println(numeros[i][j]);
			}
		}
	}
}
