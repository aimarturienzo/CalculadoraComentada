/**
 * Clase : Menu
 * 
 * @author Aimar Turienzo
 * 
 * @version 11/03/2022
 * 
 * 
 */
package principal;
import menu.Menu;
import operaciones.Operaciones;
import java.util.*;
public class Calculadora{
	
/**
 * 
 * @param args Crea un array de 2 elementos 
 * Crea un objeto de la clase menu
 * Crea un objeto de la clase de operaciones 
 * El array de operandos llama a la funci�n pedirNumeros de la clase menu para saber los numeros
 * La variable de tipo String llama a la funci�n menuOperaciones para escoger la operaci�n
 * Dependiendo la operaci�n escogida, la variable Resultado llamar� a la funcion correspondiente de la clase Operaciones
 * @throws Si el usuario escribe una funcion que no existe en el programa, esta excepcion lanzara un mensaje mostrando el error correspondiente
 */
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
          try {
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operaci�n no v�lida");
            }
            }catch(ArithmeticException e) {
            	System.out.println("Error aritmetico");
            }
        }   while (menu.repetir());
    }
}