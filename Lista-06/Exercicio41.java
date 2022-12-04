/*
 * Exercicio41.java
 * 
 * 41)Solicite ao usuário um número e mostre o fatorial do número informado
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, total = 1;

		System.out.print("Digite um numero: ");
		num = leia.nextInt();

		System.out.print(num + "! = ");

		for (int i = 1; i <= num; i++) {
			System.out.print(i + "*");
			total *= i;
		}

		System.out.print("\b = " + total);
	}
}