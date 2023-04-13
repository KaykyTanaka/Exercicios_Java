/*
 * 
 * Exercicio05.java
 * 
 * 5) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do
 * segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja
 * maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma,
 * assim retorne zero.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double a, b, c;

		do {
			System.out.print("Digite o valor de a: ");
			a = leia.nextDouble();

		} while (a == 0);

		System.out.print("Digite o valor de b: ");
		b = leia.nextDouble();

		System.out.print("Digite o valor de c: ");
		c = leia.nextDouble();

		System.out.println("\nO valor de delta e: " + delta(a, b, c));
		if (delta(a, b, c) < 0) {
		} else {
			System.out.println("Raiz 1: " + raiz1(a, b, c));
			System.out.println("Raiz 2: " + raiz2(a, b, c));
		}
	}

	static double delta(double a, double b, double c) {

		return ((b * b) - (4 * a * c));
	}

	static double raiz1(double a, double b, double c) {

		double delta = (b * b) - (4 * a * c);
		double resultado = (-b + Math.sqrt(delta)) / (2 * a);

		return (resultado);
	}

	static double raiz2(double a, double b, double c) {

		double delta = (b * b) - (4 * a * c);
		double resultado = (-b - Math.sqrt(delta)) / (2 * a);

		return (resultado);
	}

}
