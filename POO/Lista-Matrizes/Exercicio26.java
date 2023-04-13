
/*
* Exercicio26.java
* 
* 26)Escreva um programa em Java para gerar uma matriz W (N x M). 
* Ordene os elementos da matriz de forma decrescente e imprimir a matriz original e a matriz ordenada.
* 
* 
*/

public class Exercicio26 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int m = (int) (Math.random() * 10) + 1;
        int w[][] = new int[n][m];

        int linhas = w.length;
        int colunas = w[0].length;
        int temp;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                w[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Matriz W: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("[" + w[i][j] + "]\t");
            }
            System.out.println();
        }

        /* Ordenar */
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < linhas; k++) {
                    for (int l = 0; l < colunas; l++) {
                        if (w[i][j] > w[k][l]) {

                            temp = w[i][j];
                            w[i][j] = w[k][l];
                            w[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Matriz Ordenada Decrescente: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("[" + w[i][j] + "]\t");
            }
            System.out.println();
        }

    }
}