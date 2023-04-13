/*
 * Exercicio06.java
 * 
 * 6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
 * iguais) e escrever o maior deles.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		System.out.print("Insira um valor: ");
		a = leia.nextInt();
		System.out.print("Insira outro valor: ");
		b = leia.nextInt();

		if (a != b) {
			System.out.println("Os numeros digitados foram: " + a + " e " + b);
			if (a > b) {
				System.out.println(a + " e o maior numero");
			} else {
				System.out.println(b + " e o maior numero!");
			}
		} else {
			System.out.println("Insira valores diferentes!");
		}

	}
}
