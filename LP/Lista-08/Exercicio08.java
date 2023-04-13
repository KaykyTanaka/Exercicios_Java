
/*
 * Exercicio08.class
 * 
 * 8) Escreva um programa para ler 5 elementos do vetor F de inteiros. Calcular e imprimir a soma dos elementos ímpares. 
 * Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste caso, mostrar uma mensagem.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio08 {

	public static void main(String[] args) {

		int f[] = new int[5];
		int soma = 0;
		boolean impar = false;

		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.print("Vetor F: ");
		for (int i = 0; i < f.length; i++) {
			System.out.print("[" + f[i] + "]");
		}
		System.out.print("\nElementos Impares: ");
		for (int i = 0; i < f.length; i++) {
			if (f[i] % 2 != 0) {
				System.out.print("[" + f[i] + "]");
				soma += f[i];
				impar = true;
			}
		}
		if (impar == false) {
			System.out.println("Nao ha elementos impares no vetor F");
		} else {
			System.out.println("\nA soma dos elementos impares resulta em: " + soma);
		}

	}
}
