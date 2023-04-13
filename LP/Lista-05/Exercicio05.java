/*
 * Exercicio05.java
 * 
 * 5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
 * Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
 * considerar o mês em que a pessoa nasceu).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int atual, nascimento, idade;

		System.out.print("Digite o ano atual: ");
		atual = leia.nextInt();

		System.out.print("Digite o ano de seu nascimento: ");
		nascimento = leia.nextInt();

		idade = atual - nascimento;

		if ((idade) < 18) {
			System.out.println("Sua idade: " + idade + "\nNao e necessario votar");
		} else {
			System.out.println("Sua idade: " + idade + "\nE necessario votar");
		}

	}
}
