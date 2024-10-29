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

        int[] vectorFilas = new int[filas];
        int[] vectorColumnas = new int[columnas];
        //Creamos el array, lo recorremos y le asignamos un valor aleatorio Math.random() * 2 da como resultado 0 o 1
        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int aleatory = (int) (Math.random() * 2);
                matrix[i][j] = aleatory;

            }

        }
        //Imrpimimos la matriz para ver los datos
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);

            }
            System.out.println();

        }
        //Recorremos la matriz y mostramos la suma de los elementos de cada fila
        for (int i = 0; i < matrix.length; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                sumaFilas += matrix[i][j];

            }
            System.out.println("Fila: " + (i + 1) + ": " + sumaFilas);

            //Guardamos la suma de cada fila en un nuevo array:
            vectorFilas[i] = sumaFilas;
        }

        //Creamos una variable para almacenar el índice de la fila con más 1s y otra variable para comparar los valores del array
        int winnerFila = 0;
        int filaValor = 0;
        for (int i = 0; i < vectorFilas.length; i++) {

            if (vectorFilas[i] > filaValor) {
                filaValor = vectorFilas[i];
                winnerFila = i;
            }
        }
        /*Aquí iba a imprimir los resultados de las filas pero he cosiderado mejor
        calcular las columnas y así, crear una condicion que en la que si no se han 
        detectado 0s en las filas y en las columnas imprima que no hay 1s en la matriz
         */

        //Recorremos la matriz y mostramos la suma de los elementos de cada columna
        for (int j = 0; j < matrix[0].length; j++) {
            int sumaColumnas = 0;
            for (int i = 0; i < matrix.length; i++) {

                sumaColumnas += matrix[i][j];

            }
            System.out.println("Columna: " + (j + 1) + ": " + sumaColumnas);
            //Guardamos la suma de 1s de cada columna en un nuevo array

            vectorColumnas[j] = sumaColumnas;

        }
        //Creamos las variables para el indice de la columna y para los valores de las columnas
        int winnerColumna = 0;
        int columnaValor = 0;
        for (int i = 0; i < vectorColumnas.length; i++) {
            if (vectorColumnas[i] > columnaValor) {
                columnaValor = vectorColumnas[i];
                winnerColumna = i;
            }

        }
        if (columnaValor == 0 && filaValor == 0) {

            System.out.println("La Matriz no contiene 1s");
        } else {

            System.out.println("La fila con más 1s es: " + (winnerFila + 1) + " con: " + filaValor + " 1s");
            System.out.println("La columna con más 1s es: " + (winnerColumna + 1) + " con " + columnaValor + " 1s");

        }
    }

}
