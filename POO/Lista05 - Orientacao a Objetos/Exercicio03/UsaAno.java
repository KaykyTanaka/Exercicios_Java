/* 
 * UsaAno.java
 * 
 * Elabore um programa em java que contenha um método booleano que teste se um ano é ou não
 * bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que
 * sejam também divisíveis por 400.
 * 
 * 
 */
import java.util.Scanner;

public class UsaAno {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Ano ano = new Ano();
        System.out.print("Digite o ano: ");
        ano.setAno(leia.nextInt());

        System.out.println(ano);

    }
}
