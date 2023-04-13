/*
 * Exercicio21.java
 * 
 * 21) Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números.
 * Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média
 * dos números lidos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade, num;
		int total = 0;
		int cont = 0;
		int maior = 0;

		System.out.print("Digite a quantidade de numeros a ser lida: ");
		quantidade = leia.nextInt();
		do {
			System.out.print("Digite o valor: ");
			num = leia.nextInt();

			if (num > maior) {
				maior = num;
			}
			total += num;
			cont++;
		} while (cont < quantidade);

		System.out.print("\nO maior numero digitado foi: " + maior);
		System.out.print("\nA media dos numeros digitados: " + (total / quantidade));

	}
}
