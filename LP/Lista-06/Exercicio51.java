/*
 * Exercicio51.java
 * 
 * 
 * 51) Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima o resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio51 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd, f;
		int proximo = 1;
		int anterior = 0;

		System.out.print("Insira a quantidade de termos da sequencia fibonacci a ser impresso: ");
		qtd = leia.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.print(anterior + " ");
			f = anterior + proximo;
			anterior = proximo;
			proximo = f;
		}
	}
}
