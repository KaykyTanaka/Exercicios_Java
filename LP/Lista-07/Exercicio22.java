/*
 * Exercicio22.class
 * 
 * 22) Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes que a palavra ocorre na frase. 
 * Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA , a palavra ANA ocorre 4 vezes.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase, palavra, recorte;
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toLowerCase();

		System.out.print("Digite uma palavra: ");
		palavra = leia.nextLine().toLowerCase();

		for (int i = 0; i <= frase.length() - palavra.length(); i++) {
			recorte = frase.substring(i, i + palavra.length());
			if (recorte.equals(palavra)) {
				cont++;
			}
		}

		System.out.println("A palavra: '" + palavra + "' aparece " + cont + " vez(es)");

	}
}
