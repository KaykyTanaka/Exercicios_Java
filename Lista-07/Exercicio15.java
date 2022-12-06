/*
 * Exercicio15.class
 * 
 * 15) Escreva um programa que informe se em uma frase fornecida pelo usuário existem caracteres numéricos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toLowerCase();
		
		for (int i = '0'; i <= '9'; i++){
			for (int j = 0; j < frase.length(); j++){
				if(frase.charAt(j) == i){
					cont++;
				}
			}
		}
		if(cont > 0){
			System.out.println("A frase possui caracteres numericos!");
		}else{
			System.out.println("A frase NAO possui caracteres numericos");
		}
		
		
		
	}
}