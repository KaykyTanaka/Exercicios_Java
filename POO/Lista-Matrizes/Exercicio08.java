/*
 * Exercicio08.java
 * 
 * 8) Escreva um programa em Java para
 * gerar uma matriz F (N x M). Criar os
 * vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. 
 * Imprimir a matriz e os vetores. Validar para caso não haja uma das
 * duas possibilidades (sem elementos pares ou ímpares).
 * 
 * 
 */

import java.util.Arrays;

public class Exercicio08 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        int m = (int) (Math.random() * 10 + 1);

        int f[][] = new int[n][m];

        int qtdeImpar = 0;
        int qtdePar = 0;

        for (int linha = 0; linha < f.length; linha++) {
            for (int coluna = 0; coluna < f[0].length; coluna++) {
                f[linha][coluna] = (int) (Math.random() * 100);
            }
        }

        for (int linha = 0; linha < f.length; linha++) {
            for (int coluna = 0; coluna < f[0].length; coluna++) {
                if (f[linha][coluna] % 2 == 0) {
                    qtdePar++;
                } else {
                    qtdeImpar++;
                }
            }
        }

        int par[] = new int[qtdePar];
        int impar[] = new int[qtdeImpar];
        int cont = 0;
        int cont2 = 0;

        for (int linha = 0; linha < f.length; linha++) {
            for (int coluna = 0; coluna < f[0].length; coluna++) {
                if (f[linha][coluna] % 2 == 0) {

                    par[cont] = f[linha][coluna];
                    cont++;

                } else {
                    impar[cont2] = f[linha][coluna];
                    cont2++;
                }
            }
        }

        System.out.println("Matriz F:");
        for (int linha = 0; linha < f.length; linha++) {
            for (int coluna = 0; coluna < f[0].length; coluna++) {
                System.out.print("[" + f[linha][coluna] + "]\t");
            }
            System.out.println();
        }

        if (qtdePar == 0) {
            System.out.println("Não há elementos pares na matriz F.");
        } else {
            Arrays.sort(par);
            System.out.println("Vetor PAR: " + Arrays.toString(par));
        }

        if (qtdeImpar == 0) {
            System.out.println("Não há elementos ímpares na matriz F.");
        } else {
            Arrays.sort(impar);
            System.out.println("Vetor IMPAR: " + Arrays.toString(impar));
        }
    }
}
