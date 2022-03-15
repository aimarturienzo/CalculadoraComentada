/**
 * Clase : Menu
 * 
 * @author Aimar Turienzo
 * 
 * @version 11/03/2022
 * 
 * 
 */

package menu;
import java.util.Scanner;
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
/**
 * Crea un array de 2 elementos, pide al usuario los 2 elementos, los guarda en el array.
 * 
 * 
 * @return Retorna el array con los elementos escritos por el usuario
 */
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
/**
 * Esta funcion permite al usuario elegir la operacion a efectuar, para despues guardarla.
 * @return Una vez guardada la opción, el metodo devolverá una varialble con la operacion elegida por el usuario
 */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
 
/**
 * Esta funcion pregunta al usuario si desea seguir ejecutando el programa. El usuario, escribirá su opción, y este lo guardará en una variable
 * 
 * 
 * 
 * @return En caso de que la respuesta del usuario sea que si, la funci´n devolvera true, para que el usuario pueda seguir utilizando el programa. De lo contrario el programa finalizará
 */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}