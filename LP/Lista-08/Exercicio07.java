
/*
 * Exercicio07.class
 * 
 * 7) Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N<=20), determinar e imprimir o maior e o menor 
 * elemento deste vetor.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio07 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 20) + 1;
		int e[] = new int[n];

		for (int i = 0; i < n; i++) {
			e[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.print("Vetor E: ");
		for (int i = 0; i < e.length; i++) {
			System.out.print("[" + e[i] + "]");
		}
		Arrays.sort(e);

		System.out.println("\nMaior elemento: " + e[e.length - 1]);
		System.out.println("Menor elemento: " + e[0]);
	}
}
