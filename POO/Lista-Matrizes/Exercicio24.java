/*
* Exercicio24.java
* 
* 24) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz. 
* Preencher a matriz com os elementos da sequencia de Fibonacci e imprimir o resultado.
* 
* 
*/

public class Exercicio24 {
    public static void main(String[] args) {

        int f;
        int proximo = 1;
        int anterior = 0;

        int a = (int) (Math.random() * 5) + 1;
        int b = (int) (Math.random() * 5) + 1;

        int matriz[][] = new int[a][b];
        int fibo[] = new int[a * b];

        for (int i = 1; i < a * b; i++) {
            f = anterior + proximo;
            anterior = proximo;
            proximo = f;
            fibo[i] = anterior;
        }

        int x = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = fibo[x++];

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println();
        }

    }
}
