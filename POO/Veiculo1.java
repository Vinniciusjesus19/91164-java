public class Veiculo1 {
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private String capacidadeTanque;
    private String velocidadeMaxima;
    private String consumoMedio;

    public Veiculo1() {
    }


    public Veiculo1(String placa, String cor, int numeroPassageiros, String capacidadeTanque, String velocidadeMaxima,
            String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }



    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }



    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }



    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }



    public String getCapacidadeTanque() {
        return capacidadeTanque;
    }



    public void setCapacidadeTanque(String capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }



    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }



    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }



    public String getConsumoMedio() {
        return consumoMedio;
    }



    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
      
    

}
