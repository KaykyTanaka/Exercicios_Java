/*
 * Exercicio44.java
 * 
 * 44) Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima o resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, x = 1;
		int total = 1;

		System.out.print("\nInsira a quantidade de termos da sequencia de fatoriais: ");
		num = leia.nextInt();
		do {
			System.out.print(x + "! = ");
			total = 1;
			for (int i = 1; i <= x; i++) {
				System.out.print(i + "*");
				total *= i;
			}
			System.out.print("\b = " + total + "\n");
			x++;
		} while (x <= num);
	}
}