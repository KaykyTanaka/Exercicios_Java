/*
 * Exercicio12.java
 * 
 * 12) [POO-025] Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a
 * sequência dos números perfeito até o número informado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = leia.nextInt();

        if (num <= 0) {
            System.out.println("Valor invalido!");
        } else {

            for (int i = 1; i <= num; i++) {
                if (nPerfeito(i)) {
                    System.out.print(i + ", ");
                }

            }
        }
    }

    static boolean nPerfeito(int num) {
        int soma = 0;

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

}
