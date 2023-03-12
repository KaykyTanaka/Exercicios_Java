/*
 * Exercicio28.class
 * 
 * 28) Escreva um programa que leia uma String e "dobre"
 * ela ao meio concatenado seus caracteres.
 * Ex:
 * Entrada: Macaco Caco quer banana (tamanho ímpar)
 * Saída: Maancaancaob rCeaucqo
 * Entrada: Batatinha quando nasce (tamanho par)
 * Saída: Beactsaatniondhnaa uq
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int meio = 0, f = 0;
		String frase = "", direita = "", esquerda = "", impar = "", saida = "";
		
		System.out.print("Digite uma frase: ");
		frase = leia.nextLine();
		
		meio = frase.length()/2;
		f = frase.length() - 1;
		
		for (int i = 0; i < meio; i++){
			esquerda += frase.charAt(i);
			direita += frase.charAt(f);
			f--;
		}
		if (frase.length()%2 != 0){
			impar += frase.charAt(meio);
		}
		
		for (int i = 0; i < esquerda.length(); i++){
			saida += esquerda.charAt(i);
			saida += direita.charAt(i);
		}
		saida += impar;
		System.out.println("Saida: " + saida);
		
		
	}
}
