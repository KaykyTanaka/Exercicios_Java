/*
 * Exercicio11.java
 * 
 * 11) [POO-024] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
 * receba esse número inteiro como parâmetro de entrada, verifique e retorne um valor boolean, que
 * indicará, caso true que ele é um número perfeito, caso false, que não é.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = leia.nextInt();

        if (num <= 0) {
            System.out.println("Valor invalido!");
        } else {

            boolean resultado = nPerfeito(num);

            if (resultado) {
                System.out.println(num + " e perfeito.");
            } else {
                System.out.println(num + " nao e perfeito.");
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