package lista02;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler uma temperatura em Celsius para Fahrenheit.");
		System.out.println("D�gite a temperatura: ");
		int celsius = sc.nextInt();
		
		
		int fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A convers�o para Fahrenheit �: ");
		System.out.println(fahrenheit + "�");
	}
}
