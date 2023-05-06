/* 
 * UsaData.java
 * 
 * 6) Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas datas e métodos
 * para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, de uma para a outra. Supor
 * anos de 365 dias.
 * 
 */

import java.util.Scanner;

public class UsaData {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        int dia = leia.nextInt();
        System.out.print("Digite um mes: ");
        int mes = leia.nextInt();
        System.out.print("Digite um ano: ");
        int ano = leia.nextInt();
        System.out.println("\n");
        System.out.print("Digite outro dia: ");
        int dia2 = leia.nextInt();
        System.out.print("Digite outro mes: ");
        int mes2 = leia.nextInt();
        System.out.print("Digite outro ano: ");
        int ano2 = leia.nextInt();

        Data d1 = new Data(dia, mes, ano);
        System.out.println("Primeira data: " + d1);

        Data d2 = new Data(dia2, mes2, ano2);
        System.out.println("Segunda Data: " + d2);

        System.out.println("Sao iguais? " + d2.equals(d1));

        System.out.println("Maior: " + d2.max(d1));

        System.out.println("Menor: " + d2.min(d1));

        System.out.println("Diferenca: " + d2.diff(d1) + " dias");

    }

}
