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
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;

public class Calculadora{
	 private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
	
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
        Handler fileHandler = null;
        Handler consoleHandler= new ConsoleHandler();
        try {
         fileHandler   = new FileHandler("./Operaciones.log");
    }catch(IOException exception){
        LOGGER.log(Level.SEVERE, "Ocurrió un error en FileHandler.", exception);
    }
        LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);
        
        //Establecer niveles a handlers y LOGGER
        consoleHandler.setLevel(Level.WARNING);
        fileHandler.setLevel(Level.FINE);
        LOGGER.setLevel(Level.FINE);
         
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
            LOGGER.log(Level.FINE, "Operaci�n: " + operacion + " operando 1 : " + operandos[0]+ " opreando 2 " + operandos[1] + " resultado ");
            }catch(ArithmeticException e) {
            	System.out.println("Error aritmetico");
            	 LOGGER.log(Level.WARNING, "Division entre 0");
            }
        }   while (menu.repetir());
    }
}