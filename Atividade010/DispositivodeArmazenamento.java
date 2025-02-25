package Atividade010;

public class DispositivodeArmazenamento {
        private String marca;
        private String modelo;
        private int capacidade;
      
        public DispositivodeArmazenamento() {
        }

        public DispositivodeArmazenamento(String marca, String modelo, int capacidade) {
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
            return "\n== DispositivodeArmazenamento [\n== marca=" + marca + ", \n== modelo=" + modelo + ", \n== capacidade=" + capacidade
                    + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
        

      }
}
