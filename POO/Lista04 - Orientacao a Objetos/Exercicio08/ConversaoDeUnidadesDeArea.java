/* 
* ConversaoDeUnidadesDeArea.java
* 
* 8) Escrever a classe ConversaoDeUnidadesDeArea com métodos para conversão das unidades de área
*  segundo a lista abaixo:
* • 1 metro quadrado = 10.76 pés quadrados
* • 1 pé quadrado = 929 centímetros quadrados
* • 1 milha quadrada = 640 acres
* • 1 acre = 43.560 pés quadrados
* 
*/

public class ConversaoDeUnidadesDeArea {
    private double area;

    public ConversaoDeUnidadesDeArea() {
        setConv(1);
    }

    public ConversaoDeUnidadesDeArea(double area) {
        setConv(1);
        setConv(area);
    }

    public void setConv(double area) {
        setArea(area);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public double getMp() {
        // 1 metro quadrado = 10.76 pés quadrados
        return area * 10.76;
    }

    public double getPc() {
        // 1 pé quadrado = 929 centímetros quadrados
        return area * 929;
    }

    public double getMa() {
        // 1 milha quadrada = 640 acres
        return area * 640;
    }

    public double getAp() {
        // acre = 43.560 pés quadrados
        return area * 43560;
    }

}
