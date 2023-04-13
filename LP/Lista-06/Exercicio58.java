/*
 * Exercicio58.java
 * 
 * 
 * 58) Solicite ao usuário os dois primeiros termos da sequência de Ricci e gere os 10 próximos termos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio58 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, ricci;
		int cont = 0;
		
		System.out.print("Digite o primeiro termo da sequencia: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo termo: ");
		n2 = leia.nextInt();
		
		System.out.print(n1 + " "+n2 + " ");
		do{
			
			ricci = n1+n2;
			n1 = n2;
			n2 = ricci;
			cont++;
			System.out.print(ricci + " ");
		} while (cont<=10);
		
		
		
	}
}
