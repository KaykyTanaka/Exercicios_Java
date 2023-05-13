/* 
 * UsaNumero.java
 * 
 * Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o
 * número com os dígitos invertidos. O valor deve ser solicitado ao usuário
 * 
 * 
 */
import java.util.Scanner;

public class UsaNumero {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Numero n = new Numero();
        System.out.print("Digite um numero: ");
        n.setNumero(leia.nextInt());

        System.out.println(n);
    }
}
