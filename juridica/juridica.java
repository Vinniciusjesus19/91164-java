package juridica;

public class juridica extends pessoa0 {
    protected String cnpj;
    protected String inscricaoEstadual;
    protected String inscricaoMunicipal;

    public juridica(String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String inscricaoMunicipal) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    // Métodos de acesso (getters e setters)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    // Método toString
    @Override
    public String toString() {
        return "juridica{" +
                "\nnome='" + nome + '\'' +
                "\n endereco='" + endereco + '\'' +
                "\n telefone='" + telefone + '\'' +
                "\n cnpj='" + cnpj + '\'' +
                "\n inscricaoEstadual='" + inscricaoEstadual + '\'' +
                "\n inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                '}';
    }
}
