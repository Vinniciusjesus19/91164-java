package Exercicio;

public class Medico extends Funcionario {
    private String crm;

    public Medico(String nome, Endereco endereco, String email, Float salario, String crm) {
        super(nome, endereco, email, salario);
        this.crm = crm;
    }

    // Métodos de acesso (getters e setters)
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    // Método toString detalhado
    @Override
    public String toString() {
       
        return "\nMedico {" +
                "\n nome='" + getNome() + '\'' +
                "\n endereco=" + getEndereco() +
                "\n email='" + getEmail() + '\'' +
                "\n salario=" + getSalario() +
                "\n crm='" + crm + '\'' +
                '}';
    }


}
