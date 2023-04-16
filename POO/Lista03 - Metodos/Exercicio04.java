/*
 * Exercicio04.java
 * 
 * 4) [POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as
 * duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3
 * notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota
 * mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método
 * deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem
 * ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;
public class Exercicio04 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Entre com a nota1: ");
	int n1 = leia.nextInt();
	System.out.print("Entre com a nota2: ");
	int n2 = leia.nextInt();
	System.out.print("Entre com a nota3: ");
	int n3 = leia.nextInt();
	
	if (n1>10 || n1<0){
		n1 = 0;
	}
	if (n2>10 || n2<0){
		n2 = 0;
	}
	if (n3>10 || n3<0){
		n3 = 0;
	}
		
	System.out.println(resultado(n1,n2,n3));
		
	}
	
	static String resultado(int n1, int n2, int n3){
		int notas[] = new int[3];
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;
		Arrays.sort(notas);
		
		return "Média maiores: " +(notas[2]+notas[1])/2 + "\nMédia aritmética: " + (n1+n2+n3)/3 + "\nMaior nota: " + notas[2] + "\nMenor nota: " + notas[0];
	}
	
}
