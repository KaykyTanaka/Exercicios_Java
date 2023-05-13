/* 
 * UsaCalculadora.java
 * 
 * 2) Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética
 * conforme o diagrama abaixo e após uma classe que teste essa implementação.
 * 
 * 
 */

import java.util.Scanner;

public class UsaCalculadora {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Calculadora calcula = new Calculadora();

        int opc = 1;

        do {
            System.out.println("\nCalculadora: ");
            System.out.println("1) Entrar com numeros");
            System.out.println("2) Mostrar numeros ");
            System.out.println("3) Soma");
            System.out.println("4) Subtracao");
            System.out.println("5) Produto");
            System.out.println("6) Divisao");
            System.out.println("0) Sair");
            System.out.println("---//---");
            System.out.print("Digite a opcao: ");
            opc = leia.nextInt();

            switch (opc) {

                case 1:
                    System.out.print("Digite o valor de n1: ");
                    calcula.setNumero1(leia.nextInt());
                    System.out.print("Digite o valor de n2: ");
                    calcula.setNumero2(leia.nextInt());
                    break;

                case 2:
                    System.out.println("Numero1: " + calcula.getNumero1() + "\nNumero2: " + calcula.getNumero2());
                    break;

                case 3:
                    System.out.println("\n** SOMA: " + calcula.somar() + " **");
                    break;

                case 4:
                    System.out.println("\n**SUBTRACAO " + calcula.subtrair() + " **");
                    break;

                case 5:
                    System.out.println("\n**PRODUTO: " + calcula.multiplicar() + " **");
                    break;

                case 6:
                    System.out.println("\n**DIVISAO: " + calcula.dividir() + " **");
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("\n\tOpcao Invalida!\n");
            }
        } while (opc != 0);
    }
}