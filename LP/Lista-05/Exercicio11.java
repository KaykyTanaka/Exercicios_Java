/*
 * Exercicio11.java
 * 
 * 11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
 * que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
 * e ‘/’. Calcule e mostre a operação efetuada e o seu resultado. 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		String operador;

		System.out.print("Insira a operacao desejada (+, -, * ou /): ");
		operador = leia.next();

		System.out.print("Insira o primeiro valor: ");
		num1 = leia.nextInt();

		System.out.print("Insira o segundo valor: ");
		num2 = leia.nextInt();

		char operadorC = operador.charAt(0);

		switch (operadorC) {
			case '+':
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				break;
			case '/':
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				break;

			default:
				System.out.println("Insira um operador valido!");
		}

	}
}
