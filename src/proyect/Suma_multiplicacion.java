package proyect;
import javax.swing.JOptionPane;
public class Suma_multiplicacion {
    public static void main (String[] args){
        long suma;
        int valor,x;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor entero"));
        suma = valor;
        for (x = valor - 2; x > 0; x = x - 2) {
            suma += x;
            
            suma = suma * (x + 1);
        }
    }
}
