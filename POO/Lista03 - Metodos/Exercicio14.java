/*
 * Exercicio14.java
 * 
 * 14) [POO-027] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
 * receba esse número inteiro como parâmetro de entrada, inverta dígito-a-dígito e retorne um valor inteiro
 * com o número invertido.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = leia.nextInt();

        int numInvertido = inverterNumero(num);
        System.out.println("Numero invertido: " + numInvertido);
    }

    static int inverterNumero(int num) {
        int numInvertido = 0;
        while (num != 0) {
            int digito = num % 10;
            numInvertido = numInvertido * 10 + digito;
            num /= 10;
        }
        return numInvertido;
    }
}
