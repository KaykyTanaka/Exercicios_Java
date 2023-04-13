/*
 * Exercicio62.java
 * 
 * 
 * 62) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos
 * 
 * 2/1 - 4/3 + 6/5 - 8/7 + 10/9
 * 
 */

import java.util.Scanner;

public class Exercicio62 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int termos;
		int a = 2;
		int b = 1;
		double total = 0;
		boolean test = true;

		System.out.print("Entre com a quantidade de termos: ");
		termos = leia.nextInt();

		for (int i = 1; i <= termos; i++) {

			if (test == true) {
				total += (double) a / b;
				System.out.print(a + "/" + b + " - ");
				test = false;
			} else {
				total -= (double) a / b;
				System.out.print(a + "/" + b + " + ");
				test = true;
			}
			a += 2;
			b += 2;
		}
		System.out.print("\b\b = Total: " + total);
	}
}
