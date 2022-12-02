/*
 * Kayky Tanaka de Abreu 
 * 
 * Concatenacao.java
 * 
 * 8 - Crie um arquivo chamado Concatenacao.java. Complete o código, substituindo a seqüência
 * “xxxxx” com operações de concatenação e parênteses. O programa deve exibir as mensagens
 * "Java123", "Java6", "123Java" e "6Java" nessa ordem. Não é necessário completar todas as
 * seqüências. 
 * 
 * 
 */

public class Concatenacao {

	public static void main(String[] args) {
		System.out.println("Java" + 1 + 2 + 3);
		System.out.println("Java" + (1 + 2 + 3));
		System.out.println("1" + 2 + 3 + "Java");
		System.out.println((1 + 2 + 3) + "Java");
	}
}
