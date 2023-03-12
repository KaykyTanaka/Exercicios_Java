/*
 * Exercicio14.java
 * 
 * 14) Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes
 * entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será
 * sempre maior que o primeiro valor lido.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		int total = 0;

		System.out.print("Digite um valor: ");
		a = leia.nextInt();

		System.out.print("Digite outro valor (maior que o primeiro): ");
		b = leia.nextInt();

		if (b > a) {
			for (; a <= b; a++) {
				total += a;
			}
			System.out.println(total);
		} else {
			System.out.println("Insira valores validos!");
		}

	}
}
