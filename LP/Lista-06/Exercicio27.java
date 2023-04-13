/*
 * Exercicio27.java
 * 
 * 27) Escreva um programa em Java que imprima sequência 3:
 * 1, 1 2 3 4 5 6 7 8 9 10
 * 2, 1 2 3 4 5 6 7 8 9
 * 3, 1 2 3 4 5 6 7 8
 * 4, 1 2 3 4 5 6 7
 * 5, 1 2 3 4 5 6
 * 6, 1 2 3 4 5
 * 7, 1 2 3 4
 * 8, 1 2 3
 * 9, 1 2
 * 10, 1
 * 
 * 
 */


public class Exercicio27 {
	
	public static void main (String[] args) {
		int x = 10;
		int y = 1;
		do{
			System.out.print("\n"+ y+ ", ");
			
			for (int i = 1; i <= x; i++){
				System.out.print(" " + i);
			}
			y++;
			x--;
		}while(x>=1);
		
	}
}
