/*
 * Exercicio65.java
 * 
 * 
 * 65) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos. 
 * -1/2 + 1/3 - 2/5 + 6/7 - 24/11 + 120/13 
 * 
 * em cima sequência de Fatoriais e embaixo sequência de Primos.
 * 
 */

import java.util.Scanner;

public class Exercicio65 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int qtd, x = 1, y = 1, cont = 0, primo = 0, num = 0;
		double total = 0;
		boolean test = true;

		System.out.print("Digite a quantidade de termos: ");
		qtd = leia.nextInt();

		for (int i = 1; i <= qtd; i++) {

			if (test == true) {
				while (x <= i) {
					y *= i;
					x++;
				}

				// primo
				do {
					cont = 0;
					for (int j = 1; j <= num; j++) {
						if (num % j == 0) {
							cont++;
						}
					}
					if (cont == 2) {
						primo = num;
					}
					num++;
				} while (cont != 2);

				total -= (double) y / primo;
				System.out.print(" - " + y + "/" + primo);
				test = false;
			}

			else {
				while (x <= i) {
					y *= i;
					x++;
				}

				// primo
				do {
					cont = 0;
					for (int j = 1; j <= num; j++) {
						if (num % j == 0) {
							cont++;
						}
					}
					if (cont == 2) {
						primo = num;
					}
					num++;
				} while (cont != 2);

				total += (double) y / primo;
				System.out.print(" + " + y + "/" + primo);
				test = true;
			}

		}
		System.out.print("\nTotal = " + total);
	}
}
