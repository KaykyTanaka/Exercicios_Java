/*
 * Exercicio09.java
 * 
 * 9) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no
 * intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = 1;
		int num;
		int intervalo = 0;
		int fora = 0;

		do {
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			x++;
			if (num >= 10 && num <= 20) {
				intervalo++;
			} else {
				fora++;
			}

		} while (x <= 10);
		System.out.println("Quantidade de numeros no intervalo [10,20]: " + intervalo
				+ "\nQuantidade de numeros fora do intervalo: " + (fora));
	}
}
