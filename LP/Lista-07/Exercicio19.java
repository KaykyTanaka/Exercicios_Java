/*
 * Exercicio19.class
 * 
 * 19) Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a palavra lida representa um palíndromo 
 * ou não (exemplo de palavras palíndromas: ovo, natan, sos, arara, etc).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		String palavra;
		int fim, cont = 0; 
		
		System.out.print("Digite uma palavra: ");
		palavra = leia.nextLine();
		fim = palavra.length()-1;
		
		for (int i = 0; i < palavra.length(); i++){
			if (palavra.charAt(i) == palavra.charAt(fim) ){
				cont++;
			}
			fim--;
		}
		
		if (palavra.length() == cont){
			System.out.print("Palindromo");
		}else{
			System.out.print("Nao e Palindromo");
		}
		
	}
}
