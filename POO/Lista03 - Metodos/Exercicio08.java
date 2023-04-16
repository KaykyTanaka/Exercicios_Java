/*
 * Exercicio08.java
 * 
 * 8) [POO-021] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
 * representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
 * array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
 * calcule e retorne o MDC (Máximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar
 * apenas números positivos (pode ser um método).
 * 
 * 
 */


import java.util.Scanner;

public class Exercicio08 {

       public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        int quantidade = leia.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
        }

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o numero inteiro #" + (i + 1) + ": ");
            int num = leia.nextInt();

            if (num <= 0) {
                System.out.println("Numero invalido!");
            }else{
				numeros[i] = num;
			}
        }

        int mdc = calcularMDC(numeros);
        System.out.println("MDC: " + mdc);
    }


	public static int calcularMDC(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calcularMDC(int[] numeros) {
        int mdc = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            mdc = calcularMDC(mdc, numeros[i]);
        }

        return mdc;
    }

    
}
