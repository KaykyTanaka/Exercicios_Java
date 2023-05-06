/* 
 * UsaEquacao.java
 * 
 * 5) Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e
 * c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz
 * ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo
 * grau.
 * 
 */

import java.util.Scanner;

public class UsaEquacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Equacao eq = new Equacao();

        System.out.print("Digite o valor de A: ");
        double a = leia.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = leia.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = leia.nextDouble();

        eq.calcularDelta(a, b, c);
        eq.mostrarRaizes();
    }
}
