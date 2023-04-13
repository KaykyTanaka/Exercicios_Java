
/* 
 * Exercicio26.class 
 *  
 * 26) Escreva um programa para ler um vetor AG de dimensão e com elementos fornecidos pelo usuário e colocar, somente, os 
 * elementos PRIMOS em ordem crescente. Ao final imprimir o vetor AG ordenado. 
 * 
 * 
 */

public class Exercicio26 {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 15) + 1;
		int ag[] = new int[n];
		int tamanho = 0;
		int cont = 0;
		int aux;

		System.out.print("Vetor AF: ");
		for (int i = 0; i < ag.length; i++) {
			ag[i] = (int) (Math.random() * 100) + 1;
			System.out.print(" [" + ag[i] + "] ");
			for (int k = 2; k < ag.length; k++) {
				cont = 0;
				for (int j = 1; j <= k; j++) {
					if (k % j == 0) {
						cont++;
					}
				}
				if (cont == 2) {
					tamanho++;
				}
			}
		}
		int primo[] = new int[tamanho];
		for (int i = 0; i < ag.length; i++) {
			if (ag[i] % 2 == 0) {
				primo[cont] = ag[i];
				cont++;
			}
		}
		for (int i = 0; i < primo.length; i++) {
			for (int j = 0; j < primo.length - 1; j++) {
				if (primo[j] > primo[j + 1]) {
					aux = primo[j];
					primo[j] = primo[j + 1];
					primo[j + 1] = aux;
				}
			}
		}

		System.out.print("\nVetor ordenado: ");
		for (int i = 0; i < ag.length; i++) {
			System.out.print(" [" + ag[i] + "] ");
		}
	}
}
