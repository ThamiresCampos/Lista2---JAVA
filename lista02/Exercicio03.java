package lista02;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descubra o seu novo sal�rio");
		System.out.println("Insira o do seu sal�rio atual: ");
		int atual = sc.nextInt();
		
		System.out.println("D�gite o valor do seu reajuste: ");
		int reajuste = sc.nextInt();
		
		int porcentagem = atual * reajuste / 100;
		
		int novo = porcentagem + atual;
		
		System.out.println("O seu novo sal�rio � de: ");
		System.out.println(novo + "R$");
	}
}
