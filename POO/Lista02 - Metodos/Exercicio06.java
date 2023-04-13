/*
 * 
 * Exercicio06.java
 * 
 * 6) [POO-011] Crie um programa que solicite ao usuário números inteiros. 
 * A cada número inserido, perguntar ao usuário se ele deseja informar outro número. 
 * Através de um método, verifique e retorne o menor dos valores. 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		int num, aux, aux2 = 0;
		int cont = 0;
		char opc;

		do {

			System.out.print("Digite um número: ");
			num = leia.nextInt();
			aux = num;

			if (cont > 0) {
				aux2 = menor(aux, aux2);
			} else {
				aux2 = num;
			}

			System.out.print("Inserir outro[s/n]: ");
			opc = leiaStr.next().toLowerCase().charAt(0);
			cont++;

		} while (opc == 's');

		System.out.println("O menor número digitado foi: " + aux2);

	}

	static int menor(int num1, int num2) {
		return Math.min(num1, num2);
	}

}