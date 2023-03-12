/*
 * Exercicio21.class
 * 
 * 21) Escreva um programa para ler um vetor AB de 10 posições com elementos fornecidos pelo usuário. Para cada elemento 
 * ímpar encontrado, multiplique ele por dois, gerando assim um vetor de elementos pares e ao final exiba o resultado.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio21 {

	public static void main(String[] args) {
		
		int ab[] = new int[10];

		for (int i = 0; i < 10; i++) {
			ab[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.print("Vetor AB: \n");
		for (int i = 0; i < ab.length; i++) {
			System.out.print(" [" + ab[i] + "] ");
		}
		
		System.out.print("\nVetor de elementos pares: \n");
		for (int i = 0; i < ab.length; i++) {
			if (ab[i]%2!=0){
				System.out.print(" [" + ab[i]*2 + "] ");
			}else{
				System.out.print(" [" + ab[i] + "] ");
			}
		}
		
		
	}
}
