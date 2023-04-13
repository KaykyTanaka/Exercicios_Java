
/*
 * Exercicio16.class
 * 
 * 16) Escreva um programa para solicitar ao usuário a quantidade de elementos da sequência de Fibonacci (N<=20) e gerar um 
 * vetor V com os elementos da sequência e imprimir o vetor.
 * 
 * 
 */
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int v[];
        int a = 0, b = 1, c = 0;

        System.out.print("Insira a quantidade de elementos: ");
        n = leia.nextInt();

        if (n > 0 && n <= 20) {
            v = new int[n];

            for (int i = 0; i < v.length; i++) {
                v[i] = a;
                c = a + b;
                a = b;
                b = c;
            }
            for (int j = 0; j < v.length; j++) {
                System.out.print(v[j] + " | ");
            }

        } else {
            System.out.println("Insira um valor entre 1 e 20!");
        }

    }
}
