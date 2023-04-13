/*
 * Exercicio20.class
 * 
 * 20) Escreva um programa para ler um vetor AA de 10 posições com elementos fornecidos pelo usuário e colocar os elementos 
 * em ordem decrescente. Ao final imprimir o vetor AA ordenado.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int aa[] = new int[10];

		for (int i = 0; i < 10; i++) {
			aa[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.print("Vetor AA: ");
		for (int i = 0; i < aa.length; i++) {
			System.out.print("[" + aa[i] + "]");
		}
		
		Arrays.sort(aa);
		
		System.out.print("\nVetor Z em ordem decrescente: ");
		for (int i = aa.length-1; i >= 0; i--) {
			System.out.print("[" + aa[i] + "]");
		}
		
	}
}
