/*
 * Exercicio14.class
 * 
 * 14) Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido aparecer na frase ele deve ser 
 * substituído por asterisco. Por exemplo, se os valores fornecidos fossem para a frase: o dia esta nublado , e para o 
 * caractere: a , o programa deverá fornecer o seguinte resultado: o di* est* nubl*do
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase, letra;
		String saida = "";

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toLowerCase();
		System.out.print("Digite a letra para ser substituida: ");
		letra = leia.nextLine().toLowerCase();
		
		for (int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == letra.charAt(0)){
			saida = saida + "*";
			
			} else {
				
				saida = saida + frase.charAt(i);
			}
		}
		System.out.println(saida);
	}
}