/*
 * Exercicio24.java
 * 
 * 24) Escreva um programa em Java que imprima a tabuada do
 * 1 ao 10, para os números de 0 a 10.
 * 
 * 
 */

public class Exercicio24 {

	public static void main(String[] args) {
		int x = 0;

		do {
			System.out.println("\n====== Tabuada do " + x + " ======");
			for (int i = 0; i < 11; i++) {
				System.out.println(x + "x" + i + "=" + (x * i));
			}
			x++;
		} while (x <= 10);

	}
}
