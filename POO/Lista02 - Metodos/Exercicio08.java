/*
 * 
 * Exercicio08.java
 * 
 * 8 ) [POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o dado 1 milhão de vezes. 
 * Conte quantas vezes cada número saiu. 
 * A probabilidade deu certo? Ou seja, a porcentagem dos números foi parecida?
 * 
 * 
 */

public class Exercicio08 {

    public static void main(String[] args) {
        int[] resultados = new int[6];
        int numero;

        for (int i = 0; i < 1000000; i++) {
            numero = dado();
            resultados[numero - 1]++;
        }

        for (int i = 0; i < resultados.length; i++) {
            double porcentagem = ((double) resultados[i] / 1000000) * 100;
            System.out.println((i + 1) + ": " + resultados[i] + " - " + String.format("%.2f", porcentagem) + "%");
        }
    }

    public static int dado() {
        return (int) (Math.random() * 6) + 1;
    }
}