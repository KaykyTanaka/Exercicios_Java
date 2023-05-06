/* 
 * Data.java
 * 
 * 6) Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas datas e métodos
 * para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, de uma para a outra. Supor
 * anos de 365 dias.
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

    public int getDias() {

        return dia + mes * 30 + ano * 365;
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

    public static boolean isData(Data data) {

        return data.isData();
    }

    @Override
    public boolean equals(Object objeto) {

        Data data = (Data) objeto;

        return this.getDias() - data.getDias() == 0;
    }

    public Data max(Data data) {

        return (this.getDias() > data.getDias() ? this : data);
    }

    public Data min(Data data) {

        return (this.getDias() < data.getDias() ? this : data);
    }

    public int diff(Data data) {

        return this.getDias() - data.getDias();
    }

    @Override
    public String toString() {

        return dia + "/" + mes + "/" + ano;
    }
}
