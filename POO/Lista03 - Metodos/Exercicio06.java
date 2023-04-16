/*
 * Exercicio06.java
 * 
 * 6) [POO-019] Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados
 * como parâmetros de entrada para um método que irá gerar todos os números primos existentes no
 * intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com
 * a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e
 * entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = leia.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = leia.nextInt();

        int[] primos = encontrarPrimos(n1, n2);

        for (int i = 0; i < primos.length; i++) {
            System.out.print("[" + primos[i] + "]");
        }
    }

    static int[] encontrarPrimos(int n1, int n2) {
        int qtdPrimos = 0;

        if (n1 > n2) {
            int aux = n2;
            n2 = n1;
            n1 = aux;
        }

        int x = 0;
        int y = n1;
        do {
            int cont = 0;
            for (int k = 1; k <= n1; k++) {
                if (n1 % k == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                qtdPrimos++;
            }
            n1++;
        } while (n1 <= n2);

        int[] primos = new int[qtdPrimos];
        x = 0;
        do {
            int cont = 0;
            for (int k = 1; k <= y; k++) {
                if (y % k == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                primos[x++] = y;
            }
            y++;
        } while (y <= n2);
        return primos;
    }

}
