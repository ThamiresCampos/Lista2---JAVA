package lista02;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar o valor do volume de uma lata.");
		System.out.println("Insira o valor do raio: ");
		int raio = sc.nextInt();
		
		System.out.println("Insira o valor da altura da lata: ");
		int altura = sc.nextInt();
		
		float volume = (float) Math.PI * raio * raio * altura;
		
		System.out.println("O volume da lata é :");
		System.out.println(volume);
	}
}
