/*
 * Vendas.java
 * 
 * 1) Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo 100 itens. 
 * O pedido deverá ser capaz de receber vários tipos produtos (superclasse), como frios, pães, doces, etc (subclasses). 
 * Ao final da entrada dos produtos o pedido deverá ter um método que calcule o valor total do pedido,
 * onde ele varrerá o vetor de produtos somando seus valores. 
 * Desafio: implementar a quantidade de produtos vezes seu valor, no cálculo do valor do pedido. 
 * 
 * 
 */

import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pedido pedido = new Pedido();
        int quantidade;
        double preco;
        int x;
        do {
            System.out.println("Selecione o tipo de item: \n");

            System.out.println("1 - Frios");
            System.out.println("2 - Paozinho");
            System.out.println("3 - Doces");
            System.out.println("0 - Encerrar pedido");

            System.out.print("\n>>> ");
            x = leia.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Digite a quantidade: ");
                    quantidade = leia.nextInt();

                    System.out.print("Digite o preco: ");
                    preco = leia.nextDouble();
                    pedido.adicionarProduto(new Frios(preco, quantidade));
                    break;
                case 2:
                    System.out.print("Digite a quantidade: ");
                    quantidade = leia.nextInt();

                    System.out.print("Digite o preco: ");
                    preco = leia.nextDouble();
                    pedido.adicionarProduto(new Paozinho(preco, quantidade));
                    break;
                case 3:
                    System.out.print("Digite a quantidade: ");
                    quantidade = leia.nextInt();

                    System.out.print("Digite o preco: ");
                    preco = leia.nextDouble();
                    pedido.adicionarProduto(new Doces(preco, quantidade));
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (x != 0);

        System.out.println("Pedido: ");
        System.out.println(pedido.toString());

        double valorTotal = pedido.calcularValorTotal();
        System.out.println("Valor total: R$ " + valorTotal);
    }
}
