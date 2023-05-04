/*
 * Exercicio13.java
 * 
 * 13) [POO-026] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
 * epresentará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
 * array. Através de um método que receba esse array de números inteiros como parâmetro de entrada. Este
 * método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros inteiros: ");
        int quantidade = leia.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
        } else {
            int[] numeros = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Numero " + (i + 1) + ": ");
                numeros[i] = leia.nextInt();
            }

            int[] numerosPerfeitos = listarP(numeros);

            System.out.println("Numeros perfeitos:");
            for (int numero : numerosPerfeitos) {
                System.out.println(numero);
            }
        }
    }

    static boolean nPerfeito(int num) {
        int soma = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                soma += i;
                if (i != 1 && i != num / i) {
                    soma += num / i;
                }
            }
        }
        return soma == num;
    }

    static int[] listarP(int[] numeros) {
        int[] perfeitos = new int[numeros.length];
        int cont = 0;
        for (int numero : numeros) {
            if (nPerfeito(numero)) {
                perfeitos[cont++] = numero;
            }
        }
        int[] resultado = new int[cont];

        for (int i = 0; i < cont; i++) {
            resultado[i] = perfeitos[i];
        }

        return resultado;
    }
}
