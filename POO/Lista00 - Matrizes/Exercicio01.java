/*
 * Exercicio01.java
 * 
 * 1) Escreva um programa em Java para
 * ler uma matriz A de 4 linhas por 5 colunas e
 * imprimir seus elementos.
 * 
 * 
 */

public class Exercicio01 {

	public static void main(String[] args) {

		int matriz[][] = new int[4][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]\t");
			}
			System.out.println();
		}
	}
}
