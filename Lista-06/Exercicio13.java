/*
 * Exercicio13.java
 * 
 * 13) Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40
 * devem ser somados. Escreva o valor final da soma efetuada.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;
		int cont = 0;
		int total = 0;

		do {
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			cont++;
			if (num < 40) {
				total += num;
			}
		} while (cont < 10);

		System.out.println("A soma dos numeros digitados inferiores a 40 e: " + total);

	}
}
