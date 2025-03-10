package Exercicio;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String nome, Endereco endereco, String email, Float salario, String crea) {
        super(nome, endereco, email, salario);
        this.crea = crea;
    }

    // Métodos de acesso (getters e setters)
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    // Método toString detalhado
    @Override
    public String toString() {
        
        return "\nEngenheiro {" +
                "nome='" + getNome() + '\'' +
                ", endereco=" + getEndereco() +
                ", email='" + getEmail() + '\'' +
                ", salario=" + getSalario() +
                ", crea='" + crea + '\'' +
                '}';
    }


    }
