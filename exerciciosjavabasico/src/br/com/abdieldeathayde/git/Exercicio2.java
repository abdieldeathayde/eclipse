package br.com.abdieldeathayde.git;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int media;		
		Scanner scanner = new Scanner(System.in);
		
		Integer nota1 = scanner.nextInt();
		Integer nota2 = scanner.nextInt();
		Integer nota3 = scanner.nextInt();
		
		media = (nota1 + nota2 + nota3) / 3;		
		System.out.println("A média das primeiras notas é: " + media);
		
		Integer nota1ponto1 = scanner.nextInt();
		Integer nota2ponto2 = scanner.nextInt();
		Integer nota3ponto3 = scanner.nextInt();
		
		int media2 = (nota1ponto1 + nota2ponto2 + nota3ponto3) / 3;
		System.out.println("A media das 3 outras notas é: " + media2);
		
		int mediaFinal = (media + media2) / 2;
		System.out.println("A média Final é : " + mediaFinal);
	}
}