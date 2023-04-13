/*
 * 
 * Exercicio03.java
 * 
 * 3) [POO-008] Crie um programa que solicite ao usuário dois números inteiros.
 * Através de um método, que receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores.
 * Restrição: USAR o pacote Math, em específico, o método max(). 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num1 = leia.nextInt();

		System.out.print("Digite um numero: ");
		int num2 = leia.nextInt();

		System.out.print("O maior e: " + maior(num1, num2));

	}

	static int maior(int n1, int n2) {
		return Math.max(n1, n2);
	}
}
