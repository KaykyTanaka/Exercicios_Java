/*
 * Kayky Tanaka de Abreu
 * 
 * OperadoresLogicos.java
 * 
 * 11 - crie um arquivo chamado OperadoresLogicos.java. Complete o código, substituindo a
 * seqüência “xxxxx” com operações lógicas. O programa deve exibir os valores true, true, false, false
 * e true nessa ordem. Não utilize o mesmo operador duas ou mais vezes. 
 * 
 * 
 */

public class OperadoresLogicos {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		System.out.println(a > b || c < d); // true
		System.out.println(a > b | c < d); // true
		System.out.println(a > b & c < d);
		System.out.println(a > b && c < d);
		System.out.println(a > b || c < d); // true
	}
}
