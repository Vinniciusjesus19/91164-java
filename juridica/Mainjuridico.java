package juridica;

public class Mainjuridico {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("João", "Rua 1", "1234-5678", "123.456.789-00", "12.345.678-9", "01/01/2000");
        System.out.println(fisica);
        System .out.println("\n"); 
        
        juridica juridica = new juridica("Empresa", "Rua 2", "8765-4321", "12.345.678/0001-90", "123.456.789.000", "123.456.789.000");
        System.out.println(juridica);
    }
}
