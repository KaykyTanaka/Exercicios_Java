/*
 * Exercicio01.java
 * 
 * 1) [POO-014] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário
 * deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de
 * conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro
 * de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a
 * fórmula F= (9*C/5) + 32.
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		int celsius = leia.nextInt();

		System.out.println("A temperatura em Fahrenheit é: " + converter(celsius));

	}

	static int converter(int temp) {

		return (9 * temp / 5) + 32;
	}
}
