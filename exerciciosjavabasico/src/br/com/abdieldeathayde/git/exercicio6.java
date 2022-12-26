package br.com.abdieldeathayde.git;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: \n");
		
		Integer numeroLido = scanner.nextInt();
		Integer antecessor = numeroLido - 1;
		Integer sucessor = numeroLido + 1;
		
		System.out.println("O antecessor é: " + antecessor + " E o sucessor é " + sucessor);
	}

}
