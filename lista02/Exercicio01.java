package lista02;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler idade de uma pessoa.");
		System.out.println("Insira a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Dígite quantos meses se passaram desde seu último aniversário: ");
		int meses = sc.nextInt();
		
		System.out.println("Dígite quantos dias se passaram desde o dia do seu aniversário: ");
		int dias = sc.nextInt();
		
		int ano = 365;
		int mes = 30;
		
		
		int total = ((idade * ano) + (meses * mes) + dias);
		
		System.out.println("A sua idade expressa em dias é: ");
		System.out.println(total);
		
	}

}
