package Pessoa;

import enums.Pessoa;

    public class cliente extends Pessoa {

        private String dataDaCompra;
        private String formaDePagamento;
        
        public cliente() {
        }

        public cliente(String dataDaCompra, String formaDePagamento) {
            this.dataDaCompra = dataDaCompra;
            this.formaDePagamento = formaDePagamento;
        }

        public String getDataDaCompra() {
            return dataDaCompra;
        }

        public void setDataDaCompra(String dataDaCompra) {
            this.dataDaCompra = dataDaCompra;
        }

        public String getFormaDePagamento() {
            return formaDePagamento;
        }

        public void setFormaDePagamento(String formaDePagamento) {
            this.formaDePagamento = formaDePagamento;
        }

        @Override
        public String toString() {
            return "cliente [dataDaCompra=" + dataDaCompra + ", formaDePagamento=" + formaDePagamento
                    + ", getDataDaCompra()=" + getDataDaCompra() + ", getFormaDePagamento()=" + getFormaDePagamento()
                    + "]";
        }
        
    }

}
