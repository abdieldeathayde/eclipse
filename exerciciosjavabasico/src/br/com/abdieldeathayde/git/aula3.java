package br.com.abdieldeathayde.git;

import java.util.Scanner;

public class aula3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu saldo: ");
		
		float saldo = scanner.nextFloat();
		float saldoComReajuste = (float) (saldo + (saldo * (1 + 1/100)));
		
		System.out.println("O saldo com reajuste é: " + saldoComReajuste);
	
	}

}
