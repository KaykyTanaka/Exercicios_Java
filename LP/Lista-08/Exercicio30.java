/* 
 * Exercicio30.class 
 *  
 * 30) Escreva um programa para gerar um vetor de double AK de dimensão e elementos definidos pelo usuário . Ordenar de forma 
 * crescente. Criar um vetor AL, tal que, este receba os elementos do vetor AK com a média entre cada dois elementos. 
 * Ex
 * Vetor AK [ 8.2, 10.0, 2.0, 6.0, 4.0 ] 
 * (vetor original - 5 elementos) 
 * 
 * Vetor AK [ 2.0, 4.0, 6.0, 8.2, 10.0 ] 
 * (vetor ordenado - 5 elementos) 
 * 
 * Vetor AL [ 2.0, 3.0 , 4.0, 5.0 , 6.0, 7.1 , 8.2, 9.1 , 10.0 ] 
 * (vetor com as médias - 9 elementos): Quantidade de elementos do vetor AK: 5 
 * 
 * 
 */
import java.util.Arrays;
public class Exercicio30 {
	public static void main(String[] args) {
		
		int n = (int)(Math.random()*15)+1;
		double ak[] = new double [n];
		double al[] = new double [(n*2)-1];
		int cont = 0;
		int x = 0;
		
		System.out.print("Vetor AK: ");
		for (int i = 0; i < ak.length; i++){
			ak[i] =(int)(Math.random()*10);
			System.out.print(" [" + ak[i]+ "] ");
		}
		Arrays.sort(ak);
		System.out.print("\nVetor AK (ordenado): ");
		for (int i = 0; i < ak.length; i++){
			System.out.print(" [" + ak[i]+ "] ");
		}
		
		
	}
}
