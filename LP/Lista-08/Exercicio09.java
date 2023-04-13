/*
 * Exercicio09.class
 * 
 * 9) Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir um novo vetor H, tal que, este seja 
 * formado pelos elementos pares do vetor G lido. Supor que o vetor poderá não ter nenhum elemento com esta propriedade e 
 * neste caso, mostrar uma mensagem e encerrar o programa.
 * 
 * 
 */

public class Exercicio09 {

	public static void main(String[] args) {

		int g[] = new int[5];
		int h[];
		int cont = 0;
		int par = 0;

		System.out.print("Vetor G: ");
		for (int i = 0; i < g.length; i++) {
			g[i] = (int) (Math.random() * 100) + 1;
			System.out.print(" [ " + g[i] + " ] ");
			if (g[i] % 2 == 0) {
				cont++;
			}
		}

		if (cont == 0) {
			System.out.println("Nao ha elementos pares no vetor G");
		} else {

			h = new int[cont];
			for (int i = 0; i < g.length; i++) {
				if (g[i] % 2 == 0) {
					h[par++] = g[i];
				}
			}

			System.out.print("\nVetor H: ");
			for (int i = 0; i < h.length; i++) {
				System.out.print(" [ " + h[i] + " ] ");
			}
		}
	}
}
