/*
 * Exercicio25.class
 * 
 * 25) Escreva um programa validador de senhas. A regra para a criação de uma senha forte é que a senha deve ser de tamanho 
 * mínimo 10. A senha deve conter letras maiúsculas, letras minúsculas, números e caracteres especiais/símbolos(!@#$%&*()+) 
 * Outra regra, deve ter pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2 símbolos. O 
 * programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha que respeite esses critérios. Após cada 
 * senha digitada, apresentar as regras e se a senha passou pelos quesitos ou não. 
 * Ex: 
 * Senha: senha123 
 * Regras 
 * Tamanho 10: 8 (x) 
 * Letras 3: 5 (ok) 
 * Números 3: 3 (ok) 
 * Símbolos 2: 0 (x) 
 * Senha reprovada! Tente novamente. 
 * 
 * Senha: Bgp2Ip4*@1 
 * Regras 
 * Tamanho 10: 10 (ok) 
 * Letras 3: 5 (ok) 
 * Números 3: 3 (ok) 
 * Símbolos 2: 2 (ok) 
 * Senha aprovada! Parabéns!
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String senha;
		String simb = "!@#$%&*()+";
		int letra = 0;
		int numero = 0;
		int simbolo = 0;

		System.out.print("Digite a senha: ");
		senha = leia.nextLine().toLowerCase();

		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
				letra++;
			}
			if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
				numero++;
			}
			for (int s = 0; s < simb.length(); s++) {
				if (senha.charAt(i) == simb.charAt(s)) {
					simbolo++;
				}
			}
		}

		if (senha.length() >= 10 && letra >= 3 && numero >= 3 && simbolo >= 2) {
			System.out.println("Senha: " + senha + "\nRegras: " + "\nTamanho(10)-> " + senha.length() +
					"\nLetras(3)-> " + letra +
					"\nNumeros(3)-> " + numero +
					"\nSimbolos(2)-> " + simbolo +
					"\nSenha aprovada! Parabens!");
		} else {
			System.out.println("Senha: " + senha + "\nRegras: " + "\nTamanho(10)-> " + senha.length() +
					"\nLetras(3)-> " + letra +
					"\nNumeros(3)-> " + numero +
					"\nSimbolos(2)-> " + simbolo +
					"\nSenha reprovada! Tente novamente.");
		}
	}
}
