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

    public Data() {
        setData(1, 1, 1);
    }

    public Data(int dia, int mes, int ano) {
        setData(1, 1, 1);
        setData(dia, mes, ano);
    }

    public void setData(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if (ano >= 1 && ano <= 9999) {
            this.ano = ano;
        }
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

    public boolean isData() {
        if (mes == 2) {
            return dia <= (ano % 4 == 0 ? 29 : 28);
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }

        return true;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}
