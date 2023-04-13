/*
 * Exercicio10.java
 * 
 * 10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
 * vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
 * vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
 * salário total.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario, vendas, total;

		System.out.print("Insira seu salario: ");
		salario = leia.nextDouble();

		System.out.print("Insira o valor de suas vendas: ");
		vendas = leia.nextDouble();

		if (vendas > 1500) {
			vendas = (vendas * 0.03) + ((vendas - 1500) * 0.05);
			total = salario + vendas;
		} else {
			vendas = vendas * 0.03;
			total = salario + vendas;
		}

		System.out.println("Salario total = " + total);

	}
}
