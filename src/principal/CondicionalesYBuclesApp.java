package principal;

import aorcado.Ahorcado;
import gestionconceptosbasicos.GestionConceptosBasicos;
import gestiondearrays.GestionDeArrays;
import gestiondecondicionalesybucles.GestionCondicionalesYBucles;
import gestiondestrings.GestionDeStrings;
import input.Input;
import output.Output;

public class CondicionalesYBuclesApp {

    private static Output output;
    private static Input input;
    private static int opcionMenu;

    public static void main(String[] args) {

        output = new Output();
        input = new Input();


        output.mostrarMenuPrincipal();
        opcionMenu = input.getInt();
        programaPrincipal();

    }


    private static void mostrarMenuBucles(){
        output.mostrarMenuBucles();
    }
    private static void mostrarMenuConceptosBasicos(){
        output.mostrarMenuConceptosBasicos();
    }
    private static void mostrarMenuArrays(){
        output.mostrarMenuArrays();
    }
    private static void mostrarMenuStrings(){
        output.mostrarMenuStrings();
    }

    private static void programaPrincipal(){
        switch (opcionMenu){
            case 1 ->{
                mostrarMenuConceptosBasicos();
                System.out.println("ingrese opcion");
                int opcion = input.getInt();
                ejecutarProgramaConceptosBasicos(opcion);
            }
            case 2 ->{
                mostrarMenuBucles();
                System.out.println("ingrese opcion");
                int opcion = input.getInt();
                ejecutarProgramaBucles(opcion);
            }
            case 3 ->{
                mostrarMenuArrays();
                System.out.println("ingrese opcion");
                int opcion = input.getInt();
                ejecutarProgramaArrays(opcion);
            }
            case 4 ->{
                mostrarMenuStrings();
                System.out.println("ingrese opcion");
                int opcion = input.getInt();
                ejecutarProgramaStrings(opcion);
            }
            case 5 ->{
                Ahorcado.jugar();


            }
        }
    }

    private static void ejecutarProgramaConceptosBasicos(int opcion) {
        GestionConceptosBasicos gConceptos = new GestionConceptosBasicos();
        switch (opcion) {

            case 1 -> {

                System.out.println("ingrese base");
                int base = input.getInt();
                System.out.println("ingrese altura");
                int altura = input.getInt();
                int resultado = gConceptos.areaRectangulo(base, altura);

                System.out.println("el area del rectangulo es :  " + resultado);

            }

            case 2 -> {

                System.out.println("ingrese grados celcios");
                int grados = input.getInt();

                int resultado = gConceptos.convertirGrados(grados);

                System.out.println("grados Celcios :  " + grados + " es igual a " + resultado + " grados Fahrenheit ");

            }

            case 3 -> {

                System.out.println("ingrese radio del circulo");
                int radio = input.getInt();
                double areaCirculo = gConceptos.areaCirculo(radio);
                double circunferenciaCirculo = gConceptos.circunferenciaCirculo(radio);

                System.out.println("el area del circulo es : " + areaCirculo);
                System.out.println("la circunferencia del circulo es : " + circunferenciaCirculo);

            }

            case 4 -> {

                for (int i = 1; i < 11; i++) {

                    System.out.print(" " + i);
                }

            }

            case 5 -> {

                int i = 1;
                while (i < 11) {
                    System.out.print(" " + i);
                    i++;
                }
            }

            case 6 -> {
                System.out.println("ingrese numero a validar si es par o impar");
                int numero = input.getInt();
                boolean esPar = gConceptos.esPar(numero);

                if (esPar)
                    System.out.println("el numero " + numero + " es par");
                else
                    System.out.println("el numero " + numero + " es impar");

            }

            case 7 -> {
                System.out.println("ingrese numero 1");
                int num1 = input.getInt();
                System.out.println("ingrese numero 2");
                int num2 = input.getInt();
                System.out.println("ingrese numero 3");
                int num3 = input.getInt();
                int promedio = gConceptos.promedioTresNumeros(num1,num2,num3);

                System.out.println("el promedio de los tres numeros es: " + promedio);



            }


        }

    }

