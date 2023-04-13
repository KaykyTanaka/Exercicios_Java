/*
 * Exercicio17.java
 * 
 * 17) Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
 * média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
 * Ao final da execução a mensagem NOVO CALCULO (S/N)? deve ser apresentada. Se for respondido S deve
 * retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2;

		char resp;

		do {
			System.out.print("Digite a nota da 1a. avaliacao: ");
			nota1 = leia.nextInt();
			System.out.print("Digite a nota da 2a. avaliacao: ");
			nota2 = leia.nextInt();

			if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
				System.out.println("Insira numeros validos!");
			} else {
				System.out.println("Media do aluno: " + (nota1 + nota2) / 2);
			}
			System.out.println("\nNovo calculo (S/N)? ");
			resp = leia.next().charAt(0);

		} while (resp == 83 || resp == 115);
	}
}
