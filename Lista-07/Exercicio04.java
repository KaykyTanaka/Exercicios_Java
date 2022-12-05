/*
 * Exercicio04.java
 * 
 * 4) Declarar uma variável do tipo String com seu valor inicial igual a branco ("") e a seguir atribuir os caracteres
 * numéricos (0123456789), um-a-um, as primeiras dez posições da variável String. Imprimir o resultado.
 * 
 * 
 */

public class Exercicio04 {

	public static void main(String[] args) {

		String letras = "";
		for (int i = 48; i <= 57; i++) {
			// System.out.println(i);
			letras += (char) i;
		}
		System.out.print(letras);
	}
}