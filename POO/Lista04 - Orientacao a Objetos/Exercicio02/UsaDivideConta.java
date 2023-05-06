
/* 
 * UsaDivideConta.java
 * 
 * 2) Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
 * dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
 * para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
 * quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
 * dados inseridos não permitindo absurdos.
 * 
 */
import java.util.Scanner;

public class UsaDivideConta {
    public static void main(String[] args) {
        DivideConta dc = new DivideConta();
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);
        
        System.out.print("Digite o valor da conta: R$ ");
        double valorConta = leia.nextDouble();

        System.out.print("Digite a quantidade de pessoas: ");
        int numPessoas = leia.nextInt();

        System.out.print("Deseja pagar os 10% do garcom? (S/N) ");
        char pagarGarcom = leiaStr.next().toUpperCase().charAt(0);

        double valorFinal = dc.calcularConta(valorConta, numPessoas, pagarGarcom);

        System.out.printf("O valor da conta e de: R$ %.2f", valorFinal);

    }
}
