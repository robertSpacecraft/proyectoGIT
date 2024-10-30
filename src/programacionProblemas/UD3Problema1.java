package programacionProblemas;

//Roberto Amorós Linares
import java.util.Scanner;

public class UD3Problema1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valorIntroducido;
        float[] sistolica = new float[3];//cambiar a 10
        float[] diastolica = new float[3];//cambiar a 10

        int maxDatos = 6;//cambiar a 20
        int contador = 0;

        System.out.print("Introduce los datos: ");
        while (contador < maxDatos) {

            if (!input.hasNextDouble()) {
                input.next();

            } else if ((valorIntroducido = input.nextFloat()) >= 3 && valorIntroducido <= 22) {

                if (contador % 2 == 0) {

                    sistolica[contador / 2] = valorIntroducido;
                } else {

                    diastolica[contador / 2] = valorIntroducido;
                }
                contador++;

            } else if (valorIntroducido == 0 && contador >= 2) {

                contador = maxDatos;
            }

        }
        for (int i = 0; i < sistolica.length; i++) {

            System.out.println("Los datos introducidos son: " + sistolica[i]);
        }
        System.out.println("");

        for (int i = 0; i < diastolica.length; i++) {

            System.out.println("Los datos introducidos son: " + diastolica[i]);
        }
        System.out.println("");
    }

}
