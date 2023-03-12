/*
 * Exercicio18.java
 * 
 * 18) Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
 * Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
 * valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int estoque, contador = 0;
		double preco, total = 0;

		System.out.print("Insira o numero total de mercadorias no estoque: ");
		estoque = leia.nextInt();

		do {
			System.out.print("Digite o preco da mercadoria " + (estoque--) + ": R$");
			preco = leia.nextDouble();
			total += preco;
			contador++;

		} while (estoque > 0);

		System.out.println("A media de valor das mercadorias e: R$" + (total / contador));

	}
}
