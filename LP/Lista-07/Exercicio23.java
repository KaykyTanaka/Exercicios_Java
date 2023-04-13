/*
 * Exercicio23.class
 * 
 * 23) Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o sobrenome do nome completo 		
 * informado. Por exemplo, para o nome completo: Omero Francisco Bertol , o programa deverá fornecer como resultado: Bertol
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;

		System.out.print("Digite seu nome completo: ");
		nome = leia.nextLine();

		String[] sobrenome = nome.split(" ");

		System.out.print(sobrenome[sobrenome.length - 1]);
	}
}
