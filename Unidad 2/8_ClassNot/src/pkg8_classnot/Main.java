package pkg8_classnot;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }
    }
}
