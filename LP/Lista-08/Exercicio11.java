/*
 * Exercicio11.class
 * 
 * 11) Escreva um programa para ler dois vetores QA e QB de inteiros de 5 elementos e imprimir os vetores lidos. Construir 
 * outro vetor QC de tamanho 10, com todos os elementos lidos de QA e de QB e imprimir este vetor obtido. (Intercalação)
 * 
 * 
 */
import java.util.Arrays;
public class Exercicio11 {
    public static void main(String[] args) {
		
		int qa[] = new int[5];
		int qb[] = new int[5];
		int qc[] = new int[10];
		int x = 0;
		
		System.out.print("vetor QA: ");
		for (int i = 0; i < 5; i++){
			qa[i] = (int)(Math.random()*100)+1;
			System.out.print(qa[i] + " | ");
		}
		System.out.print("\nvetor QB: ");
		for (int i = 0; i < 5; i++){
			qb[i] = (int)(Math.random()*100)+1;
			System.out.print(qb[i] + " | ");
		}
		
		System.out.print("\nvetor QC: ");
		for(int i=0;i<qc.length;i++){
			if(i%2==1){
				qc[i]=qb[x];
				x++;
			}else{
				qc[i]=qa[x];
			}
			System.out.print(qc[i] + " | ");
		}
    }
}
