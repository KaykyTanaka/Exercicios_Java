/*
 * Exercicio55.java
 * 
 * 
 * 55) Solicite um número inteiro ao usuário e informe se o número é perfeito ou não.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio55 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int num = leia.nextInt();
		int soma = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				soma += i;
				// System.out.print(i + " + ");
			}
		}

		if (soma == num) {
			System.out.print("O numero informado e perfeito!");
			// System.out.print("\b\b= "+soma);
		} else {
			System.out.print("O numero informado nao e perfeito!");
		}
	}
}
