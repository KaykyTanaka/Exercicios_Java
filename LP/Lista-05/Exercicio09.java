/*
 * Exercicio09.java
 * 
 * 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
 * mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
 * de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
 * salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
 * extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioHora, salarioTotal;

		System.out.print("Horas trabalhadas no mes: ");
		horasTrabalhadas = leia.nextInt();
		
		System.out.print("Salario por hora: ");
		salarioHora = leia.nextDouble();

		if ((horasTrabalhadas / 4) > 40) {

			salarioTotal = (salarioHora + (salarioHora * 0.5)) * horasTrabalhadas;
			System.out.print("Salario total: R$" + salarioTotal);

		} else {
			salarioTotal = salarioHora * horasTrabalhadas;
			System.out.print("Salario total: R$" + salarioTotal);
		}
	}
}
