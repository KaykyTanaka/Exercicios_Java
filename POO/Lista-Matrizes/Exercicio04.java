/*
4) Escreva um programa em Java para
ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações


 */
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int N, M;

        do {
            System.out.print("Digite a quantidade de linhas: ");
            N = leia.nextInt();

            System.out.print("Digite a quantidade de colunas: ");
            M = leia.nextInt();

        } while (N <= 0 || M <= 0);

        System.out.print("Digite um valor maximo para elementos aleatorios: ");
        int max = leia.nextInt();

        int D[][] = new int[N][M];

        for (int linha = 0; linha < D.length; linha++) {
            for (int coluna = 0; coluna < D[linha].length; coluna++) {
                D[linha][coluna] = (int) (Math.random() * max + 1);
            }
        }

        for (int linha = 0; linha < D.length; linha++) {
            for (int coluna = 0; coluna < D[linha].length; coluna++) {
                System.out.print("[" + D[linha][coluna] + "]\t");
            }
            System.out.println("");
        }

    }
}
