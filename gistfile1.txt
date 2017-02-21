
/**
 * Es el ejercicio 124 de acepta el reto ("¿Cuántas me llevo?").
 * 
 * @author Sergio Araque 
 * @version 21.02.2017
 */
public class Acarreos
{    
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba())
        {
        }
    }

    private static boolean casoDePrueba ( ) 
    {
        // -- Recogemos los números en un string cada uno.
        String numero1 = entrada.next();
        String numero2 = entrada.next();

        // -- Comparamos la cadena con el valor cero. Usamos el método equals para comparar la cadena con el caracter cero. Si es verdad, se acaba.
        if (numero1.equals("0") && numero2.equals("0")) {
            return false;
        }

        // -- Creamos dos nuevas cadenas, mayor y menor para poder ordenar los números (cual es mayor y cual es menor).
        String mayor, menor; // Variables del tipo String que soon las cadenas ordenadas en función de su longitud.

        // -- Ordenamos los números para poder hacer mejor la suma (evitar cuando un número ya no tiene caracteres).
        if(numero1.length() > numero2.length()) {
            mayor = numero1;
            menor = numero2;
        }
        else {
            menor = numero1;
            mayor = numero2;
        }

        // -- Longitud del númeor menor y del mayor.
        int longitudMenor = menor.length(); // Variable de tipo int que almacena el tamaño del número menor.
        int longitudMayor = mayor.length(); // Varibale del tipo int que almacena el tamaño del número mayor.

        // -- Voy contando las que me llevo (al sumar un numero con el otro).
        int numLlevadas = 0; // Variable de tipo int (contador) que es el número de acarreos que se produce.
        int meLlevo = 0;     // Variable de tipo int que indica que me llevo una para la siguiente suma.

        // -- Sumo primero mientras tienen cifras los dos números. Necesitamos dos variables del tipo int.
        int j, i; // Variables del tipo int que nos ayudarán a ir operando con las cifras.
        
        for(i = menor.length() - 1, j =mayor.length() - 1; i >= 0; i--, j--) {
            // -- Saco la última cifra de cada número con el charAt (devuelve un carácter) y le resto el cero (en caracter) para que me de el número.
            int cifra1 = mayor.charAt(j) - '0'; // Variable de tipo int que almacena en cada momento un caracter pasado a número del número1.
            int cifra2 = menor.charAt(i) - '0'; // Variable de tipo int que almacena en cada momento un caracter pasado a número del número2.

            // -- Ahora compruebo si tiene acarreo o no.
            if ((cifra1 + cifra2 + meLlevo) > 9) { //Mayor que 9 para que coja del 10 hacia arriba.
                numLlevadas++; // Añadimos uno al contador.
                meLlevo = 1;   // Sumamos uno al número siguiente.
            }
            else {
                meLlevo = 0; // Y si no se cumple, no me llevo nada para la operación siguiente.
            }
        }


        // -- Creo una variable que almacene la diferencia entre el mayor y el menor.
        j = longitudMayor - longitudMenor - 1; // Variable del tipo int que almacena la diferencia de números entre el mayor y el menor menos uno.

        // --  Sumo el trozo del número mayor (por si modifica el valor de numLlevadas).
        while(j >= 0 && meLlevo == 1) {
            char cifra = mayor.charAt(j); // Variable del tipo int que almacena el valor de la cifra mayor.

            if (cifra == '9') {
                numLlevadas++;
            }
            else {
                meLlevo = 0; //Para que finalice el while.
            }
            j--; // Para que la i vaya bajando de valor.
        }
        // -- Imprimo por pantalla las llevadas que me han dado.
        System.out.println(numLlevadas);

        return true;
    }
}
