package lista02;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler uma temperatura em Fahrenheit para Celsius.");
		System.out.println("D�gite a temperatura: ");
		int fahrenheit = sc.nextInt();
		
		int celsius = ((fahrenheit - 32) * 5) / 9;
				
		System.out.println("A convers�o para Celsius �:");
		System.out.println(celsius + "�");
		
	}
	
	
	
	

}
