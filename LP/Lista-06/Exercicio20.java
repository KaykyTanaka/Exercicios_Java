/*
 * Exercicio20.java
 * 
 * 20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido
 * 
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, cont = 0;
		int menor = 100;
		int maior = 0;

		do {
			num = (int) (Math.random() * 100) + 1;
			;

			System.out.print(num + " | ");

			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}

			cont++;

		} while (cont <= 100);

		System.out.println("\nMaior: " + maior + "\nMenor: " + menor);
	}
}
