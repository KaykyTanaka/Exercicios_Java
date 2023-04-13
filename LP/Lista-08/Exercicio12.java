/*
 * Exercicio12.class
 * 
 * 12) Escreva um programa para ler um vetor de inteiros P de 10 elementos e imprimir o vetor lido. Ler outro vetor de 
 * inteiros Q de 15 elementos e imprimir este vetor lido. Construir outro vetor R com todos os elementos lidos de P e de Q e 
 * imprimir este vetor obtido. (Concatenação)
 * 
 * 
 */
public class Exercicio12 {
    public static void main(String[] args) {
		
			
		int p[] = new int[10];
		int q[] = new int[15];
		int r[] = new int[25];
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
