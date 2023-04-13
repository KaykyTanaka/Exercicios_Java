/*
 * Exercicio47.java
 * 
 * 47) Imprima somente os números primos existentes na faixa de um 1 até 100
 * 
 * 
 */

public class Exercicio47 {

	public static void main(String[] args) {
		int num = 1;
		int cont = 0;

		do {
			cont = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					cont++;
				}
			}

			if (cont == 2) {
				System.out.print(num + " | ");
			}

			num++;
		} while (num <= 100);
	}
}
