/*
 * Exercicio07.java
 * 
 * 7) Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever
 * a tabuada de 1 a 10 do valor lido.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;

		System.out.print("Insira um valor entre 1 e 10: ");
		num = leia.nextInt();

		if (num >= 1 && num <= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + "x" + i + " = " + (num * i));
			}
		}
	}
}
