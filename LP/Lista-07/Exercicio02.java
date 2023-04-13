/*
 * Exercicio02.java
 * 
 * 2)Declarar uma variável do tipo String com seu valor inicial igual a branco ("") 
 * e a seguir atribuir as letras maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, 
 * as primeiras vinte e seis posições da variável String. Imprimir o resultado.
 * 
 * 
 */

public class Exercicio02 {

	public static void main(String[] args) {

		String letras = "";
		for (int i = 65; i <= 90; i++) {
			letras += (char) i;
		}
		System.out.print(letras);

	}
}