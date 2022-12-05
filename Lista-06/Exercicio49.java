/*
 * Exercicio49.java
 * 
 * 49) Solicite ao usuário a quantidade de termos da sequência de números primos e imprima a sequência do final para o início.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtd, cont, x = 0, cont1 = 0;

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
        } while (cont1 != qtd);
    }
}
