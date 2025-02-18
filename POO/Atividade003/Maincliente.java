package Atividade003;

public class Maincliente {
    public static void main(String[] args) {
        

        cliente cliente = new cliente();
        
        cliente.setNome("Vinnicius");
        cliente.setIdade(20);
        cliente.setPet("Bulldod");

        System.out.println("Nome: " +  cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Pet: " + cliente.getIdade());

        System.out.println("\n==Exibindo dados do pet");

        pet pet = new Pet();



    }

}
