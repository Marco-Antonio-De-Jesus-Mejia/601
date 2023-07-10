package pkg3_tryfinally;

public class Main {

    public static void main(String[] args) {
        try{
            float equis=5/0;
            System.out.println("Equis= " + equis);
        }catch (ArithmeticException e){
            System.out.println("Error: division entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally.");
        }
    }
}
