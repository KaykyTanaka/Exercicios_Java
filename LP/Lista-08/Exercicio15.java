/*
 * Exercicio15.class
 * 
 * 15) Escreva um programa para ler um vetor de inteiros S de N elementos (N<=10) e imprimir o vetor lido. Ler outro vetor de 
 * inteiros T de M elementos (M<=15) e imprimir este vetor lido. Construir outro vetor U com todos os elementos lidos de S e 
 * de T e imprimir este vetor obtido. (Intercalação)
 * 
 * 
 */
import java.util.Arrays;
public class Exercicio15 {
    public static void main(String[] args) {
		
		int n = (int)(Math.random()*10)+1;
		int m = (int)(Math.random()*15)+1;
		int s[] = new int[n];
		int t[] = new int[m];
		int u[] = new int[n+m];
		int x = 0;
		int y = 0;
		
		System.out.print("vetor S: ");
		for (int i = 0; i < s.length; i++){
			s[i] = (int)(Math.random()*100)+1;
			System.out.print(s[i] + " | ");
		}
		System.out.print("\nvetor T: ");
		for (int i = 0; i < t.length; i++){
			t[i] = (int)(Math.random()*100)+1;
			System.out.print(t[i] + " | ");
		}
		for(int k=0;k<u.length;)
		{
			if(x<s.length)
			{
				u[k++]=s[x++];
			}
			if(y<t.length)
			{
				u[k++]=t[y++];
			}
		}
		
		System.out.print("\nvetor U: ");
		for(int i=0;i<u.length;i++){
			
			System.out.print(u[i] + " | ");
		
		}
    }
}
