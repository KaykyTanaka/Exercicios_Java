/*
 * Exercicio04.java
 * 
 * 4) Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
 * e N (inclusive). Considere que o N será sempre maior que ZERO.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		System.out.print("Insira um numero: ");
		n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " | ");
		}
	}
}
