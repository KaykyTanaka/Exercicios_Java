/*
 * Exercicio05.java
 * 
 * 5) [POO-018] Crie um programa que imprima na tela todos os números primos de 1 até 1000. Para tanto,
 * crie um método que receba um número inteiro como parâmetro de entrada e verifique se este número é
 * primo ou não retornando um boolean como resposta.
 * 
 * 
 */


import java.util.Scanner;
public class Exercicio05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int cont;
		int num = 0;
	
		do {
            cont = 0;
            for (int k = 1; k <= num; k++) {
                if (num % k == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
               System.out.print(num + "|");
                
            }
            num++;
        } while (num <= 1000);
        
        System.out.print("\nDigite um numero inteiro: ");
		int x = leia.nextInt();
		System.out.println("\nO valor digitado e primo: " + ePrimo(x));
		
	}
	
	static boolean ePrimo(int num){
		int cont;
		do {
			cont = 0;
			for (int k = 1; k <= num; k++) {
				if (num % k == 0) {
					cont++;
				}
			}
			
			if (cont == 2) {
				return true; 
			}else{
				return false;
			}
		} while (cont <= num);
	}
}
