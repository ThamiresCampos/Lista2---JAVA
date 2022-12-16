package lista02;
import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores. ");
		System.out.println();
		
		System.out.println("Dígite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite mais um valor: ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		int novo1 = valor2;
		int novo2 = valor1;
		
		System.out.println("O primeiro valor virou: " + novo1);
		System.out.println();
		System.out.println("E o segundo valor virou: " + novo2);
		
	}

}
