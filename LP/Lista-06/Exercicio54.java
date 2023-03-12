/*
 * Exercicio54.java
 * 
 * 
 * 54) Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci (intervalo fechado) e imprima o resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int f, inicial, fim;
		int proximo = 1;
		int anterior = 0;
		int cont = 0;

		System.out.print("Insira o termo inicial da sequência de Fibonacci: ");
		inicial = leia.nextInt();
		System.out.print("Insira o termo final: ");
		fim = leia.nextInt();

		do {

			cont++;
			if (cont >= inicial) {
				System.out.print(anterior + " ");
			}
			f = anterior + proximo;
			anterior = proximo;
			proximo = f;
		} while (cont < fim);

	}
}
