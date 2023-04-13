
/*
 * Exercicio30.java
 * 
 * 30) Item ao exercício anterior, mas utilizando a sequencia de Fibonacci.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos para o vetor: ");
        int n = leia.nextInt();

        int f;
        int proximo = 1;
        int anterior = 0;
        int soma = 0;

        int vetor[] = new int[n];

        System.out.println("\nVetor gerado: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 5) + 1;
            soma += vetor[i];
            System.out.print("[" + vetor[i] + "]");
        }

        int fibo[] = new int[soma];

        for (int i = 1; i < fibo.length; i++) {
            f = anterior + proximo;
            anterior = proximo;
            proximo = f;
            fibo[i] = anterior;
        }

        int matriz[][] = new int[vetor.length][];

        for (int i = 0; i < vetor.length; i++) {
            matriz[i] = new int[vetor[i] + 1];
            matriz[i][0] = vetor[i];

            for (int j = 1; j < matriz[i].length; j++) {
                matriz[i][j] = fibo[j - 1];
            }
        }
        System.out.println("\n\nMatriz gerada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println();
        }

    }
}