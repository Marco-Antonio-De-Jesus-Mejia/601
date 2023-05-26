package pkg3.trifiv.v2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriFivV2 {

    public static void main(String[] args) throws IOException{
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));  
        int numero; 
        float mult3;
        float mult5;
        System.out .println("Dame el numero: ");
        numero = Integer.parseInt(bufEntrada.readLine());
        if(numero %3==0 && numero%5 ==0)
        {
            System.out.println("TRIFIV");
        }
        else if (numero%3==0)
        {
           System.out.println("TRI");
        }
        else if (numero%5==0)
        {
            System.out.println("FIV");
  
        }
    }
}
