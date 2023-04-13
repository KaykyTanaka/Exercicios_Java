/*
 * Exercicio04.java
 * 
 * 4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
 * aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
 * ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
 * também a média calculada.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, media;

		System.out.print("Insira sua nota da primeira avaliacao: ");
		nota1 = leia.nextDouble();

		System.out.print("Insira sua nota da segunda avaliacao: ");
		nota2 = leia.nextDouble();

		media = (nota1 + nota2) / 2;

		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			System.out.print("Valores Invalidos!");
		} else {
			if (media >= 6) {
				System.out.println("Aluno APROVADO" + "\nMedia = " + media);
			} else {
				System.out.print("Aluno REPROVADO" + "\nMedia = " + media);
			}
		}
	}
}
