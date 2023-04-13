/*
 * Exercicio27.class
 * 
 * 27) Escreva um programa para solicitar ao usuário duas Strings. Se forem de mesmo tamanho, concatenar seus caracteres, 
 * caso contrário, informar ao usuário. 
 * Ex: 
 * 
 * Entrada 1: banana 
 * Entrada 2: uva
 * Saída: Erro! Entradas de tamanhos diferentes.
 * 
 * Entrada 1: bananas
 * Entrada 2: pitanga
 * Saída: bpaintaannagsa
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String palavra1 = "";
		String palavra2 = "";
		String saida = "";
		
		System.out.print("Insira a primeira palavra: ");
		palavra1 = leia.nextLine();
		
		System.out.print("Insira a segunda palavra: ");
		palavra2 = leia.nextLine();
		
		if (palavra1.length() == palavra2.length()){
			for (int i = 0; i < palavra1.length(); i++){
				saida += palavra1.charAt(i);
				saida += palavra2.charAt(i);
			}
			
			System.out.println("Saida: " + saida);
			
		}else{
			System.out.println("Erro! Entradas de tamanhos diferentes.");
			
		}
		
		
		
	}
}
