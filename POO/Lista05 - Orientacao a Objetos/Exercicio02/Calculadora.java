/* 
 * Calculadora.java
 * 
 * 2) Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética
 * conforme o diagrama abaixo e após uma classe que teste essa implementação.
 * 
 * 
 */
public class Calculadora {

    private int numero1;
    private int numero2;


    public Calculadora() {
        numero1 = 0;
        numero2 = 0;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int somar() {

        return numero1 + numero2;
    }

    public int subtrair() {

        return numero1 - numero2;
    }

    public int multiplicar() {

        return numero1 * numero2;
    }

    public double dividir() {

        return (double) numero1 / numero2;
    }

    @Override
    public String toString() {

        return "N1: " + numero1 + "\n" +
                "N2: " + numero2 + "\n" +
                "Soma: " + somar() + "\n" +
                "Subtracao: " + subtrair() + "\n" +
                "Produto: " + multiplicar() + "\n" +
                "Divisao: " + dividir();
    }

}