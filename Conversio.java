import java.util.Scanner;

public class Conversio {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad en libras estarlinas (£)");
        int valor_libras = sc.nextInt();
                
        double tipos_de_canvi = 0.86;
        System.out.println(valor_libras + " libras estarlinas (£), actualmente equivalen a " + valor_libras / tipos_de_canvi + " euros (€)");

        sc.close();
    }
}