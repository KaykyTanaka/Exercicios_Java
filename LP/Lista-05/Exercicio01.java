/*
 * Exercicio01.java
 * 
 * 1) Escreva um programa em Java para ler um valor e escrever a mensagem "É MAIOR QUE
 * 10!" se o valor lido for maior que 10, caso contrário escrever "NÃO É MAIOR QUE 10!".
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Insira um numero: ");
		int num = leia.nextInt();

		if (num == 10) {
			System.out.println("E IGUAL A 10!");
		} else {
			if (num > 10) {
				System.out.println("E MAIOR QUE 10!");
			} else {
				System.out.println("NAO E MAIOR QUE 10!");
			}
		}
	}
}
