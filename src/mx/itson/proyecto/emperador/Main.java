
package mx.itson.proyecto.emperador;

import java.util.Scanner;


/**
 * 
 * @author ADRIANA
 */


public class Main {


    public static void main(String[] args) {
 
        //En esta parte del codigo lo que se hizo es importar la clase Scanner para poder ingresarle los datos por consola, gracias al metodo NextLines
        System.out.println("Escribe los datos a separar: ");
         Scanner scanner = new Scanner (System.in);
         
         String enunciado = scanner.nextLine();
         
         
         String [] resultado = new Operacion().separar(enunciado);
         
         for (String s: resultado){
             String[]datosSeparados= new Operacion().determinar (s);
             System.out.println(" ID:  "+datosSeparados[0]+" Nombre y apellido: "+ datosSeparados[3]+ "  "+ datosSeparados[1]);
        
    }
    
}
}
