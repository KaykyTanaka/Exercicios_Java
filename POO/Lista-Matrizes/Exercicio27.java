
/*
* Exercicio27.java
* 
* 27) Escreva um programa em Java para gerar uma matriz X (N x M). 
* Ordenar as linhas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
* 
* 
*/

public class Exercicio27 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int m = (int) (Math.random() * 10) + 1;
        int x[][] = new int[n][m];
        int linhas = x.length;
        int colunas = x[0].length;
        int temp;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                x[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Matriz X: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("[" + x[i][j] + "]\t");
            }
            System.out.println();
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < linhas; k++) {
                    for (int l = 0; l < colunas; l++) {
                        if (x[i][j] < x[k][l]) {

                            temp = x[i][j];
                            x[i][j] = x[k][l];
                            x[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Matriz Ordenada Crescente: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("[" + x[i][j] + "]\t");
            }
            System.out.println();
        }

    }
}