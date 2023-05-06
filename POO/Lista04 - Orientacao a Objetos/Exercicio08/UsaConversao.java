/* 
* UsaConversao.java
* 
* 8) Escrever a classe ConversaoDeUnidadesDeArea com métodos para conversão das unidades de área
*  segundo a lista abaixo:
* • 1 metro quadrado = 10.76 pés quadrados
* • 1 pé quadrado = 929 centímetros quadrados
* • 1 milha quadrada = 640 acres
* • 1 acre = 43.560 pés quadrados
* metro 
pe 
centimetro
milha 
acres
*/

import java.util.Scanner;

public class UsaConversao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ConversaoDeUnidadesDeArea conv = new ConversaoDeUnidadesDeArea();

        System.out.println("1 - Metro quadrado para pe quadrado");
        System.out.println("2 - Pe quadrado para centimetros quadrados");
        System.out.println("3 - Milha quadrada para acres");
        System.out.println("4 - Acre para pe quadrado");
        System.out.print("Escolha a opcao de conversao: ");
        int opcao = leia.nextInt();
        double n, resultado;

        switch (opcao) {
            case 1:
                System.out.print("Digite a area em metros quadrados: ");
                n = leia.nextDouble();
                conv.setArea(n);
                resultado = conv.getMp();
                System.out.println("Resultado: " + resultado + " pes quadrados");
                break;

            case 2:
                System.out.print("Digite a area em pes quadrados: ");
                n = leia.nextDouble();
                conv.setArea(n);
                resultado = conv.getPc();
                System.out.println("Resultado: " + resultado + " centimetros quadrados");
                break;

            case 3:
                System.out.print("Digite a area em milhas quadradas: ");
                n = leia.nextDouble();
                conv.setArea(n);
                resultado = conv.getMa();
                System.out.println("Resultado: " + resultado + " acres");
                break;

            case 4:
                System.out.print("Digite a area em acres: ");
                n = leia.nextDouble();
                conv.setArea(n);
                resultado = conv.getAp();
                System.out.println("Resultado: " + resultado + " pes quadrados");
                break;

            default:
                System.out.println("Opcao invalida!");
        }

    }
}