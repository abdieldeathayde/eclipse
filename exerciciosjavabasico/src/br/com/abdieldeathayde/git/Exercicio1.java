package br.com.abdieldeathayde.git;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Por favor, digite a idade em anos!");
		Integer idadeAnos = scanner.nextInt();
		System.out.println("Por favor, digite a idade em meses!");
		Integer idadeMeses = scanner.nextInt();
		System.out.println("Por favor, digite a idade em dias!");
		Integer idadeEmDias = scanner.nextInt();
				
		int totalIdadeEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeEmDias;
		
		System.out.println("Sua idade em dias é: " + totalIdadeEmDias + " dias.");
	}
}
