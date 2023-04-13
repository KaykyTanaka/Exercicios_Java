/*
 * Conversao.java
 * 
 * 3 - Crie um arquivo chamado Conversao.java. Crie uma variável chamada texto do tipo String e
 * associe a ela a sequência de caracteres "19.09". Depois, faça a conversão do valor associado a essa
 * variável para double e armazene o resultado em uma variável chamada numero do tipo double. Por
 * fim, exiba o valor da variável numero.
 * 
 * 
 */

public class Conversao {

	public static void main(String[] args) {
		String text = "19.09";
		double numero = Double.parseDouble(text);
		System.out.println("texto: " + text + "\nnumero = " + numero);
	}
}
