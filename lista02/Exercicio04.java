package lista02;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descobrir o valor do carro para o consumidor.");
		System.out.println("Insira o custo fábrica: ");
		int fabrica = sc.nextInt();
		
		int distribuidor = fabrica * 28 / 100;
		int impostos = fabrica * 45 / 100;
		
		int total = fabrica + distribuidor + impostos;
		
		System.out.println("O valor do carro fica em: ");
		System.out.println(total);
	}

}
