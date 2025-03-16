package gestiondearrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class GestionDeArrays {


    public void ejercicio1(){
        // Estas seis líneas se repiten en otro método :)
        int [] arrayNumeros = new int[10];
        Random random = new Random();


        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(100);
            System.out.print(arrayNumeros[i] + " ");
        }
    }

    // Estrategia errónea

    public void ejercicio2(){
        int [] arrayNumeros = new int[10];
        Random random = new Random();

        int numeroMayor = 0;
        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(100);
            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println();

        // Si usas el mismo valor dos veces (10), ¿mejor una variable?
        for (int i = 0; i <10 ; i++) {

            if (numeroMayor > arrayNumeros[i] ){
                numeroMayor = numeroMayor; // ¿?
            }
            else {
                numeroMayor = arrayNumeros[i] ;
            }



        }
        System.out.println("el numero mayor es : " + numeroMayor);
    }

    // Estrategia errónea
    public void ejercicio3(){
        int [] arrayNumeros = new int[10];
        Random random = new Random();

        int numeroMenor = 100;
        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(100);
            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <10 ; i++) {

            if (numeroMenor < arrayNumeros[i] ){
                numeroMenor = numeroMenor;
            }
            else {
                numeroMenor = arrayNumeros[i] ;
            }



        }
        System.out.println("el numero menor es : " + numeroMenor);
    }



    public void ejercicio4(){
        int [] arrayNumeros = new int[10];
        Random random = new Random();

        int sumaArray = 0;
        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(10);

            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <10 ; i++) {

            //sumaArray += arrayNumeros[i]
            sumaArray = sumaArray + arrayNumeros[i];

        }
        System.out.println("la suma es  : " + sumaArray);
    }

    public void ejercicio5(){
        float [] arrayNumeros = new float[10];
        Random random = new Random();

        float sumaArray = 0;
        float promedio;
        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextFloat(10);

            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <10 ; i++) {

            sumaArray = sumaArray + arrayNumeros[i];

        }

        // Podías haber reutilizado el método anterior para
        // hallar la suma de los elementos almacenados en el array.
        promedio = sumaArray/10;
        System.out.println("el promedio es : " + promedio);
    }

    public void ejercicio6(int numero){
        int [] arrayNumeros = new int[10];
        Random random = new Random();

        int contador = 0;
        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(10);
            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <10 ; i++) {

            if (numero == arrayNumeros[i] ){
                contador++;
            }


        }
        System.out.println("el numero aparece  " + contador);
    }


    public void ejercicio7(){
        int [] arrayNumeros = new int[10];
        Random random = new Random();


        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(10);

        }
        System.out.println("array original " + Arrays.toString(arrayNumeros));
        invertirArray(arrayNumeros);
        System.out.println("array invertido " + Arrays.toString(arrayNumeros));

    }

    // Usa el camelCase para nombrar a las variables / los objetos.
    public static void invertirArray(int[] arrayopuesto) {
        int longitud = arrayopuesto.length;
        for (int i = 0; i < longitud / 2; i++) {
            int temp = arrayopuesto[i];
            arrayopuesto[i] = arrayopuesto[longitud - 1 - i];
            arrayopuesto[longitud - 1 - i] = temp;
        }
    }

    public void ejercicio8(){
        int [] arrayNumeros = new int[10];
        int [] arrayNumeros2 = new int[10];
        Random random = new Random();


        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(10);
            arrayNumeros2[i] = random.nextInt(10);

        }
        System.out.println("array 1 " + Arrays.toString(arrayNumeros));
        System.out.println("array 2 " + Arrays.toString(arrayNumeros2));

        int contador= 0;
        // Debería salir del bucle cuando detecte la primera diferencia.
        for (int i = 0; i <10 ; i++) {

            if (arrayNumeros[i] == arrayNumeros2[i]){
                contador++;
            }


        }

        if (contador == 10)
            System.out.println("los arrays son iguales");

        else
            System.out.println("los arrays son distintos");


    }


    public void ejercicio9(){
        int [] arrayNumeros = new int[10];
        Random random = new Random();


        for (int i = 0; i <10 ; i++) {
            arrayNumeros[i] = random.nextInt(10);
            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println(" \n los numeros pares son:");

        for (int i = 0; i <10 ; i++) {
            // Aprovecha estos ejercicios para trabajar con booleanos.
            if ( arrayNumeros[i]%2 ==0 ){
                System.out.print(arrayNumeros[i] + " ");
            }


        }

    }


}
