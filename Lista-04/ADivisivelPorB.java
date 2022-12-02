/*
 * ADivisivelPorB.java
 * 
 * 6 - Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guarde
 * dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b
 * de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
 * Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário.
 * Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é
 * divisível, caso contrário.
 * 
 * 
 */

import java.util.Scanner;
public class ADivisivelPorB {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;

		System.out.print("Insira o valor de A (0 ate 1000): ");
		a = leia.nextInt();

		System.out.print("Insira o valor de b (0 ate 20): ");
		b = leia.nextInt();

		if (a < 0 || a > 1000 || b < 0 || b > 20) {
			System.out.println("Insira um valor valido!");
		} else {
			if (1 >= b) {
				System.out.println("B NAO e maior ou igual a 1");
			}
			if ((a % b) == 0) {
				System.out.println("E divisivel!");
			} else {
				System.out.println("Nao e divisivel!");
			}
		}
	}
}