/* 
 * DivideConta.java
 * 
 * 2) Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
 * dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
 * para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
 * quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
 * dados inseridos não permitindo absurdos.
 * 
 */
public class DivideConta {

    public double calcularConta(double valorConta, int numPessoas, char pagarGarcom) {
        double valorTotal = 0;

        if (numPessoas <= 0 || valorConta <= 0) {
            System.out.println("Quantidade de pessoas ou valor da conta inválidos.");
            return 0;
        }

        if (pagarGarcom == 'S') {
            valorTotal = (valorConta + (valorConta * 0.1));
        } else if (pagarGarcom == 'N') {
            valorTotal = valorConta;
        } else {
            System.out.println("Opção inválida para pagar os 10% do garçom.");
            return 0;
        }

        return valorTotal / numPessoas;
    }
}