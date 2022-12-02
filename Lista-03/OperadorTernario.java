/*
 * Kayky Tanaka de Abreu 
 * 
 * OperadorTernario.java
 * 
 * 12 - crie um arquivo chamado OperadorTernario.java. Complete o código, substituindo a seqüência
 * “xxxxx” com o operador ternário. O programa deve exibir a mensagem a < b quando o valor da
 * variável a for menor do que o valor da variável b e a >= b caso contrário.
 * 
 * 
 */

public class OperadorTernario {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		System.out.println("A = " + a + "\nB = " + b);
		System.out.println(a >= b ? "a>=b" : a < b ? "a<b" : b);
	}
}
