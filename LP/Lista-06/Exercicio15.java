/*
 * Exercicio15.java
 * 
 * 15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor que o primeiro valor lido, ou seja, deve-se testá-los.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		int total = 0;

		System.out.print("Digite um valor: ");
		a = leia.nextInt();

		System.out.print("Digite outro valor: ");
		b = leia.nextInt();

		if (b > a) {
			for (; a <= b; a++) {
				total += a;
			}
			System.out.println(total);
		} else {
			for (; b <= a; b++) {
				total += b;
			}
			System.out.println(total);
		}
	}
}
