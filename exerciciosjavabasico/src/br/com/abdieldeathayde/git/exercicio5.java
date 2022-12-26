package br.com.abdieldeathayde.git;

import java.util.Scanner;

public class exercicio5 {
	
	// Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
	// calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
	// (1SM=R$788,00)
	
	public static void main(String[] args) {
		float salarioMinimo = (float) 788.0;
		Scanner scanner = new Scanner(System.in);
		
		float salarioUsuario = scanner.nextFloat();
		float quantidadeSalariosMinimos = 0;
		
		while (quantidadeSalariosMinimos < salarioUsuario) {
			quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
		}
		
		System.out.println("O salario do usuário equivale à: " + quantidadeSalariosMinimos);
	}

}
