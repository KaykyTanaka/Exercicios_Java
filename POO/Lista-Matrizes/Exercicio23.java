/*
* Exercicio23.java
* 
* 23)Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
* Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
* 
* 
*/

public class Exercicio23 {
    public static void main(String[] args) {

        int num = 2;
        int cont, qtd = 0;

        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;

        int matriz[][] = new int[a][b];
        int primos[] = new int[a * b];

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
        } while (qtd < (a * b));

        int x = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = primos[x++];

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
