/*
 * MaeNatureza.java
 * 
 * 2) Se a mãe natureza pudesse criar um programa em Java para criar plantas de uma floresta e as plantas sendo conhecidas por seus nomes e espécie, 
 * podendo ser de 3 tipos: 
 * 
 * Árvore, que pode ou não ser frutífera;
 * Flor, que tem a cor dos suas flores; e
 * Carnívora, que pode ou não ser venenosa.
 * 
 * Como seria a criação de uma floresta?
 * Criar uma classe para criar uma floresta (main). Nesta classe deverá haver um menu
 * para cadastrar plantas, listar plantas, mostrar quantidade de plantas na floresta e
 * mostrar a quantidade de plantas de cada tipo (Árvore, Flor e Carnívora).
 * 
 * 
 */

import java.util.Scanner;

public class MaeNatureza {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();

        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        int opcao;
        int resposta;
        do {
            System.out.println("1 - Cadastrar planta");
            System.out.println("2 - Listar plantas");
            System.out.println("3 - Mostrar quantidade total de plantas");
            System.out.println("4 - Mostrar quantidade de cada tipo de planta");
            System.out.println("0 - Sair");
            System.out.print("\n>>> ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo da planta (1. Arvore, 2. Flor, 3. Carnivora): ");
                    int tipo = leia.nextInt();

                    System.out.print("Digite o nome da planta: ");
                    String nome = leiaStr.nextLine();
                    System.out.print("Digite a especie da planta: ");
                    String especie = leiaStr.nextLine();

                    Planta planta;
                    switch (tipo) {
                        case 1:
                            System.out.print("A arvore e frutifera? 1(Sim) 0(Nao): ");
                            resposta = leia.nextInt();
                            boolean frutifera;
                            if (resposta == 1) {
                                frutifera = true;
                            } else {
                                frutifera = false;
                            }

                            planta = new Arvore(nome, especie, frutifera);
                            break;
                        case 2:
                            System.out.print("Digite a cor da flor: ");
                            String cor = leiaStr.nextLine();
                            planta = new Flor(nome, especie, cor);
                            break;
                        case 3:
                            System.out.print("A planta carnivora e venenosa? 1(Sim) 0(Nao): ");
                            resposta = leia.nextInt();
                            boolean venenosa;
                            if (resposta == 1) {
                                venenosa = true;
                            } else {
                                venenosa = false;
                            }

                            planta = new Carnivora(nome, especie, venenosa);
                            break;
                        default:
                            System.out.println("Opcao invalida.\n");
                            continue;
                    }

                    floresta.criarPlanta(planta);
                    break;

                case 2:
                    System.out.println(floresta.toString());
                    break;

                case 3:
                    floresta.mostrarQuantidadePlantas();
                    break;

                case 4:
                    floresta.mostrarQuantidadeTiposPlantas();
                    break;

                case 0:
                    System.out.println("FIM!\n");
                    break;

                default:
                    System.out.println("Opcao invalida.\n");
            }
        } while (opcao != 0);
    }
}
