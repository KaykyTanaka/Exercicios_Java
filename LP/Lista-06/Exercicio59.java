/*
 * Exercicio59.java
 * 
 * 
 * 59) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois solicite a quantidade de termos que ele 
 * deseja gerar. Imprimir o resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio59 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, ricci, qtd;
		int cont = 0;
		
		System.out.print("Digite o primeiro termo da sequencia: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo termo: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite a quantidade de termos a serem gerados: ");
		qtd = leia.nextInt();
		
		System.out.print(n1 + " "+n2 + " ");
		
		do{
			
			ricci = n1+n2;
			n1 = n2;
			n2 = ricci;
			cont++;
			System.out.print(ricci + " ");
		} while (cont<qtd);
		
		
		
	}
}
