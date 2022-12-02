/*
 * OperadoresDeAtribuicao.java
 * 
 * 9 - Crie um arquivo chamado OperadoresDeAtribuicao.java. Complete o código, substituindo a
 * seqüência “xxxxx” com operações de atribuição. O programa deve exibir os valores 1, 3, 2, 6, 3, 1,
 * 2 e 1 nessa ordem. Não utilize o mesmo operador duas ou mais vezes. 
 * 
 * 
 */

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {

		int a = 1;
		System.out.println(a); // 1
		a += 2;
		System.out.println(a); // 3
		a -= 1;
		System.out.println(a); // 2
		a *= 3;
		System.out.println(a); // 6
		a /= 2;
		System.out.println(a); // 3
		a %= 2;
		System.out.println(a);// 1
		a++;
		System.out.println(a);// 2
		a--;
		System.out.println(a);// 1

	}
}
