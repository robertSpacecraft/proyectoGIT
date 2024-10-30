package programacionProblemas;

//Roberto Amorós Linares
import java.util.Scanner;

public class UD3Problema1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valorIntroducido;
        float[] sistolica = new float[3];//cambiar a 10
        float[] diastolica = new float[3];//cambiar a 10
        int indiceArrays = 0;

        int maxDatos = 6;//cambiar a 20
        int contador = 0;

        //Variables para confirmar que sistólica nunca va a ser mayor que diastólica
        float valorSistolica = 0;
        float valorDiastolica = 0;

        System.out.print("Introduce los datos: ");
        while (contador < maxDatos) {

            //Comprobamos si el valor introducido es un float, de no serlo lo descartamos.
            if (!input.hasNextDouble()) {
                input.next();

                //Comprobamos si el valor introducido está en rango, de no estar lo descartamos
            } else if ((valorIntroducido = input.nextFloat()) >= 3 && valorIntroducido <= 22) {
                //Asignamos el valor par a sistólica y el impar a la diastólica
                if (contador % 2 == 0) {

                    valorSistolica = valorIntroducido;
                    valorDiastolica = 0;

                } else {

                    valorDiastolica = valorIntroducido;
                }
                //Comrpobamos que la Sistólica sea mayor que la diastólica
                if (valorSistolica > valorDiastolica && valorDiastolica != 0) {   
                    sistolica[indiceArrays] = valorSistolica;
                    diastolica[indiceArrays] = valorDiastolica;
                    indiceArrays++;
                }else if(valorDiastolica != 0){//Esto es por si se mete una sistólica menor que una diastólica
                contador--;
                }
                
                System.out.println("contador: " + contador);
                System.out.println("ValorIntroducido: " + valorIntroducido);
                System.out.println("Valor Sistolica: " + valorSistolica);
                System.out.println("Valor Distolica: " + valorDiastolica);
                System.out.println("i: " + indiceArrays);
                contador++;
            } else if (valorIntroducido == 0 && contador >= 4) {

                contador = maxDatos;
            }

        }
        for (int i = 0; i < sistolica.length; i++) {

            System.out.println("La Sistolica es : " + sistolica[i]);
        }
        System.out.println("");

        for (int i = 0; i < diastolica.length; i++) {

            System.out.println("La Diastólica es: " + diastolica[i]);
        }
        System.out.println("");

    }

}
