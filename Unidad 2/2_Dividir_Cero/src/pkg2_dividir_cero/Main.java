package pkg2_dividir_cero;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int x,y;
        try{
            x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicita datos", 3));
            y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 2:", "Solicita datos", 3));
            JOptionPane.showMessageDialog(null, "La division de " + x + " / " + y + " es " + (x/y), "Mostrando resultado", 1);
        }catch (NumberFormatException n){
            System.out.println(n.getMessage() + " No es numero Entero");
        }catch (ArithmeticException a){
            System.out.println(a.getMessage() + " No se puede dividir entre 0");
        }
    }
}
