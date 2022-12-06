/*
 * Exercicio20.class
 * 
 * 20) Escreva um programa que receba uma frase, conte e imprima o número de palavras desta frase
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in); 
		String frase;
		int cont = 0;
		
		System.out.print("Digite uma palavra: ");
		frase = leia.nextLine();
		
		for (int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == ' '){
				cont++;
			}
		}
		System.out.print("A frase possui: " + (cont+1) + " palavras");
		
		
		
		
	}
}
