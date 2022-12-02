/*
 * Exercicio12.java
 * 
 * 12) Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10
 * números lidos
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;
		int cont = 0;
		int total = 0;

		do {
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			cont++;
			total += num;
		} while (cont < 10);

		System.out.println("A soma total dos numeros digitados e: " + total);

	}
}
