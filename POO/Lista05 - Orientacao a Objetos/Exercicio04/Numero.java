/* 
 * Numero.java
 * 
 * Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o
 * número com os dígitos invertidos. O valor deve ser solicitado ao usuário
 * 
 * 
 */
public class Numero {
    private int numero;

    public Numero() {
        numero = 0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int Inverter() {
        int numeroInvertido = 0;
        while (numero > 0) {
            int resto = numero % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numero = numero / 10;
        }
        return numeroInvertido;
    }

    @Override
    public String toString() {
        return "Numero: " + numero +
                "\nNumero invertido: " + Inverter();
    }
}
