package juridica;

public class Fisica extends pessoa0 {
    protected String cpf;
    protected String rg; 
    protected String dataNascimento;

    public Fisica(String nome, String endereco, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Métodos de acesso (getters e setters)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método toString
    @Override
    public String toString() {
        return "Fisica{" +
                "\n nome='" + nome + '\'' +
                "\n endereco='" + endereco + '\'' +
                "\n telefone='" + telefone + '\'' +
                "\n cpf='" + cpf + '\'' +
                "\n rg='" + rg + '\'' +
                "\n dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
