package pkg2.trifiv.v1;
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;


public class TriFivV1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int num; 
        float mult3;
        float mult5;
        System.out .println("Dame el numero: ");
        num = Integer.parseInt(bufEntrada.readLine());
        mult3 = num%3;
        mult5 = num%5;
        if(mult3 ==0 && mult5 ==0){
            System.out.println("TRIFIV");
        }
        else if(mult3==0){
            System.out.println("TRI");
        }
        else if(mult5==0){
            System.out.println("FIV");
        }
    }
}
