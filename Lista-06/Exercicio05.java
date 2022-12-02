/*
 * Exercicio05.java
 * 
 * 5) Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor
 * informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;

		do {
			System.out.print("Insira um numero: ");
			n = leia.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.print(i + " | ");
			}
		} while (n < 0);

	}
}
