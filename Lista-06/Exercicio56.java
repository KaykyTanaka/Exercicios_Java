/*
 * Exercicio56.java
 * 
 * 
 * 56) Imprima os números perfeitos na faixa de 1 a 900
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio56 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
		int num = 1;
		int soma = 0;

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
			}
		
			num++;
		} while (num<=900);

	}
}
