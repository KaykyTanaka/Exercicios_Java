/*
 * 
 * Exercicio01.java
 * 
 * 1) [POO-006] Crie um programa que solicite ao usuário dois números inteiros. 
 * Através de um método, que receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores.
 * Restrição: NÃO usar o pacote Math. 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num1 = leia.nextInt();

		System.out.print("Digite um numero: ");
		int num2 = leia.nextInt();

		System.out.print(maior(num1, num2) ? "O maior e: " + num1 : "O maior e: " + num2);

	}

	static boolean maior(int n1, int n2) {
		return n1 > n2;
	}
}
