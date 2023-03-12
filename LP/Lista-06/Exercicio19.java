/*
 * Exercicio19.java
 * 
 * 19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque.
 * Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS
 * MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em
 * estoque.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int contador = 0;
		double preco, total = 0;
		char resp;

		do {
			System.out.print("Digite o preco da mercadoria: R$");
			preco = leia.nextDouble();
			total += preco;
			contador++;

			System.out.println("\nMais mercadoria? (S/N)? ");
			resp = leia.next().charAt(0);

		} while (resp == 83 || resp == 115);

		System.out.println("A media de valor das mercadorias e: R$" + (total / contador));

	}
}
