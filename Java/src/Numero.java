public class Numero
{
    // implementacion del metodo para calcular la suma de los numeros impares
    public int sumaNumerosImpares(int n)
    {
        // el metodo necesita de un parametro (n) que sera el numero max de los numeros impares que le calcularemos la suma
        int suma = 0; // declaramos la variable suma y la inicializamos en cero
        // recorremos con el ciclo for desde 1 hasta el valor pasado como parametro (n)
        for (int i = 1; i <= n; i++)
        {
            // si el modulo o resto entre (i) y 2 es diferente a cero, entonces el numero (i) es impar
            if (i % 2 != 0)
            {
                // le asignamos a "suma" los valores actuales de "suma" más el valor de "i" (suma es una variable acumuladora)
                suma = suma + i;
            }
        }
        // retornamos el valor que haya acumulado suma
        return suma;
    }
}