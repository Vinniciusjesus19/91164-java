package juridica;

public abstract class pessoa0 {
 
        protected String nome;
        protected String endereco;
        protected String telefone;

        public pessoa0(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        // Métodos de acesso (getters e setters)
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        // Método toString
        @Override
        public String toString() {
            return "Pessoa{" +
                    "\n nome='" + nome + '\'' +
                    "\n endereco='" + endereco + '\'' +
                    "\n telefone='" + telefone + '\'' +
                    '}';
        }
    }

