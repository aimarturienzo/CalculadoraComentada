/**
 * Clase : Menu
 * 
 * @author Aimar Turienzo
 * 
 * @version 11/03/2022
 * 
 * 
 */
package operaciones;
public class Operaciones{
	
	
/**
 * Suma los valores
 * @param valor1 Lo recibe 
 * @param valor2 Lo recibe
 * @return Retorna una variable con la suma de ambos valores
 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
/**
 * Resta los valores
 * @param valor1 Lo recibe
 * @param valor2 Lo recibe
 * @return Retorna la variable con la resta de los valores
 */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
/**
 * Multiplica los valores    
 * @param valor1 Lo recibe
 * @param valor2 Lo recibe
 * @return Retorna la variable con la multiplicacion de los valores
 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
 /**
  * Divide los valores   
  * @param valor1 Lo recibe
  * @param valor2 Lo recibe
  * @return Retorna la variable con la division de los valores
  * @throws Contempla lo que sucede si alguno de los valores es dividido entre cero
  */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        try {
        numero=	valor1 / 0;
        numero = valor2 / 0;
        }catch(Exception e) {
        	System.out.println("El numero no se puede dividir entre 0");
        }
       
        return numero;
    }
  /**
   * Calcula el resto de los valores  
   * @param valor1 Lo recibe
   * @param valor2 Lo recibe
   * @return Retorna la variable con el resto de los valores
   */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}