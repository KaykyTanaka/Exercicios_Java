/*
 * Exercicio19.class
 * 
 * 19) Escreva um programa para ler um vetor Z de 10 posições com elementos fornecidos pelo usuário e colocar os elementos em 
 * ordem crescente. Ao final imprimir o vetor Z ordenado
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio19 {

	public static void main(String[] args) {
		
		int z[] = new int[10];

		for (int i = 0; i < 10; i++) {
			z[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.print("Vetor Z: ");
		for (int i = 0; i < z.length; i++) {
			System.out.print("[" + z[i] + "]");
		}
		
		Arrays.sort(z);
		
		System.out.print("\nVetor Z em ordem crescente: ");
		for (int i = 0; i < z.length; i++) {
			System.out.print("[" + z[i] + "]");
		}
		
	}
}
