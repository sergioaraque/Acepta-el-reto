
/**
 * Es el ejercicio 369 de Acepta el reto ("Contando en la arena").
 * 
 * @author Sergio Araque
 * @version 27.02.2017
 */
public class Contador
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
        // -- Recojo el número.
        int numero = entrada.nextInt();

        if (numero == 0) {
            return false;
        }
        // -- Declaro un contador de tipo String porque quiero que me devuelva una cadena de unos.
        String resultado = "";
        
        // -- Voy comprando si la variable "i" es menor que el número y mientras esto se cumpla se añade un 1.
        for(int i = 0; i < numero; i++) {
            resultado = resultado + "1";
        }
        
        // -- Imprimo el resultado.
        System.out.println(resultado);
        return true;
    }
}

