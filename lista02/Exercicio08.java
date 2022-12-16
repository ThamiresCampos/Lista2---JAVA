package lista02;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descobrir a distância percorrida.");
		System.out.println();
		System.out.println("Insira o tempo gasto durante a viagem: ");
		int tempo = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira a velocidade media durante a viagem: ");
		int velocidade = sc.nextInt();
		
		int distancia = tempo * velocidade;
		int litroUsado = distancia / 12;
		
		System.out.println("A distâcia percorrida foi: " + distancia + "KM");
		System.out.println();
		System.out.println("A velocidade média foi de: " + velocidade + "Km/H");
		System.out.println();
		System.out.println("O tempo gasto foi: " + tempo + " Horas");
		System.out.println();
		System.out.println("Litros utilizados foi: " + litroUsado + " Litros");
	}
}
