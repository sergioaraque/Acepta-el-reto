/**
 * Es el ejercicio 116 de Acepta el reto ("¡Hola mundo!")
 * 
 * @author Sergio Araque
 * @version 20.10.2016
 */
public class Hola_Mundo
{
    static java.util.Scanner in;

    public static void casoDePrueba() {
        System.out.println("Hola mundo.");
    }

    public static void main(String args[]) {
        in = new java.util.Scanner(System.in);

        int numCasos;
        numCasos = in.nextInt();
        for (int i  = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }
}
