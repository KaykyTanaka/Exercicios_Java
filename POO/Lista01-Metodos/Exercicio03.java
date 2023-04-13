/* 
 * 
 * Exercicio03.java
 * 
 * 3 )[POO - 003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número tipo double. 
 * Após verifique se o número é positivo, negativo ou zero. 
 * As verificações devem ser feitas através de métodos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		double numero = leia.nextDouble();

		System.out.print("O numero: " + numero
				+ (isZero(numero) ? " E zero" : isPositivo(numero) ? " E positivo" : " E negativo"));
	}

	static boolean isPositivo(double num) {

		return num > 0;
	}

	static boolean isZero(double num) {

		return num == 0;
	}

}
