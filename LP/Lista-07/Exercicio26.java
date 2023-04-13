/*
 * Exercicio26.class
 * 
 * 26) Escreva um programa para gerar aleatoriamente uma String com 100 letras minúsculas. 
 * Apresentar, caso haja: 
 * - as letras do alfabeto que NÃO constam na sequência; 
 * - a maior sequência de letras repetidas; 
 * - a maior sequência de vogais; 
 * - a maior sequência alfabética.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String aleatorio = "";
		String saida = "";
		boolean x = false;

		for (int i = 0; i <= 100; i++) {
			aleatorio += (char) ((int) (Math.random() * 26) + 'a');
		}
		System.out.println(aleatorio);

		for (int i = 'a'; i <= 'z'; i++) {
			x = false;
			for (int a = 0; a < aleatorio.length(); a++) {
				if (i == aleatorio.charAt(a)) {
					x = true;
				}
			}
			if (x == false) {
				saida += (char) i + ", ";
			}
		}
		if (saida.isEmpty() != true) {
			System.out.println(saida + "nao consta na sequencia");
		}

	}
}
