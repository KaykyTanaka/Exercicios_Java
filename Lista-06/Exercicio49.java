/*
 * Exercicio49.java
 * 
 * 49) Solicite ao usuário a quantidade de termos da sequência de números primos e imprima a sequência do final para o início.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd = 0, x = 1, contador = 0;

		String saida = "";

		do {
			System.out.print("A quantidade de termos da sequencia de numeros primos: ");
			qtd = leia.nextInt();

			if (qtd > 0) {
				x = 1;
				saida = "";
				for (int termo = 1; termo <= qtd;) {
					contador = 0;
					for (int i = 1; i <= x; i++) {
						if (x % i == 0) {
							contador++;
						}
					}
					if (contador == 2) {
						saida = x + " " + saida;
						termo++;
					}
					x++;
				}
				System.out.print(saida);
			}
			System.out.println();
		} while (qtd > 0);

	}
}