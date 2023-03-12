/*
 * Exercicio22.class
 * 
 * 22) Escreva um programa para ler um vetor AC de N posições, onde N é menor ou igual a 20 e imprimir seus elementos. O 
 * usuário deve informar o número de posições e um número máximo para o tamanho dos elementos. O programa deve validar a 
 * entrada dos dados e imprimir o vetor ao final.
 * 
 * 
 */
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ac[];
		int n;
		int max;
		System.out.print("Insira a quantidade de elementos(1 a 20): ");
		n = leia.nextInt();
		
		if (n>0 && n<=20){
			ac = new int[n];
			System.out.print("Insira um numero maximo para o tamanho dos elementos: ");
			max = leia.nextInt();
			if (max>0){
				
				for (int i = 0; i < ac.length; i++){
					ac[i] = (int)(Math.random()*max)+1;
					System.out.print(" [" + ac[i] + "] ");
				}

			}else{
				System.out.println("Insira um valor maior que 0!");
			}
		}else{
			System.out.println("Insira uma quantidade de elementos valida!");
		}

	}
}
