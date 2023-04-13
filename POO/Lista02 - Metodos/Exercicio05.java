/*
 * 
 * Exercicio05.java
 * 
 * 5) [POO-010] Crie um programa que solicite ao usuário três números inteiros.
 * Através de um método, que receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.
 * Restrição: USAR a técnica de sobrecarga para o método, um com 2 e outro com 3 parâmetros.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num1 = leia.nextInt();

		System.out.print("Digite um numero: ");
		int num2 = leia.nextInt();

		System.out.print("Digite um numero: ");
		int num3 = leia.nextInt();

		System.out.print("O maior e: " + maior(num1, num2, num3));

	}

	static int maior(int n1, int n2) {
		return Math.max(n1, n2);
	}

	static int maior(int n1, int n2, int n3) {
		return Math.max(maior(n1, n2), n3);
	}
}
