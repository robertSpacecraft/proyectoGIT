package programacionProblemas;

//Roberto Amorós Linares

import java.util.Scanner;

public class UD3Problema1Array {
    public static void main(String[] args) {
        //Creamos las variables
        float[] sistoDiasto = new float[10];
        String lineaDatos;
        
        Scanner input = new Scanner(System.in);
        
        //Pedimos los datos y los almacenamos en una cadena de caracteres
        System.out.print("Introduzca los datos: ");
        lineaDatos = input.nextLine();
        
        //Eliminamos los espacios posibles
        String lineaDatosEspacios = lineaDatos.replaceAll("\\s+", "");
        
        
        
        System.out.print("Introduce los valores Sistólica y Diástolica: ");
        for (int i = 0; i < sistoDiasto.length; i++) {
            
          
            
        }
        
        for (int i = 0; i < sistoDiasto.length; i++) {
            
            
            
        }
        System.out.println("Las medidas obtenidas son:" + lineaDatos);
        System.out.println("Las medidas obtenidas son:" + lineaDatosEspacios);
    }
    
}
