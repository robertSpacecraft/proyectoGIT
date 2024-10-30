package programacionProblemas;

//Roberto Amorós Linares
import java.util.Scanner;

public class UD3Problema1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valorIntroducido;
        float[] sistolica = new float[3];//cambiar a 10
        float[] diastolica = new float[3];//cambiar a 10

        double[] sistoDiasto = new double[sistolica.length + diastolica.length];
        int maxDatos = 6;//cambiar a 20
        int contador = 0;

        System.out.print("Introduce los datos: ");
        while (contador < maxDatos) {

            if (!input.hasNextDouble()) {
                input.next();

            } else if ((valorIntroducido = input.nextFloat()) >= 3 && valorIntroducido <= 22) {

                sistoDiasto[contador] = valorIntroducido;
                contador++;

            } else if (valorIntroducido == 0 && contador >= 2){
            
            contador = maxDatos;
            }

        }
        for (int i = 0; i < sistoDiasto.length; i++) {

            System.out.println("Los datos introducidos son: " + sistoDiasto[i]);
        }
        System.out.println("");
    }

}
