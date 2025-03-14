package estructurasdatos;

import input.Input;
import poo.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class EstructuraDeDatos {
  private static List<Integer> listaNumeros = new ArrayList();
  private static HashMap<Integer,Persona> listaNombres = new HashMap<Integer, Persona>();
    private static  Random random = new Random();
    private static Persona persona;
    private static Input input = new Input();


    public static void main(String[] args) {

        agregarDatos();
        mostrarDatos();
        buscarDatos();
        eliminarDatos();
    }

    private static void agregarDatosHashmap(){
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese nombre de persona " + i);
            String nombre = input.getString();
            System.out.println("ingrese edad dela persona " + i);
            int edad = input.getInt();

            listaNombres.put(i+1,new Persona(nombre,edad)) ;
        }
    }

    private static void mostrarDatosHashmap(){

            System.out.println(listaNombres);

    }



    private static void agregarDatos(){
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(random.nextInt(10)) ;
        }
    }

    private static void mostrarDatos(){
        System.out.println(listaNumeros);
    }

    private static void buscarDatos(){
        System.out.println("ingrese valor a buscar");
        int datoBuscar = input.getInt();
        boolean datoEncontrado = false;
        int numIndex = 0;

        for (int i = 0; !datoEncontrado && i <10; i++) {

            if (listaNumeros.get(i) == datoBuscar){
                datoEncontrado= true;
                numIndex = i;

            }
        }

        if (datoEncontrado){
            System.out.println("el dato ha sido encontrado " +listaNumeros.get(numIndex));
        }
        else {
            System.out.println("el dato a buscar no se ha encontrado");
        }

    }

    private static void eliminarDatos(){
        System.out.println("ingrese valor a eliminar");
        int datoEliminar = input.getInt();
        boolean datoEncontrado = false;
        int numIndex = 0;

        for (int i = 0; !datoEncontrado && i <10; i++) {

            if (listaNumeros.get(i) == datoEliminar){
                datoEncontrado= true;
                numIndex = i;

            }
        }

        if (datoEncontrado){
            listaNumeros.remove(numIndex);
            System.out.println("el dato ha sido eliminado ");
            System.out.println(listaNumeros);
        }
        else {
            System.out.println("el dato a eliminar no se ha encontrado");
        }

    }




}
