package lista02;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descobrir o valor da presta��o.");
		System.out.println();
		System.out.println("D�gite o valor da presta��o: ");
		int valor = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o da taxa de tempo de atraso: ");
		int taxa = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite o tempo de atraso: ");
		int tempo = sc.nextInt();
		System.out.println();
		
		int prestacao = valor + ((valor * taxa / 100) * tempo); 
		
		System.out.println("O valor da presta��o ficar� em: " + prestacao);
		System.out.println();
		
}

}
