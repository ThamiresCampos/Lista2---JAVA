package lista02;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descobrir o valor da prestação.");
		System.out.println();
		System.out.println("Dígite o valor da prestação: ");
		int valor = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o da taxa de tempo de atraso: ");
		int taxa = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite o tempo de atraso: ");
		int tempo = sc.nextInt();
		System.out.println();
		
		int prestacao = valor + ((valor * taxa / 100) * tempo); 
		
		System.out.println("O valor da prestação ficará em: " + prestacao);
		System.out.println();
		
}

}
