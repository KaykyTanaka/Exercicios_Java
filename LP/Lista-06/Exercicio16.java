/*
 * Exercicio16.java
 * 
 * 16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15
 * (inclusive) e 100 (inclusive).
 * 
 * 
 */

public class Exercicio16 {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		for (int i = 15; i <= 100; i++) {
			total += i;
			contador++;
		}
		System.out.println(total / contador);

	}
}
