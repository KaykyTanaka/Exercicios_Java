
/*
 * Exercicio17.class
 * 
 * 17) Escreva um programa para solicitar ao usuário a quantidade de elementos da sequência de Primos (N<=20) e gerar um 
 * vetor X com os elementos da sequência e imprimir o vetor
 * 
 * 
 */
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int x[];
        int cont = 0;
        int primo = 0;

        System.out.print("Digite a quantidade de numeros: ");
        n = leia.nextInt();

        if (n > 0 && n <= 20) {
            x = new int[n];

            for (int i = 2; primo < n; i++) {
                cont = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        cont++;
                    }
                }
                if (cont == 2) {
                    x[primo] = i;
                    primo++;
                }

            }
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[j] + " | ");
            }
        } else {
            System.out.println("Insira um valor entre 1 e 20!");
        }
    }
}
