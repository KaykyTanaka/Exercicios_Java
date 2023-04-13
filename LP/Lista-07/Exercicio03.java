/*
 * Exercicio03.java
 * 
 * 3) Declarar uma variável do tipo String com seu valor inicial igual a branco ("") e a seguir atribuir as letras minúsculas
 * do alfabeto (abcde...z), uma-a-uma, as primeiras vinte e seis posições da variável String. Imprimir o resultado.
 * 
 * 
 */

public class Exercicio03 {

	public static void main(String[] args) {

		String letras = "";
		for (int i = 'a'; i <= 'z'; i++) {
			letras += (char) i;
		}

		System.out.print(letras);

	}
}