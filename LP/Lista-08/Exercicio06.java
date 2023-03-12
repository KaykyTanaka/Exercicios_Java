/*
 * Exercicio06.class
 * 
 * 6) Escreva um programa para ler 2 vetores de dimensão n (n<=15) e comparar os elementos do primeiro vetor com o segundo e 
 * informar a posição em que os elementos são iguais.
 * 
 * 
 */

public class Exercicio06 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*15)+1;
		int cont= 0;
		
		int vetor1[] = new int[n];
		int vetor2[] = new int[n];
		
		for (int i = 0; i < n; i++){
			vetor1[i] = (int)(Math.random()*5)+1;
			vetor2[i] = (int)(Math.random()*5)+1;
		}
		System.out.print("Vetor1: ");
		for (int i = 0; i < vetor1.length; i++){
			System.out.print(vetor1[i] + "|");
		}
		System.out.print("\nVetor2: ");
		for (int i = 0; i<vetor2.length; i++){
			System.out.print(vetor2[i] + "|");
		}
		
		System.out.print("\nOs elementos sao iguais na Posicao: ");
		
		for (int i = 0; i < n; i++){
			if (vetor1[i] == vetor2[i]){
				System.out.print(i + ", ");
			}
		}
		System.out.print("\b\b ");
		
		
		
	}
}
