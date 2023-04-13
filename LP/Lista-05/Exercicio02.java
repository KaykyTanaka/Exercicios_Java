/*
 * Exercicio02.java
 * 
 * 2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
 * (considere o valor zero como positivo).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;

		System.out.print("Insira um numero: ");
		num = leia.nextInt();

		if (num < 0) {
			System.out.println("O valor inserido e NEGATIVO");
		} else {
			System.out.println("O valor inserido e POSITIVO");
		}
	}
}
