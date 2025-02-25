package Atividade010;

public class Memoria {
    private String marca;
    private String modelo;
    private int capacidade; 

    public Memoria(String marca, String modelo, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "\n== Memoria [marca=" + marca + ", modelo=" + modelo + ", capacidade=" + capacidade + ", getMarca()="
                + getMarca() + ", getModelo()=" + getModelo() + "]";
    }

}
