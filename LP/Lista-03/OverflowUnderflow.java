/* 
 * OverflowUnderflow.java
 * 
 * 7 - Crie um arquivo chamado OverflowUnderflow.java. Complete o código, substituindo a
 * seqüência “xxxxx” com valores literais. O programa deve exibir os números -2147483648 e
 * 2147483647 nessa ordem.
 * 
 * 
 */

public class OverflowUnderflow {

	public static void main(String[] args) {
		System.out.println((int) -2147483649L + 1);
		System.out.println((int) -2147483648L - 1);
	}
}
