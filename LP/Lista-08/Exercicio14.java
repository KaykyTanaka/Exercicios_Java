/*
 * Exercicio14.class
 * 
 * 14) Escreva um programa para ler um vetor de inteiros S de 10 elementos e imprimir o vetor lido. Ler outro vetor de 
 * inteiros T de 15 elementos e imprimir este vetor lido. Construir outro vetor U com todos os elementos lidos de S e de T e 
 * imprimir este vetor obtido. (Intercalação)
 * 
 * 
 */
import java.util.Arrays;
public class Exercicio14 {
    public static void main(String[] args) {
		
		int s[] = new int[10];
		int t[] = new int[15];
		int u[] = new int[25];
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
		
		System.out.print("\nvetor U: ");
		for(int i=0;i<u.length;i++){
				if(i%2==0){
					if(i<20){
						u[i]=s[x];
						x++;
					}
					else{
						u[i]=t[y];
						y++;
					}
				}else{
					u[i]=t[y];
					y++;
				}
			
			System.out.print(u[i] + " | ");
		
		}
    }
}
