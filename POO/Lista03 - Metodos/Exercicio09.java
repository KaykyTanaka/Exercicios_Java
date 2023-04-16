/*
 * Exercicio09.java
 * 
 * 
 * 10) [POO-023] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
 * representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
 * array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
 * calcule e retorne o MMC (Mínimo Múltiplo Comum) desse conjunto de dados. Valide as entradas para
 * aceitar apenas números positivos (pode ser um método). Utilize decomposição simultânea ou fatoração
 * simultânea.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = leia.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = leia.nextInt();

        int mmc = calcularMMC(num1, num2);

        System.out.println("MMC: " + mmc);
    }

    static int calcularMMC(int num1, int num2) {
        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        int mmc = maior;

        while (mmc % menor != 0) {
            mmc += maior;
        }

        return mmc;
    }
}
