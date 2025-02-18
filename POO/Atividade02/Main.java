package Atividade02;

public class Main {
    public static void main(String[] args) {
 
        System.out.println("\n==Exibindo Cliente==");    
        
            cliente002 cliente = new Cliente();
        
            cliente.setNome("Claudio");
            cliente.setIdade(20);
            cliente.setEndereco("Salvador BA");
        
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Endereço: " + cliente.getEndereco());
            
        System.out.println("\n==Exibindo Endereço==");
        
            Endereco endereco = new Endereco();
        
            endereco.setLogradouro("BA");
            endereco.setNumero(83);
            endereco.setCidade("Salvador");
        
            System.out.println(" : " + endereco.getLogradouro());
            System.out.println(" : " + endereco.getNumero());
            System.out.println(" : " + endereco.getCidade());
        
        }
}
        