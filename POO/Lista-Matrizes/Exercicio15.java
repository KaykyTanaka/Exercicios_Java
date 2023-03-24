/*
 * Exercicio15.java
 * 
 * 15)Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N.
 * Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal
 * secundária (inclusa).
 * 
 * 
 */

 import java.util.Scanner;

 public class Exercicio15 {
     public static void main(String[] args) {
 
         Scanner leia = new Scanner(System.in);
         System.out.print("Digite a dimensão da matriz quadrada: ");
         int n = leia.nextInt();
 
         int[][] o = new int[n][n];
 
         for (int linha = 0; linha < o.length; linha++) {
             for (int coluna = 0; coluna < o[0].length; coluna++) {
                 o[linha][coluna] = (int) (Math.random() * 100 + 1);
             }
         }
 
         System.out.println("Matriz o:");
 
         for (int linha = 0; linha < o.length; linha++) {
             for (int coluna = 0; coluna < o[0].length; coluna++) {
                 System.out.print("[" + o[linha][coluna] + "]" + "\t");
             }
             System.out.println();
         }

         System.out.println("\nElementos abaixo da diagonal principal (inclusa):");
        for (int linha = 0; linha < o.length; linha++) {
            for (int coluna = 0; coluna < o[0].length; coluna++) {
                if (linha == coluna || linha > coluna) {
                    System.out.print("[" + o[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println(" ");
        }
 
         System.out.println("Elementos acima da diagonal secundária (inclusa): ");
         for (int linha = 0; linha < o.length; linha++) {
             for (int coluna = 0; coluna < o[0].length; coluna++) {
                 if (linha + coluna <= (n - 1)) {
                     System.out.print("[" + o[linha][coluna] + "]" + "\t");
                 } else {
                     System.out.print(" \t");
                 }
             }
             System.out.println();
         }
 
     }
 }
 