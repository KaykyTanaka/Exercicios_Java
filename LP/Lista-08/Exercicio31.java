/* 
 * Exercicio31.class 
 *  
 * 31) Escreva um programa para criar um vetor de String AM de dimensão N definida pelo usuário (N<=10). Solicitar a entrada 
 * dos N valores String (palavras ou frases). Imprimir o vetor AM original. Ordenar o vetor de String AM de forma crescente. 
 * Imprimir o vetor AM ordenado. 
 * Ex: 
 * Quantidade de elementos do vetor AM: 5 
 * Vetor AM [ "mamao", "abacate", "jaca", "uva", "banana" ] (vetor original - 5 elementos) 
 * Vetor AM [ "abatacate", "banana", "jaca", "mamao", "uva" ] (vetor ordenado - 5 elementos) 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio31 {
	public static void main(String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		
		int n = (int)(Math.random()*10)+1;
		String am[] = new String [n];
		int x = 0;
	
		do{
			System.out.print("Digite uma palavra(" + x + "/" + (am.length-1)+"): ");
			am[x] = leiaStr.nextLine();
			x++;
		} while (x<am.length);
		
		System.out.print("\nVetor AM: ");
		for (int i = 0; i < am.length; i++){
			System.out.print(" [" + am[i]+ "] ");
		}
		Arrays.sort(am);
		System.out.print("\nVetor AM (ordenado): ");
		for (int i = 0; i < am.length; i++){
			System.out.print(" [" + am[i]+ "] ");
		}
		
		
	}
}
