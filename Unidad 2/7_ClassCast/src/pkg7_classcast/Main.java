package pkg7_classcast;

public class Main {

    public static void main(String[] args) {
        try {
            Object obj = "Hola mundo";
            Integer num = (Integer) obj;
            System.out.println("Numero obtenido: " + num);
        } catch (ClassCastException e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }
    }
    
}
