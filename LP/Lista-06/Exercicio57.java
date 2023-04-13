/*
 * Exercicio57.java
 * 
 * 
 * 57) Solicite ao usuário a quantidade de termos da sequência de números per feitos e imprima o resultado. (Atenção! Este 
 * processamento pode demorar MUITO)
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio57 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
		System.out.print("Insira a quantidade de termos: ");
		int qtd = leia.nextInt();
		int num = 1;
		int soma = 0;
		int cont = 0;
		

		do{
			soma = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					soma += i;
					//System.out.print(i + " + ");
				}
			}

			if (soma == num) {
				System.out.print(num + " | ");
				cont++;
			}
		
			num++;
		} while (cont<qtd);

	}
}
