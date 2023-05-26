package pkg5.trifiv.v4;
//import pkg5.trifiv.v4.FuncionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriFivV4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero; 
        FuncionMultiplo funcion = new FuncionMultiplo();
        System.out .println("Dame el numero: ");
        numero = Integer.parseInt(bufEntrada.readLine());
        System.out.println(funcion.retornaMultiplo(numero));
    }   
}
