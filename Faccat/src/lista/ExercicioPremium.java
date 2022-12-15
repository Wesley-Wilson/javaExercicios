package lista;

import java.util.Scanner;

public class ExercicioPremium {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int mes;
		String janeiro, fevereiro, marco, abril, maio, junho, julho, agosto, setembro, outubro, novembro, dezembro;
		
		janeiro = " Janeiro \n HOMICIDIO DOLOSO 236 \n ROUBO DE VEICULO 2.869 \n ROUBO A BANCO 1 \n FURTO - OUTROS 42.550";
		fevereiro = " Feveiro \n HOMICIDIO DOLOSO 233 \n ROUBO DE VEICULO 2.714 \n ROUBO A BANCO 1 \\n FURTO - OUTROS 39.765";
		marco = " Marco \n HOMICIDIO DOLOSO 241 \n ROUBO DE VEICULO 3.482 \n ROUBO A BANCO 1 \\n FURTO - OUTROS 50.467";
		abril = " Abril \n HOMICIDIO DOLOSO 230 \n ROUBO DE VEICULO 2.920 \n ROUBO A BANCO 2 \\n FURTO - OUTROS 44.760";
		maio = " Maio \n HOMICIDIO DOLOSO 228 \n ROUBO DE VEICULO 3.326 \n ROUBO A BANCO 1 \\n FURTO - OUTROS 48.725";
		junho = " Junho \n HOMICIDIO DOLOSO 227 \n ROUBO DE VEICULO 3.200 \n ROUBO A BANCO 2 \\n FURTO - OUTROS 49.731";
		julho = " Julho \n HOMICIDIO DOLOSO 259 \n ROUBO DE VEICULO 3.327 \n ROUBO A BANCO 2 \\n FURTO - OUTROS 47.795";
		agosto = " Agosto \n HOMICIDIO DOLOSO 228 \n ROUBO DE VEICULO 3.086 \n ROUBO A BANCO 3 \\n FURTO - OUTROS 50.441";
		setembro = " Setembro \n HOMICIDIO DOLOSO 253 \n ROUBO DE VEICULO 3.274 \n ROUBO A BANCO 0 \\n FURTO - OUTROS 46.385";
		outubro = " Outubro \n HOMICIDIO DOLOSO 0 \n ROUBO DE VEICULO 0 \n ROUBO A BANCO 0 \\n FURTO - OUTROS 0";
		novembro = " Novembro \n HOMICIDIO DOLOSO 0\n ROUBO DE VEICULO 0 \n ROUBO A BANCO 0 \\n FURTO - OUTROS 0";
		dezembro = " Dezembro \n HOMICIDIO DOLOSO 0 \n ROUBO DE VEICULO 0 \n ROUBO A BANCO 0 \\n FURTO - OUTROS 0";
		
		System.out.println(" Dados estatisticos do Estado de Sao Paulo Brasil 2022");
		System.out.println(" Escolha o mes desejado: \n 1 Janeiro \n 2 Fevereiro \n 3 Marco \n 4 Abril \n 5 Maio \n 6 Junho \n 7 Julho \n 8 Agosto \n 9 Setembro \n 10 Outubro \n 11 Novembro \n 12 Dezembro");
		mes = sc.nextInt();
		
		switch (mes) {
		case 1: {
			
			System.out.println(janeiro);
		}
		break;
		case 2: {
			System.out.println(fevereiro);
		}
		break;
		case 3: {
			System.out.println(marco);
		}
		break;
		case 4: {
			System.out.println(abril);
		}
		break;
		case 5: {
			System.out.println(maio);
		}
		break;
		case 6: {
			System.out.println(junho);
		}
		break;
		case 7: {
			System.out.println(julho);
		}
		break;
		case 8: {
			System.out.println(agosto);
		}
		break;
		case 9: {
			System.out.println(setembro);
		}
		break;
		case 10: {
			System.out.println(outubro);
		}
		break;
		case 11: {
			System.out.println(novembro);
		}
		break;
		case 12: {
			System.out.println(dezembro);
		}
		break;
		default:
			System.out.println("Digito Invalido");
		}
		
		sc.close();
	}
}
