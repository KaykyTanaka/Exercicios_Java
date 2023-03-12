/*
 * Exercicio11.java
 * 
 * 11) Escreva um programa em Java para ler o número de alunos existentes em uma turma e, após isto, ler as
 * notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int alunos;
		int media = 0;
		int cont = 0;
		int notas = 0;

		System.out.print("Insira a quantidade total de alunos: ");
		alunos = leia.nextInt();

		do {
			System.out.print("Insira as notas: ");
			notas = leia.nextInt();
			cont++;
			media += notas;
		} while (cont < alunos);
		System.out.println("A media da sala é: " + (media / alunos));

	}
}
