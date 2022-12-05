/*
 * Exercicio46.java
 * 
 * 46) Solicite ao usuário um número e verifique se este número é primo ou não.
 * 
 * 
 */

import java.util.Scanner;
public class Exercicio46 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, cont = 0;
		
		System.out.print("Digite um numero: ");
		num = leia.nextInt();
		
		for (int i = 1; i <= num; i++){
			if(num%i == 0){
				cont++;
			}
		}
		
		if(cont == 2){
			System.out.println(num + " e primo");
		}else{
			System.out.println(num + " nao e primo");
		}
		
		
		
	}
}
