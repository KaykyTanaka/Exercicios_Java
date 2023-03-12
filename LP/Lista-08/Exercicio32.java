/* 
 * Exercicio32.class 
 *  
 * 32) Escreva um programa para solicitar a entrada de um valor String (frases). Calcular a quantidade de palavras desta 
 * frase. Criar um vetor de String AN de dimensão N, sendo N a quantidade de palavras da frase. Colocar uma palavra em cada 
 * posição do vetor AN. Imprimir o vetor AN original. Ordenar o vetor de String AN de forma crescente. Imprimir o vetor AN 
 * ordenado. 
 * Ex: 
 * Frase: "joseverson perdeu o cavalo" 
 * Quantidade de palavras: 4 
 * Vetor AN [ "joseverson", "perdeu", "o", "cavalo" ] (vetor original - 4 elementos) 
 * Vetor AN [ "cavalo", "joseverson", "o", "perdeu" ] (vetor ordenado - 4 elementos)
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio32 {
	public static void main(String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase;
		int cont=1;
		
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		
		for (int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) == ' '){
				cont++;
			}
		}
		String an[] = new String [cont];
		an = frase.split(" ");
		
		System.out.print("\nFrase: "+frase);
		System.out.print("\nQuantidade de palavras: "+cont);
		System.out.print("\nVetor AN: ");
		for (int i = 0; i < an.length; i++){
			System.out.print(" [" + an[i] + "] ");
		}
		System.out.print("\nVetor AN(ordenado): ");
		Arrays.sort(an);
		for (int i = 0; i < an.length; i++){
			System.out.print(" [" + an[i] + "] ");
		}
		
	}
}
