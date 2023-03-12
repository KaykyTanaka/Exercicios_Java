/*
 * Exercicio23.java
 * 
 * 23) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em
 * Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
 * a) Média de salário da população;
 * b) Média do número de filhos;
 * c) Maior salário dos habitantes;
 * d) Percentual de pessoas com salário menor que R$ 150,00.
 * Obs.: O final das leituras dos dados se dará com a entrada de um 'salário negativo'.
 * 
 */

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double salario;
		double totalS = 0;
		double maior = 0;
		int numFilhos;
		int totalF = 0;
		int contador = 0;
		int contMenor = 0;

		do {
			System.out.print("Salario: ");
			salario = leia.nextDouble();
			

			if (salario >= 0) {
				System.out.print("Numero de filhos: ");
				numFilhos = leia.nextInt();
				contador++;
				totalS += salario;
				totalF += numFilhos;

				if (salario > maior) {
					maior = salario;
				}

				if (salario < 150) {
					contMenor++;
				}
			}

		} while (salario >= 0);

		System.out.println("\nMedia de salario da populacao: " + (totalS / contador));
		System.out.println("Media do numero de filhos: " + (totalF / contador));
		System.out.println("Maior salario dos habitantes: " + (maior));
		System.out.println(
				"Percentual das pessoas com salario menor que R$150.00: " + ((contMenor * 100) / contador) + "%");

	}
}
