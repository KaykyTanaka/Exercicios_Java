/*
* Exercicio28.java
* 
* 28)Escreva um programa em Java para gerar uma matriz Z (N x M). 
* Ordenar as colunas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
* 
* 
*/

public class Exercicio28 {
    public static void main(String[] args) {
        int z[][] = new int[(int) (Math.random() * 5) + 1][(int) (Math.random() * 5) + 1];

        System.out.println("Matriz Z: ");
        for (int i = 0; i < z.length; i++) {

            for (int j = 0; j < z[i].length; j++) {

                z[i][j] = (int) (Math.random() * 10) + 1;

                System.out.print("[" + z[i][j] + "]\t");
            }
            System.out.println();
        }

        int linhas = z.length;
        int colunas = z[0].length;
        int temp;

        for (int j = 0; j < colunas; j++) {

            for (int i = 0; i < linhas; i++) {

                for (int k = 0; k < linhas; k++) {

                    if (z[i][j] < z[k][j]) {

                        temp = z[i][j];
                        z[i][j] = z[k][j];
                        z[k][j] = temp;
                    }
                }
            }
        }

        System.out.println("Matriz Ordenada: ");
        for (int i = 0; i < z.length; i++) {

            for (int j = 0; j < z[i].length; j++) {

                System.out.print("[" + z[i][j] + "]\t");
            }
            System.out.println();
        }
    }
}