    private static void ejecutarProgramaBucles(int opcion) {
        GestionCondicionalesYBucles gCondicionales = new GestionCondicionalesYBucles();
        switch (opcion){
            case 1 ->{
                System.out.println("ingrese numero");
                int numero = input.getInt();

                if (numero != 0){
                    if (gCondicionales.numeroPositivo(numero))
                        System.out.println("el numero es positivo");
                    else
                        System.out.println("el numero es negativo");
                }
                else
                    System.out.println("el numero es 0");
            }
            case 2 -> gCondicionales.numerosImpares();

            case 3 ->{
                System.out.println("ingrese numero");
                int numero = input.getInt();
                boolean  esPrimo = gCondicionales.numeroPrimo(numero);

                if (esPrimo)
                    System.out.println("el numero es primo");
                else
                    System.out.println("el numero no es primo");
            }

            case 4 -> System.out.println(gCondicionales.sumaNumerosNaturales());

            case 5 -> {
                System.out.println("ingrese numero");
                int numero = input.getInt();
                gCondicionales.tablaMultiplicar(numero);
            }

            case 6 -> {
                System.out.println(gCondicionales.serieFibonacci());

            }

            case 7 -> {
                System.out.println("ingrese numero");
                int numero = input.getInt();
                System.out.println(gCondicionales.factorial(numero));

            }

            case 8 -> {
                System.out.println("ingrese numero");
                int numero = input.getInt();
                boolean esPalindromo = gCondicionales.esPalindromo(numero);
                if (esPalindromo)
                    System.out.println("el numero " + numero + " es palindromo " );
                else
                    System.out.println("el numero " + numero + " no es palindromo ");

            }

            case 9 -> {
                System.out.println("ingrese numero");
                int numero = input.getInt();
                System.out.println("la cantidiad de digitos del numero es : " + gCondicionales.contarDigitos(numero));


            }
        }
    }

    private static void ejecutarProgramaArrays(int opcion) {
        GestionDeArrays gArrays = new GestionDeArrays();
        switch (opcion){
            case 1 ->{
                gArrays.ejercicio1();
            }
            case 2 ->{
                gArrays.ejercicio2();
            }
            case 3 ->{
                gArrays.ejercicio3();
            }
            case 4 ->{
                gArrays.ejercicio4();
            }
            case 5 ->{
                gArrays.ejercicio5();
            }

            case 6 ->{
                System.out.println("ingrese numero del 1 al 10 a validar cuantas veces aparece ");
                int numero = input.getInt();
                gArrays.ejercicio6(numero);
            }

            case 7 ->{

                gArrays.ejercicio7();
            }
            case 8 ->{

                gArrays.ejercicio8();
            }
            case 9 ->{

                gArrays.ejercicio9();
            }

        }
    }

    private static void ejecutarProgramaStrings(int opcion) {
        GestionDeStrings gStrings = new GestionDeStrings();
        switch (opcion){
            case 1 ->{

                System.out.println("ingrese una palabra o frase");
                String palabra = input.getString();
                System.out.println("la cantidad de vocales son " + gStrings.ejercicio1(palabra));
            }

            case 2 ->{

                System.out.println("ingrese una palabra o frase");
                String palabra = input.getString();
                gStrings.ejercicio2(palabra);
            }

            case 3 ->{

                System.out.println("ingrese una palabra o frase");
                String palabra = input.getString();
                boolean esPalindromo = gStrings.ejercicio3(palabra);

                if (esPalindromo)
                    System.out.println("la palabra "+ palabra + " es palindromo");
                else
                    System.out.println("la palabra "+ palabra + " no es palindromo");
            }

            case 4 ->{

                System.out.println("ingrese una palabra o frase");
                String palabra = input.getString();
                gStrings.ejercicio4(palabra);
            }

            case 5 ->{

                System.out.println("ingrese una palabra o frase");
                String palabra = input.getString();
                gStrings.ejercicio5(palabra);
            }

            case 6 ->{

                System.out.println("ingrese una palabra o frase");
                String frase = input.getString();
                System.out.println("ingrese una palabra a buscar");
                String palabra = input.getString();
                System.out.println("la laplabra " + palabra + " se repite " + gStrings.ejercicio6(frase,palabra) + " veces ");;
            }

            case 7 ->{


                System.out.println("ingrese una palabra ");
                String palabra = input.getString();
                System.out.println("las primeras 5 letras son: " + gStrings.ejercicio7(palabra));
            }

            case 8 ->{


                System.out.println("ingrese una palabra ");
                String palabra = input.getString();
                System.out.println(gStrings.ejercicio8(palabra));
            }

            case 9 ->{


                System.out.println("ingrese una palabra ");
                String palabra = input.getString();
                System.out.println("ingrese una palabra ");
                String palabra2 = input.getString();
                System.out.println(gStrings.ejercicio9(palabra,palabra2));
            }

            case 10 ->{


                System.out.println("ingrese una  frase");
                String frase = input.getString();
                System.out.println(gStrings.ejercicio10(frase));
            }


        }
    }
}
