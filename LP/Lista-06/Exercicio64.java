/*
 * Exercicio64.java
 * 
 * 
 * 64) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos. 
 * 1/2 - 1/3 + 2/5 - 3/7 + 5/11 - 8/13 
 * 
 * em cima sequência de Fibonacci e embaixo sequência de Primos.
 * 
 */

import java.util.Scanner;

public class Exercicio64 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int qtd, a = 0, b = 1, c = 0, cont = 0, primo = 0, num = 0;
		double total = 0;
		boolean test = true;

		System.out.print("Digite a quantidade de termos: ");
		qtd = leia.nextInt();

		for (int i = 1; i <= qtd; i++) {

			if (test == true) {
				a = b;
				b = c;
				c = a + b;

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

				total -= (double) c / primo;
				System.out.print(" - " + c + "/" + primo);
				test = false;
			}

			else {
				a = b;
				b = c;
				c = a + b;

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

				total += (double) c / primo;
				System.out.print(" + " + c + "/" + primo);
				test = true;
			}

		}
		System.out.print("\nTotal = " + total);
	}
}
