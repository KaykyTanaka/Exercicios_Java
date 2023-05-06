/* 
 * ModeloDeComputador.java
 * 
 * 7) Escrever uma classe ModeloDeComputador que encapsule valores que definam a configuração de um
 * microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por
 * exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo
 * a soma do custo de seus componentes:
 * 
 * • Placa-mãe: R$800
 * • Opções de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910
 * • Opções de memória: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350.
 * • Opções de disco rígido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500.
 * • Opções de monitor: 15 polegadas a R$320, 17 polegadas a R$520.
 * 
 */
public class ModeloDeComputador {
    private double placa, processador, memoria, hd, monitor;

    public ModeloDeComputador() {
        setModelo(800, 700, 350, 300, 320);
    }

    public ModeloDeComputador(double placa, double processador, double memoria, double hd, double monitor) {
        setModelo(800, 700, 350, 300, 320);
        setModelo(placa, processador, memoria, hd, monitor);
    }

    public void setModelo(double placa, double processador, double memoria, double hd, double monitor) {
        setPlaca(placa);
        setProcessador(processador);
        setMemoria(memoria);
        setHd(hd);
        setMonitor(monitor);
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public void setProcessador(double processador) {
        this.processador = processador;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public void setMonitor(double monitor) {
        this.monitor = monitor;
    }

    public double getPlaca() {
        return placa;
    }

    public double getProcessador() {
        return processador;
    }

    public double getMemoria() {
        return memoria;
    }

    public double getHd() {
        return hd;
    }

    public double getMonitor() {
        return monitor;
    }

    public double calcularPreco() {
        return (placa + processador + memoria + hd + monitor);
    }

    @Override
    public String toString() {

        return "\nValor da placa: R$" + placa
                + "\nValor do processador: R$" + processador
                + "\nValor da memoria: R$" + memoria
                + "\nValor do HD: R$" + hd
                + "\nValor do monitor: R$" + monitor + "\nValor total: R$" + this.calcularPreco();
    }

}
