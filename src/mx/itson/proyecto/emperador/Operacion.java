
package mx.itson.proyecto.emperador;


public class Operacion {
    /**
     * Separar una cadena de texto donde encuentre el caracter coma
     * @param oracion Es la oracion que será separada en fracciones
     * @return Array en String cuyo componente será una fraccion de la cadena otorgada
     */
    
    public String [] separar (String oracion) {
    String [] resultado = oracion.split(",");
    
    
    return resultado;
    }
    //En esta parte del código se realizo un separador de los datos, en este caso en espacios, pero en forma de Array String.
    public String [] determinar (String datos) {
    String [] conjuntoDatos = datos.split(" ");
    return conjuntoDatos;
        
        
    }


        
    }
        
    

