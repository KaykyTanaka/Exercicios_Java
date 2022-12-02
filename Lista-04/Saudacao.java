/*
 * Saudacao.java
 * 
 * 7 - Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma
 * variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a
 * mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11],
 * Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23].
 * Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre
 * fazendo todas as validações necessárias.
 * 
 * 
 */

import java.util.Scanner;
import java.lang.Math;
public class Saudacao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int hora, opc;

		System.out.println("Opcoes\n1- Inserir as horas\n2- Gerar hora aleatoria");
		System.out.print("\nInsira a opcao desejada: ");
		opc = leia.nextInt();

		if (opc == 1 || opc == 2) {
			if (opc == 1) {
				System.out.print("\nInsira a hora: ");
				hora = leia.nextInt();
			} else {
				hora = (int) (Math.random() * 24);
			}

			System.out.println("Horario: " + hora);

			if (hora < 7) {
				System.out.println("Zzzzz");
			}

			if (hora >= 7 && hora < 12) {
				System.out.println("Bom Dia!");
			}

			if (hora >= 12 && hora < 18) {
				System.out.println("Boa Tarde!");
			}

			if (hora >= 18 && hora < 24) {
				System.out.println("Boa Noite!");
			}

		} else {
			System.out.println("Insira uma opcao valida!");
		}

	}
}
