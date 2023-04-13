/*
 * 
 * Exercicio01.java
 * 
 * 1) [POO - 001] Crie programa que solicite ao usuário um número tipo double. 
 * Após verifique se o número é positivo ou não. 
 * A verificação deve ser feita através de um métod o que receba um valor ( parâmetro de entrada ) e informe se ele é positivo ou negativo 
 * através de um retorno do tipo boolean. 
 * Assuma o número zero como positivo. Declare como: boolean isPositivo(double num)
 * 
 * 
 */

import java.util.Scanner;
public class Exercicio01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double numero = leia.nextDouble();
		
		System.out.print(isPositivo(numero)?"É posistivo":"É negativo");
	}
	
	
	static boolean isPositivo(double num){
		
		return num>=0;
	}
	
}

