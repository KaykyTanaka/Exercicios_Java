/* 
 * 6 – Crie um arquivo chamado ValorNull.java. Implemente um programa em Java que declare uma
 * variável do tipo Double chamada numero. Essa variável deve ser inicializada com o valor 3.14.
 * Exiba o valor dessa variável na saída padrão. Depois, armazene o valor null na variável numero.
 * Por fim, exiba novamente o valor dessa variável na saída padrão.
 * 
 */

public class ValorNull {
	public static void main (String[] args) {
		Double numero = 3.14;
		System.out.println("Numero: " + numero);
		
		numero = null;
		System.out.println("Numero: " + numero);
	}
}
