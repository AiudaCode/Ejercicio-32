#include <iostream>
#include "Numero.h"

using namespace std;

// implementacion del metodo para mostrar los numeros impares
void mostrarNumerosImpares(int n)
{
    // el metodo requiere de un parametro (n) que sera el numero max de los numeros impares que queremos mostrar
    cout << "Numeros impares: ";
    // recorremos con el ciclo for desde 1 hasta el valor pasado como parametro (n)
    for (int i = 1; i <= n; i++)
    {
        // si el modulo o resto entre (i) y 2 es diferente a cero, entonces el numero (i) es impar
        if (i % 2 != 0)
        {
            // mostramos el numero (i)
            cout << i << " ";
        }
    }
}

int main(void)
{
    // se crea un objeto de la clase Numero (Instanciaciación)
    Numero *obj = new Numero();
    // declaramos una variable de tipo entero llamada "num"
    int num;
    // pedimos el numero
    cout << "Digite numero: ";
    // guardamos el numero en la variable "num"
    cin >> num;
    // llamamos al metodo mostrarNumerosImpares() y le asignamos como parametro la variable "num"
    mostrarNumerosImpares(num);
    // llamamos al metodo sumaNumerosImpares() y le asignamos "num" como parametro para calcular la suma
    cout << endl << "Suma: " << obj->sumaNumerosImpares(num) << endl;
}
