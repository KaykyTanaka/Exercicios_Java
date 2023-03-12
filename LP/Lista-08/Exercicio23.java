/*
 * Exercicio23.class
 * 
 * 23) Escreva um programa para ler um vetor AD de dimensão definida e com elementos fornecidos pelo usuário e colocar, 
 * somente, os elementos PARES em ordem crescente. Ao final imprimir o vetor AD ordenado.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio23 {

	public static void main(String[] args) {
		
		int ad[] = new int[10];
		int par[];
		int cont = 0;
		int cont2 = 0;
		int aux = 0;
		int aux2 = 0;
		
		System.out.print("Vetor AD: ");
		for (int i = 0; i < ad.length; i++){
			ad[i] = (int) (Math.random()*10)+1;
			System.out.print(" [" + ad[i]+ "] ");
			if (ad[i]%2==0){
				cont++;
			}
		}
		par = new int[cont];
		
		for(int i=0;i<ad.length;i++){
			if(ad[i]%2==0){
				par[cont2]=ad[i]; 
				cont2++;
			}
		} 
		
		for(int i = 0; i<par.length; i++){
			for(int j = 0; j<par.length-1; j++){
				if(par[j] > par[j + 1]){
					aux = par[j];
					par[j] = par[j+1];
					par[j+1] = aux;
				}
			}
		}
		
		for(int i=0;i<ad.length;i++){
			if(ad[i]%2==0){
				ad[i]=par[aux2++];
			}
		}
		System.out.print("\nVetor AD com numeros pares ordenados: ");         
		for(int i=0;i<ad.length;i++){
			System.out.print(" ["+ad[i]+"] ");
		}
	}
}
