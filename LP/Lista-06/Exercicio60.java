/*
 * Exercicio60.java
 * 
 * 
 * 60) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois solicite a número e verifique se o número 
 * informado pertence a sequência de Ricci ou não.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio60 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, ricci, num;
		
		System.out.print("Digite o primeiro termo da sequencia: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo termo: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite um numero e veja se ele pertence a sequencia Ricci: ");
		num = leia.nextInt();
		

		
		do{
			
			ricci = n1+n2;
			n1 = n2;
			n2 = ricci;
			//System.out.print(ricci + " ");
			if (num == ricci){
				System.out.print("O numero: " + num + " pertence a sequencia Ricci");
				break;
			}
		} while (ricci<=num);
		
		if(num != ricci){
			System.out.print("O numero: " + num + " NAO pertence a sequencia Ricci");
		}
		
		
	}
}
