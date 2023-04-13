/*
 * Exercicio07.java
 * 
 * 7) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
 * iguais) e escrevê-los em ordem crescente.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		System.out.print("Insira um valor: ");
		a = leia.nextInt();
		System.out.print("Insira outro valor: ");
		b = leia.nextInt();

		if (a > b) {
			System.out.println(b + " e " + a);
		} else {
			System.out.println(a + " e " + b);
		}

	}
}
