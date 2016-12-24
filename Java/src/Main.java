
import javax.swing.JOptionPane;

public class Main
{
    // implementacion del metodo para mostrar los numeros impares
    public static void mostrarNumerosImpares(int n)
    {
        // el metodo requiere de un parametro (n) que sera el numero max de los numeros impares que queremos mostrar
        String numeros = "";
        // recorremos con el ciclo for desde 1 hasta el valor pasado como parametro (n)
        for (int i = 1; i <= n; i++)
        {
            // si el modulo o resto entre (i) y 2 es diferente a cero, entonces el numero (i) es impar
            if (i % 2 != 0)
            {
                /* le asignamos a "numeros" el valor de "numeros" actual más el valor convertido a string de "i" actual
                 * (se debe convertir a string el valor de "i" porque sino el operador + pensara que estamos
                 * haciendo una operacion, y no estamos haciendo eso, solo estamos acumulando)
                 */
                numeros = numeros + " " + String.valueOf(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Numeros impares: " + numeros);
    }
    
    public static void main(String[] args)
    {
        // se crea un objeto de la clase Numero (Instanciaciación)
        Numero obj = new Numero();
        // pedimos el numero y los guardamos en la variable "num"
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero:"));
        // llamamos al metodo mostrarNumerosPares() y le asignamos como parametro la variable "num"
        mostrarNumerosImpares(num);
        // llamamos al metodo sumaNumerosPares() y le asignamos "num" como parametro para calcular la suma
        JOptionPane.showMessageDialog(null, "Suma: " + obj.sumaNumerosImpares(num));
    }
}