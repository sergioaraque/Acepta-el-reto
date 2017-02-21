
/**
 * Es el ejercicio 313 de Acepta el Reto ("Fin de Mes").
 * 
 * @author Sergio Araque
 * @version 21.02.2017
 */
public class FinDeMes
{
    static java.util.Scanner entrada;
    
    // -- Constantes
    private static final String SI = "SI";
    private static final String NO = "NO";
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
        // -- Primero recojo ambos números en un int cada uno.
        int numero1 = entrada.nextInt(); // Variable del tipo int que almacena el primer número.
        int numero2 = entrada.nextInt(); // Variable del tipo int que almacena el segundo número.
        
        // -- Pregunto si el número uno menos el dos da mayor o igual que cero.
        if((numero1 + numero2) >= 0) {
            System.out.println(SI);
        }
        else {
            System.out.println(NO);
        }
    }
}
