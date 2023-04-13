/*
 * TestaVariavelPeso.java
 * 
 * 8 - Crie um arquivo chamado TestaVariavelPeso.java . Implemente um programa em Java que 
 * declare uma variável do tipo double chamada peso . Essa variável deve ser inicializada com o valor 
 * do seu peso.  * No final, exiba o valor dessa variável na saída padrão usando o println() e o printf() .
 * 
 */


public class TestaVariavelPeso {
	
	public static void main (String[] args) {
		
		double peso = 52.5;
		System.out.println("Seu peso é:" + peso);
		System.out.printf("Seu peso é: %.2f", peso);
	}
}

