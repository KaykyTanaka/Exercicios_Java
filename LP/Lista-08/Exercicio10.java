/*
 * Exercicio10.class
 * 
 * 10) Escreva um programa para ler dois vetores PA e PB de inteiros de 5 elementos e imprimir os vetores lidos. Construir 
 * outro vetor PC de tamanho 10, com todos os elementos lidos de PA e de PB e imprimir este vetor obtido. (Concatenação)
 * 
 * 
 */
import java.util.Arrays;
public class Exercicio10 {
    public static void main(String[] args) {
		
		int pa[] = new int[5];
		int pb[] = new int[5];
		int pc[] = new int[10];
		int x = 0;
		
		System.out.print("vetor PA: ");
		for (int i = 0; i < 5; i++){
			pa[i] = (int)(Math.random()*100)+1;
			System.out.print(pa[i] + " | ");
			pc[x++] = pa[i];
		}
		System.out.print("\nvetor PB: ");
		for (int i = 0; i < 5; i++){
			pb[i] = (int)(Math.random()*100)+1;
			System.out.print(pb[i] + " | ");
			pc[x++] = pb[i];
		}
		
		System.out.print("\nvetor PC: ");
		for (int i = 0; i < pc.length; i++){
			System.out.print(pc[i] + " | ");
		}
		
		
		
		
		
		
		
		
		
		
		
    }
}
