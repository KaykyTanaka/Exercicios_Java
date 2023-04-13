/*
 * Exercicio18.class
 * 
 * 18) Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem 
 * indique se esta cadeia representa uma sequência binária de 8 bit’s ou não. 
 * Ex: - não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA 
 * - é uma sequência de 8bit’s: 01101011, 10110101, 10000000
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String sequencia;
		int cont = 0;

		System.out.print("Digite uma sequencia binaria: ");
		sequencia = leia.nextLine();

		
			for (int i = 0; i < sequencia.length(); i++) {
				if (sequencia.charAt(i) != '0' && sequencia.charAt(i) != '1') {
					cont++;
				}
			}
			if (sequencia.length() == 8 && cont == 0) {
				System.out.println(sequencia+": E uma sequencia de 8bit's ");
			} else {
				System.out.println(sequencia+": NAO e uma sequencia de 8bit's ");
			}
	}
}
