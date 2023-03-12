/*
 * Exercicio24.class
 * 
 * 24) Escreva um programa para ler um vetor AE de dimensão e com elementos fornecidos pelo usuário e colocar, somente, os 
 * elementos IMPARES em ordem decrescente. Ao final imprimir o vetor AE ordenado.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio24 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*15)+1;
		int ae[] = new int[n];
		int tamanho = 0;
		int cont = 0;
		int aux = 0;
		int aux2 = 0;
		
		System.out.print("Vetor AE: ");
		for (int i = 0; i < ae.length; i++){
			ae[i] = (int) (Math.random()*10)+1;
			System.out.print(" [" + ae[i]+ "] ");
			if (ae[i]%2!=0){
				tamanho++;
			}
		}
		
		int impar[] = new int[tamanho];
		
		for(int i=0;i<ae.length;i++){
			
			if(ae[i]%2==1){
				impar[cont]=ae[i]; 
				cont++;       
				}
			}
		for(int i = 0; i<impar.length; i++){
			for(int j = 0; j<impar.length-1; j++){
				if(impar[j] < impar[j + 1]){
					aux = impar[j];
					impar[j] = impar[j+1];
					impar[j+1] = aux;    
				}
			}
		}
		
		for(int i=0;i<ae.length;i++){
			if(ae[i]%2==1){
				ae[i]=impar[aux2++];
			}
		}
		
		System.out.print("\nVetor AE ordenado: ");
		for(int i=0;i<ae.length;i++){
			System.out.print(" [" + ae[i]+ "] ");
		}
	}
}
