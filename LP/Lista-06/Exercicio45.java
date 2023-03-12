/*
 * Exercicio45.java
 * 
 * 45) Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a sequência do final para o início.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, total = 1;

		System.out.print("\nInsira a quantidade de termos da sequencia de fatoriais: ");
		num = leia.nextInt();

		do {
			System.out.print(num + "! = ");
			total = 1;
			for (int i = num; i >= 1; i--) {
				System.out.print(i + "*");
				total *= i;
			}
			System.out.print("\b = " + total + "\n");
			num--;
		} while (num >= 1);
	}
}
