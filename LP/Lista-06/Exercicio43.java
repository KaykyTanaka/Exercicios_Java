/*
 * Exercicio43.java
 * 
 * 43) Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial desse número.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, x = 1;
		int total = 1;

		do {
			System.out.print("\nInsira um numero: ");
			num = leia.nextInt();

			System.out.print(num + "! = ");
			total = 1;
			for (int i = 1; i <= num; i++) {
				System.out.print(i + "*");
				total *= i;
			}
			System.out.print("\b = " + total + "\n");
			x++;
		} while (x <= 7);
	}
}