/* 
 * Data.java
 * 
 * 4) Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano
 * que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data
 * 
 */

public class Data {
    private int dia;
    private int mes;
    private int ano;


    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean validarData() {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes()) {
            return false;
        }
        return true;
    }

    public int diasNoMes() {
        int dias;

        if (mes == 2) {
            dias = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else {
            dias = 31;
        }

        return dias;
    }

    public void mostrarData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
