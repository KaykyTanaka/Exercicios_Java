/*
 * Exercicio18.class
 * 
 * 17) Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são iguais. Observação: realizar 
 * esta verificação caractere por caractere.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase1, frase2;
		int cont = 0;
		
		System.out.print("Digite uma frase: ");
		frase1 = leia.nextLine();
		
		System.out.print("Digite outra frase: ");
		frase2 = leia.nextLine();
		
		for (int i = 0; i < frase1.length(); i++){
			for (int j = 0; j < frase2.length(); j++){
				if(frase1.charAt(i) != frase2.charAt(i)){
					cont++;
				}
			}
		}
		
		if (cont == 0){
			System.out.println("As frases digitadas sao iguais");
		}else{
			System.out.println("As frases digitadas NAO sao iguais");
		}
	}
}