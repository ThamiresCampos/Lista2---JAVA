package lista02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de eleitores do município");
		
		System.out.println("Insira a quantidade de eleotores: ");
		int eleitores = sc.nextInt();
		
		System.out.println("Insira a quantidade de votos válidos: ");
		int validos = sc.nextInt();
		
		System.out.println("Insira a quantidade de votos brancos: ");
		int brancos = sc.nextInt();

		System.out.println("Insira a quantidade de votos nulos: ");
		int nulos = sc.nextInt();
		
		int porcentagemValidos = 100 * validos /eleitores;
		
		int porcentagemBrancos = 100 * brancos / eleitores;
		
		int porcentagemNulos = 100 * nulos / eleitores;
		
		System.out.println("A porcentagem de votos válidos: ");
		System.out.println(porcentagemValidos + "%");
		
		System.out.println("A porcentagem de votos brancos: ");
		System.out.println(porcentagemBrancos + "%");
		
		System.out.println("A porcentagem de votos válidos: ");
		System.out.println(porcentagemNulos + "%");
		sc.close();
}
}