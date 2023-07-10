package pkg4_propaga_excepcion;

public class Main {

    public static void main(String[] args) {
        try{
            int division = miMetodo(10,0);
            System.out.println(division);
        }catch (ArithmeticException e){
            System.out.println("Entidad aritmetica arrojada");
        }
    }
    public static int miMetodo(int a, int b) throws ArithmeticException{
        int c=a/b;
        return c;
    }
}
