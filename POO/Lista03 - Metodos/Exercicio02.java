/*
 * Exercicio02.java
 * 
 * 2) [POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O
 * usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a
 * entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de
 * conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como
 * parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize as
 * fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário
 * desejar.
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Exercicio02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char opc;
		boolean x;
		int temp;
		
		
		do{
			System.out.print("Digite uma opcao [C]Celsius, [F]Fahrenheit e [S]Sair: ");
			opc = leia.nextLine().toUpperCase().charAt(0);
			
			if (opc == 'C'){
				System.out.print("\nDigite a temperatura em Celsius: ");
				temp = leia.nextInt();
				System.out.println("A temperatura em Fahrenheit é: " + toF(temp));
				
				x = true;
			}else{
				if (opc == 'F'){
					x = true;
					System.out.print("\nDigite a temperatura em Fahrenheit: ");
					temp = leia.nextInt();
					System.out.println("A temperatura em Celsius é: " + toC(temp));					
				}else{
					if (opc == 'S'){
						x = true;
						System.out.println("Saindo...");
						
					}else{
						x = false;
						System.out.println("Opcao Invalida!");
						
					}
				}
			}
				
		} while (x == false);
		
		
	}
	
	static int toF(int temp){
	
		return (9 * temp / 5) + 32;
	}
	
	static int toC(int temp){
	
		return 5 * (temp - 32) / 9;
	}
	
	

}

