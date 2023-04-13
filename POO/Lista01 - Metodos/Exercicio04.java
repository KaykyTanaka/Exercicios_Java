/* 
 * 
 * Exercicio04.java
 * 
 * 4) [POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo
 * Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores,
 * 'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por
 * 'b² - 4ac'.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
		double a = leia.nextDouble();

		System.out.print("Digite o valor de b: ");
		double b = leia.nextDouble();

		System.out.print("Digite o valor de c: ");
		double c = leia.nextDouble();

		System.out.print("O valor de delta e: " + delta(a, b, c));
	}

	static double delta(double a, double b, double c) {

		return ((b * b) - (4 * a * c));
	}

}
