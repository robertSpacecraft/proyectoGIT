package programacionProblemas;

//Roberto Amorós Linares
import java.util.Scanner;

public class UD3Problema3 {

    public static void main(String[] args) {
        //Declaramos las variables que necesitamos:
        int filas = 0;
        int columnas = 0;

        Scanner input = new Scanner(System.in);

        //Pedimos el tamaño de la matriz, asumimos que se trata de una matriz cuadrada por lo que asignamos el mismo valor a las columnas
        System.out.print("Introduzca el tamaño de la matriz: ");
        if (input.hasNextInt()) {
            filas = input.nextInt();
            input.nextLine();

            columnas = filas;

        }

        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int aleatory = (int) (Math.random() * 2);
                matrix[i][j] = aleatory;

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);

            }
            System.out.println();

        }
        
       
        for (int i = 0; i < matrix.length; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                
            sumaFilas += matrix[i][j];
                

            }
            System.out.println("Fila: " + (i + 1) + ": " + sumaFilas);
        }
        
    }

}
