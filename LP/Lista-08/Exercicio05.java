/*
 * Exercicio05.class
 * 
 * 5) Escreva um programa para ler 2 vetores de dimensão n (n<=15) e calcular a soma entre eles gerando um terceiro vetor de 
 * mesma dimensão
 * 
 * 
 */

public class Exercicio05 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 15) + 1;

		int vetor1[] = new int[x];
		int vetor2[] = new int[x];
		int vetor3[] = new int[x];

		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = (int) (Math.random() * 100) + 1;
			vetor2[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.print("Vetor1: ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + "|");
		}
		System.out.print("\nVetor2: ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + "|");
		}

		System.out.println("\nVetor3: ");
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.print(vetor3[i] + "|");
		}
	}
}
