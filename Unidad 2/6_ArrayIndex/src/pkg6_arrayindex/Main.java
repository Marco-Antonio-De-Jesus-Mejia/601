package pkg6_arrayindex;

public class Main {

    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int element = array[3]; 
            System.out.println("Elemento obtenido: " + element); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrio una excepcion: " + e.getMessage());
        }
    } 
}
