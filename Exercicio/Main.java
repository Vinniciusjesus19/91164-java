package Exercicio;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "123", "Apto 1", "12345-678", "Cidade 1");
        System.out.println(endereco);

        Medico medico = new Medico("Medico 1", endereco, "medico1@example.com", 10000.0f, "CRM12345");
        System.out.println(medico);

        Engenheiro engenheiro = new Engenheiro("Engenheiro 1", endereco, "engenheiro1@example.com", 12000.0f, "CREA12345");
        System.out.println(engenheiro);
    }
}
