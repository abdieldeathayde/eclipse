package br.com.abdieldeathayde.git;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner idadeEmAnos = new Scanner(System.in);
		Scanner idadeEmMeses = new Scanner(System.in);
		Scanner idadeDias = new Scanner(System.in);
		
		System.out.println("Por favor, digite a idade em anos!");
		String idadeAnos = idadeEmAnos.nextLine();
		System.out.println("Por favor, digite a idade em meses!");
		String idadeMeses = idadeEmMeses.nextLine();
		System.out.println("Por favor, digite a idade em dias!");
		String idadeEmDias = idadeDias.nextLine();
				
		int iddAnos = Integer.parseInt(idadeAnos);
		int iddMeses = Integer.parseInt(idadeMeses);
		int iddDias = Integer.parseInt(idadeEmDias);
		int totalIdadeEmDias = (iddAnos * 365) + (iddMeses * 30) + iddDias;
		
		System.out.println("Sua idade em dias é: " + totalIdadeEmDias + " dias.");
	}

}
