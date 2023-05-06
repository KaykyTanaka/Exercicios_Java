/* 
 * UsaData.java
 * 
 * 4) Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano
 * que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data
 * 
 */

import java.util.Scanner;

public class UsaData {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Data data = new Data();

        System.out.print("Digite um dia: ");
        int dia = leia.nextInt();
        System.out.print("Digite um mes: ");
        int mes = leia.nextInt();
        System.out.print("Digite um ano: ");
        int ano = leia.nextInt();

        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);

        if (data.validarData()) {
            System.out.println("A data e valida!");
            data.mostrarData();
        } else {
            System.out.println("A data e invalida!");
        }

    }

}
