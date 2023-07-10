package pkg9_nullpoint;

public class Main {
    
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Longitud de la cadena: " + length);
        } catch (NullPointerException e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }
    }
}
