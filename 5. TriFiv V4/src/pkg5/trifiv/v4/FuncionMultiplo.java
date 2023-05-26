package pkg5.trifiv.v4;

public class FuncionMultiplo {
    public String retornaMultiplo(int num){
        if(num % 3 == 0 && num % 5 ==0){
            return "TRIFIV";
        }
        if (num%3==0){
            return "TRI";
        }
        if (num%5==0){
            return "FIV";
        }
        return "no es multiplo de ninguno";
    }
}
