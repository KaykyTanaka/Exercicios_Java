/*
 * Exercicio25.class
 * 
 * 25) Escreva um programa para ler um vetor AF de dimensão definida e com elementos fornecidos pelo usuário e ordenar 
 * crescente de forma crescente os elementos IMPARES e decrescente os elementos PARES. Ao final imprimir o vetor AF ordenado.
 * 
 * 
 */
import java.util.Arrays;

public class Exercicio25 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*15)+1;
		int af[] = new int[n];
		int tamanhoP = 0;
		int tamanhoI = 0;
		int cont = 0;
		int cont2 = 0;
		int aux = 0;
		int aux2 = 0;
		
		System.out.print("Vetor AF: ");
		for (int i = 0; i < af.length; i++){
			af[i] = (int) (Math.random()*10)+1;
			System.out.print(" [" + af[i]+ "] ");
			if (af[i]%2==0){
				tamanhoP++;
			}else{
				tamanhoI++;
			}
		}
		
		int par[] = new int[tamanhoP];
		int impar[] = new int[tamanhoI];
		for(int i=0;i<af.length;i++){
			if(af[i]%2==0){
				par[cont]=af[i]; 
				cont++;       
			}
			
			if(af[i]%2==1){
				impar[cont2]=af[i]; 
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
		
		aux=0;
		
		for(int i = 0; i<impar.length; i++){
			for(int j = 0; j<impar.length-1; j++){
				if(impar[j] < impar[j + 1]){
				aux = impar[j];
				impar[j] = impar[j+1];
				impar[j+1] = aux;
				}
			}
		}
		
		for(int i=0;i<af.length;i++){
			if(af[i]%2==0){
				af[i]=par[aux2++];
			}
		}
		aux2=0;
		for(int i=0;i<af.length;i++){
			if(af[i]%2==1){
				af[i]=impar[aux2++];
			}
		}
		
		
		System.out.print("\nVetor AF ordenado: ");         
		for(int i=0;i<af.length;i++){
			System.out.print(" [" + af[i]+ "] ");
		}
	}
}
