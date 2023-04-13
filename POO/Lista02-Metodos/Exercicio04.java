/*
 * 
 * Exercicio04.java
 * 
 * 4) [POO-009] Crie um programa que solicite ao usuário dois números inteiros. 
 * Através de um método, que receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.
 * Restrição: USAR o pacote Math, em específico, o método min(). 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num1 = leia.nextInt();

		System.out.print("Digite um numero: ");
		int num2 = leia.nextInt();

		System.out.print("O menor e: " + menor(num1, num2));

	}

	static int menor(int n1, int n2) {
		return Math.min(n1, n2);
	}
}
