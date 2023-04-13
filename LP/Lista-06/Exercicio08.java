/*
 * Exercicio08.java
 * 
 * 8) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são
 * NEGATIVOS.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = 1;
		int num;
		int negativos = 0;

		do {
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			x++;
			if (num < 0) {
				negativos++;
			}

		} while (x <= 10);
		System.out.println("Quantidade de numeros negativos digitados: " + negativos);
	}
}
