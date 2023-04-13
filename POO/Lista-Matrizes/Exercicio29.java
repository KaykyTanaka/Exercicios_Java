
/*
 * Exercicio29.java
 * 
 * 29)Escreva um programa em Java para solicitar ao usuário um valor.
 * Este valor lido será a quantidade de elementos de um vetor.Gerar os elementos
 * do vetor.A partir do vetor gerado,criar uma matriz,onde a quantidade de
 * linhas será igual à quantidade de elementos do vetor e as colunas serão os
 * valores dos elementos do vetor mais um.Com a matriz criada,armazenar na
 * primeira coluna de cada linha o respectivo ele-mento do vetor criado
 * inicialmente e os demais elementos da linha serão formados pela sequencia de
 * Primos.Imprimir a matriz resultante.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos para o vetor: ");
        int n = leia.nextInt();

        int num = 2;
        int cont, qtd = 0;
        int soma = 0;

        int vetor[] = new int[n];

        System.out.println("\nVetor gerado: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 5) + 1;
            soma += vetor[i];
            System.out.print("[" + vetor[i] + "]");
        }

        int primos[] = new int[soma];

        do {
            cont = 0;
            for (int k = 1; k <= num; k++) {
                if (num % k == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                primos[qtd] = num;
                qtd++;
            }
            num++;
        } while (qtd < (primos.length));

        int matriz[][] = new int[vetor.length][];

        for (int i = 0; i < vetor.length; i++) {
            matriz[i] = new int[vetor[i] + 1];
            matriz[i][0] = vetor[i];

            for (int j = 1; j < matriz[i].length; j++) {
                matriz[i][j] = primos[j - 1];
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