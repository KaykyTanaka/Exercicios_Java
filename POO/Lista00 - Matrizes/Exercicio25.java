
/*
* Exercicio25.java
* 
* 25)Escreva um programa em Java para gerar uma matriz Y (N x M). 
* Ordene os elmentos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
* 
* 
*/

public class Exercicio25 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int m = (int) (Math.random() * 10) + 1;
        int y[][] = new int[n][m];

        for (int linha = 0; linha < y.length; linha++) {
            for (int coluna = 0; coluna < y[0].length; coluna++) {
                y[linha][coluna] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Matriz Y: ");
        for (int linha = 0; linha < y.length; linha++) {
            for (int coluna = 0; coluna < y[0].length; coluna++) {
                System.out.print("[" + y[linha][coluna] + "]\t");
            }
            System.out.println();
        }

        int linhas = y.length;
        int colunas = y[0].length;
        int temp;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < linhas; k++) {
                    for (int l = 0; l < colunas; l++) {
                        if (y[i][j] < y[k][l]) {

                            temp = y[i][j];
                            y[i][j] = y[k][l];
                            y[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Matriz Ordenada Crescente: ");
        for (int linha = 0; linha < y.length; linha++) {
            for (int coluna = 0; coluna < y[0].length; coluna++) {
                System.out.print("[" + y[linha][coluna] + "]\t");
            }
            System.out.println();
        }

    }
}