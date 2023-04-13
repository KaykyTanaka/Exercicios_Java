/*
 * 
 * Exercicio02.java
 * 
 * 2) [ P OO - 00 2 ] Crie programa que solicite ao usuá rio um número tipo double. 
 * Após verifique se o número é zero ou não.  A verificação deve ser feita através de um método 
 * que receba um valor ( parâmetro de entrada ) e informe se ele é zero ou não através de um retorno do tipo boolean. 
 * Declare como: boolean isZero(double num).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		double numero = leia.nextDouble();

		System.out.print(isZero(numero) ? "O numero " + numero + " e zero" : "O numero " + numero + " NAO e zero");
	}

	static boolean isZero(double num) {

		return num == 0;
	}

}
