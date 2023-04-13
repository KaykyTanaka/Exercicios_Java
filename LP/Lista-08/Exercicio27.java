/* 
 * Exercicio27.class 
 *  
 * 27) Escreva um programa para ler um vetor AH de dimensão definida e com elementos fornecidos pelo usuário (>=25). Criar 
 * outro vetor AI (2 <= N <= 5) posições e gerar os elementos. Verificar se o vetor AI está contido no vetor AH. Caso não 
 * esteja contido dar mensagem de erro. Caso esteja, informar a posição inicial no vetor AH. 
 * 
 * 
 */

public class Exercicio27 {
	public static void main(String[] args) {
		
		int ah[] = new int [10];
		int ai [] = new int [(int)(Math.random()*5-1)+2];
		boolean test=true;
		
		System.out.print("Vetor AH: ");
		for (int i = 0; i < ah.length; i++){
			ah[i] = (int) (Math.random()*25)+1;
			System.out.print(" [" + ah[i]+ "] ");
		}
		
		System.out.print("\nVetor AI: ");
		for (int i = 0; i < ai.length; i++){
			ai[i] = (int) (Math.random()*10)+1;
			System.out.print(" [" + ai[i]+ "] ");
		}
		
		
		for (int i = 0; i < ah.length; i++){
			for (int j = 0; j < ai.length; j++){
				if (ah[i] != ai[i]){
					test = false;
				}
			}
		}
		if(test = false){
			System.out.print("\nNao esta contido!");
		}
		
		
		
		
		
		
	}
}
