package Atividade010;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "Core i7", 3.5);
        System.out.println(processador.toString());
        
        Memoria memoria = new Memoria("Corsair", "Vengeance LPX", 16);
        System.out.println(memoria.toString());
        
        PlacaMae placamae = new PlacaMae("Asus", "ROG Strix", "LGA 1200");
        System.out.println(placamae.toString());
        
        DispositivodeArmazenamento dispositivoarmazenamento= new DispositivodeArmazenamento("Samsung", "970 EVO", 512);
        System.out.println(dispositivoarmazenamento.toString());
    }

}
