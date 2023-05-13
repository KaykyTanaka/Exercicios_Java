/* 
 * Ano.java
 * 
 * Elabore um programa em java que contenha um método booleano que teste se um ano é ou não
 * bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que
 * sejam também divisíveis por 400.
 * 
 * 
 */

public class Ano {
    private int ano;

    public Ano() {
        ano = 1;
    }

    public void setAno(int ano) {
        if (ano > 0 && ano <= 9999) {
            this.ano = ano;
        }
    }

    public int getAno() {
        return ano;
    }

    public boolean ehBissexto() {
        if (ano % 4 == 0 && ano % 100 != 0) {
            return true;
        } else {
            if (ano % 400 == 0) {
                return true;
            } else {
                return false;
            }

        }
    }

    @Override
    public String toString() {
        return "O ano " + ano + " e Bissexto? " + ehBissexto();
    }
}
