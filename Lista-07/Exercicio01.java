/*
 * Exercicio01.java
 * 
 * 1) Exibir na tela os caracteres da tabela de códigos ASCII (American Standard Code for Information Interchange).
 * 
 * 
 */

public class Exercicio01 {

	public static void main(String[] args) {

		for (int i = 0; i <= 126; i++) {
			System.out.print((char) i + " ");
		}
	}
}