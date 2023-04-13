/*
 * Exercicio13.class
 * 
 * 13) Escreva um programa para ler um vetor de inteiros P de N elementos (N<=10) e imprimir o vetor lido. Ler outro vetor de 
 * inteiros Q de M elementos (M<=15) e imprimir este vetor lido. Construir outro vetor R com todos os elementos lidos de P e 
 * de Q e imprimir este vetor obtido. (Concatenação)
 * 
 * 
 */

public class Exercicio13 {
    public static void main(String[] args) {
		
		int n = (int)(Math.random()*10)+1;
		int m = (int)(Math.random()*15)+1;
		int p[] = new int[n];
		int q[] = new int[m];
		int r[] = new int[n+m];
		int x = 0;
		
		System.out.print("vetor P: ");
		for (int i = 0; i < p.length; i++){
			p[i] = (int)(Math.random()*100)+1;
			System.out.print(p[i] + " | ");
			r[x++] = p[i];
		}
		System.out.print("\nvetor Q: ");
		for (int i = 0; i < q.length; i++){
			q[i] = (int)(Math.random()*100)+1;
			System.out.print(q[i] + " | ");
			r[x++] = q[i];
		}
		
		System.out.print("\n\nvetor R: ");
		for (int i = 0; i < r.length; i++){
			System.out.print(r[i] + " | ");
		}
		
		
    }
}
