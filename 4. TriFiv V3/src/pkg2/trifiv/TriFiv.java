package pkg2.trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriFiv {

    public static void main(String[] args) throws IOException{
    //Declaración de variables
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
        int numero;
        float mult3;
        float mult5;
    //Entrada de datos
        System.out.println("Dame el numero: ");
        numero = Integer.parseInt(bufEntrada.readLine());
    //Proceso de datos
        mult3 = numero%3;
        mult5 = numero%5;
        System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo (int num){
        if(num%3 == 0 && num%5 == 0){
            return "TriFiv";
        }
        else{
            if(num%3 == 0){
                return "Tri";
            }
            else{
                if(num%5 == 0){
                return "Fiv";
                }
            }
        }
        return "no es multiplo de ninguno";
    }
}
