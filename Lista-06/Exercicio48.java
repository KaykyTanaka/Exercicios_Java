/*
 * Exercicio48.java
 * 
 * 48) Solicite ao usuário a quantidade de termos da sequência de números primos e imprima o resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd, cont, cont1 = 0;

		System.out.print("Insira a quantidade de termos da sequencia de numeros primos: ");
		qtd = leia.nextInt();

		for (int i = 1; cont1 != qtd; i++) {
			cont = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cont++;
				}
			}
			if (cont == 2) {
				System.out.print(i + " | ");
				cont1++;
			}
		}

	}
}
