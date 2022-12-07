/*
 * Exercicio52.java
 * 
 * 
 * 52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência de Fibonacci ou não.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, f;
		int proximo = 1;
		int anterior = 0;
		boolean teste = false;

		System.out.print("Digite um numero inteiro: ");
		num = leia.nextInt();

		for (int i = 0; i < 100; i++) {
			f = proximo + anterior;
			anterior = proximo;
			proximo = f;
			// System.out.print(anterior + " ");
			if (num == f) {
				teste = true;
			}
		}
		if (teste == true) {
			System.out.println("O numero: " + num + " pertence a sequencia fibonacci");
		} else {
			System.out.println("O numero: " + num + " NAO pertence a sequencia fibonacci");
		}
	}
}
