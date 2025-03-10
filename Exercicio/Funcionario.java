package Exercicio;

public abstract class Funcionario {
    private String nome;
    private Endereco endereco;
    private String email;
    private Float salario;

    public Funcionario(String nome, Endereco endereco, String email, Float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.salario = salario;
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    // Método toString detalhado
    @Override
    public String toString() {
        
        return "\nFuncionario {" +
                "\n nome='" + nome + '\'' +
                "\n endereco=" + endereco +
                "\n email='" + email + '\'' +
                "\n salario=" + salario +
                '}';
    }
}
