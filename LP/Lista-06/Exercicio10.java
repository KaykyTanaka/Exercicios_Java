/*
 * Exercicio10.java
 * 
 * 10) Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores
 * lidos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int total = 0;
		int x;
		int cont = 0;
		do {

			System.out.print("Digite um numero: ");
			x = leia.nextInt();
			cont++;
			total += x;
		} while (cont < 10);

		System.out.println("Total= " + total + "\nMedia = " + (total / 10));

	}
}
