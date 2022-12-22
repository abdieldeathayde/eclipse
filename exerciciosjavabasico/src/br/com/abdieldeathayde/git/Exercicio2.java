package br.com.abdieldeathayde.git;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int nota1;
		int nota2;
		int nota3;
		int media;
		
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner n3 = new Scanner(System.in);
		
		String stringN1 = n1.nextLine();
		String stringN2 = n2.nextLine();
		String stringN3 = n3.nextLine();
		
		nota1 = Integer.parseInt(stringN1);
		nota2 = Integer.parseInt(stringN2);
		nota3 = Integer.parseInt(stringN3);
		
		media = (nota1 + nota2 + nota3) / 3;		
		System.out.println("A média das primeiras notas é: " + media);
		
		int media2 = (4 + 5 + 6) / 3;
		System.out.println("A media das 3 outras notas é: " + media2);
		
		int mediaFinal = (media + media2) / 2;
		System.out.println("A média das duas médias é: " + mediaFinal);
		
		
		
	}

}
