/*
 * Exercicio03.java
 * 
 * 3) [POO-016] ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de
 * temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A
 * saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit
 * e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a
 * temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos
 * de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser
 * executado enquanto o usuário desejar.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);

		char opc;
		int temp;

		do {
			System.out.print("Digite uma opcao [C]Celsius, [F]Fahrenheit, [K]Kelvin e [S]Sair: ");
			opc = leiaStr.nextLine().toUpperCase().charAt(0);

			if (opc == 'C') {
				System.out.print("\nDigite a temperatura em Celsius: ");
				temp = leia.nextInt();
				System.out.println(saidaC(temp));

			} else {
				if (opc == 'F') {
					System.out.print("\nDigite a temperatura em Fahrenheit: ");
					temp = leia.nextInt();
					System.out.println(saidaF(temp));
				} else {
					if (opc == 'K') {
						System.out.print("\nDigite a temperatura em Kelvin: ");
						temp = leia.nextInt();
						System.out.println(saidaK(temp));
					} else {
						if (opc == 'S') {
							System.out.println("Saindo...");

						} else {
							System.out.println("Opcao Invalida!");
						}
					}
				}
			}

		} while (opc != 'S');

	}

	static String saidaC(int temp) {
		int f = (9 * temp / 5) + 32;
		int k = temp + 273;
		return "A temperatura em Fahrenheit é: " + f + "\nA temperatura em Kelvin é: " + k;
	}

	static String saidaF(int temp) {
		int c = 5 * (temp - 32) / 9;
		int k = c + 273;
		return "A temperatura em Celsius é: " + c + "\nA temperatura em Kelvin é: " + k;
	}

	static String saidaK(int temp) {
		int c = temp - 273;
		int f = (9 * c / 5) + 32;
		return "A temperatura em Celsius é: " + c + "\nA temperatura em Fahrenheit é: " + f;
	}

}
