package pkg1_numero_entero;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int x,y;
        try{
            x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicita datos", 3));
        }catch (NumberFormatException n){
            System.out.println(n.getMessage() + " No es numero Entero");
        }
    }
}
