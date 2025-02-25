package Atividade010;

public class Processador {
    private String marca;
    private String modelo;
    private double frequencia;

    public Processador() {
    }

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\n== Processador [\n== marca=" + marca + ", \n== modelo=" + modelo + ", \n== frequencia=" + frequencia + ", \n== getMarca()="
                + getMarca() + ", getModelo()=" + getModelo() + "]";

    }
}
