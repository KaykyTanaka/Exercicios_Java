/* 
 * Exercicio29.class 
 *  
 * 29) Escreva um programa para criar um vetor AJ de dimensão definida pelo usuário (>=10) e gerar os elementos aleatórios e 
 * não repetidos. Ordenar crescente. O usuário deverá, em 10 tentativas, descobrir um elemento do vetor. Caso acerte, o 
 * programa deverá imprimir o vetor AJ e a posição onde o elemento do usuário estava. Uma dica importante para aumentar a 
 * "emoção" e a dificuldade é colocar um aleatório grande.
 * 
 * 
 */
import java.util.Scanner;
public class Exercicio29 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] aj = new int[10];
		int vidas = 5, vida = 5;
		boolean acertou = false;
		
		System.out.print("Vetor AJ: ");
		for (int i = 0; i < aj.length; i++){
			aj[i] = (int) (Math.random()*10)+1;
			System.out.print(" [" + aj[i]+ "] ");
		}
		
		
		

		do{
			System.out.print("Tente acertar um número do vetor: ");
			int palpite = leia.nextInt();
			
			for (int i = 0; i < aj.length; i++) {
				if (palpite == aj[i]) {
					System.out.println("Você acertou!");
					System.out.print("Vetor: ");
					for (int x = 0; x < aj.length; x++){
						System.out.print(" [" + aj[x]+ "] ");
					}
					acertou = true;
					break;
				}
			}
			vidas--;
		}while (!acertou && vidas >= 0);
	}

}
