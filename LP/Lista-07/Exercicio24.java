/*
 * Exercicio24.class
 * 
 * 24) Desenvolva um programa que leia uma String (que representa uma sequência de dígitos 0 's e 1 's) e que determine o 
 * tamanho da maior sequência consecutiva de números 1 existente na String. No exemplo seguinte a maior cadeia consecutiva de 
 * números 1 tem tamanho 8 (oito). 00 1 0 1 0 1 00 11 0 11 0 1 0000 1 0 111 0 11111111 0 11 0 1 00 1 0 11 000
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String sequencia;
		int maior = 0;
		int cont = 0;

		System.out.print("Digite uma sequencia de digitos 0 e 1: ");
		sequencia = leia.nextLine();

		for (int i = 0; i < sequencia.length(); i++) {

			if (sequencia.charAt(i) == '1') {
				cont++;
			} else {
				cont = 0;
			}
			if (cont > maior) {
				maior = cont;
			}
		}
		System.out.println("a maior cadeia consecutiva de numeros 1 tem tamanho: " + maior);
	}
}
