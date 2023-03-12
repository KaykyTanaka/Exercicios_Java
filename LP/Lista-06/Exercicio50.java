/*
 * Exercicio50.java
 * 
 * 50) Solicite ao usuário o termo inicial e a quantidade de termos da sequência de números primos e impri ma o resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtd, cont, x = 0, cont1 = 0;

        System.out.print("Insira o o termo inicial: ");
        x = leia.nextInt();

        System.out.print("Insira a quantidade de termos da sequencia de numeros primos: ");
        qtd = leia.nextInt();

        do {
            cont = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.print(x + " | ");
                cont1++;
            }
            x++;
        } while (cont1 < qtd);
    }
}
