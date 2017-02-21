
/**
 * Es el ejercicio 340 de acepta el reto llamado Cuadrados con cerillas.
 * 
 * @author Sergio Araque
 * @version 21.02.2017
 */
public class Cerillas
{
    static java.util.Scanner entrada;
   
    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 1; i <= numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba()
    {
        // -- Recojo los valores del horizontal y vertical para calcularlo. 
        int horizontal = entrada.nextInt(); // Variable del tipo int que guarda el valor horizontal.
        int vertical = entrada.nextInt();   // Variable del tipo int que guarda el valor vertical.
        
        // -- Declaro una variable del tipo int para dejar más limpio la impresión.
        int resultado =  ((horizontal + 1) * vertical) + (vertical + 1) * horizontal; //Variable del tipo int que realiza la operación.
        
        // -- Imprimo el resultado de la operación.
        System.out.println(resultado);
    }
}
