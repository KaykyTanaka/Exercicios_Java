/*
 * Exercicio53.java
 * 
 * 
 * 53) Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1 até 250.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio53 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int f;
		int proximo = 1;
		int anterior = 0;

		do {
			f = anterior + proximo;
			anterior = proximo;
			proximo = f;
			System.out.print(anterior + " ");
		} while (f <= 250);

	}
}
