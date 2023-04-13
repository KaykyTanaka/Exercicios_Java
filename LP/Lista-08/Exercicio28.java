/* 
 * Exercicio28.class 
 *  
 * 28) Melhore o exercício anterior, implementando a possibilidade de ocorrer mais de uma vez o vetor AI dentro do vetor AH . 
 * Mostre todas as ocorrências com as devidas posições iniciais.
 * 
 * 
 */

public class Exercicio28 {
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
