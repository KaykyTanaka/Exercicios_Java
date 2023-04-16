/*
 * Exercicio07.java
 * 
 * 7) [POO-020] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
 * receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor
 * Comum) destes números fornecidos.
 * 
 * 
 */


import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = leia.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = leia.nextInt();
	
		 System.out.println("O MDC de " + n1 + " e " + n2 + " é: " + mdc(n1,n2));
	}
	
	static int mdc(int n1, int n2){
		 while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
	
}
