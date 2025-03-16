package estructurasdatos;

import input.Input;
import poo.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class EstructuraDeDatos {
  private static final List<Integer> listaNumeros = new ArrayList<>();
  private static final HashMap<Integer,Persona> listaNombres = new HashMap<Integer, Persona>();
    private static final Random random = new Random();
    private static Persona persona; // No se usa
    private static final Input input = new Input();

    /* Para inicializar las propiedades de clase:
    static {
        listaNumeros = new ArrayList();
        ...
    }
     */

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



    // ✅ Parametriza el número de valores.
    private static void agregarDatos(){
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(random.nextInt(10)) ;
        }
    }

    // Usa el Output :)
    private static void mostrarDatos(){
        System.out.println(listaNumeros);
    }

    private static void buscarDatos(){
        System.out.println("ingrese valor a buscar");
        int datoBuscar = input.getInt();
        boolean datoEncontrado = false;
        int numIndex = 0; // mezclas el inglés con el español

        // ¿y si el número de elementos de la lista 'listaNumeros' cambia?
        // Más que usar la i, usa el numIndex :)
        for (int i = 0; !datoEncontrado && i <10; i++) {

            // Alternativa: datoEncontrado = (<condición del if>);
            if (listaNumeros.get(i) == datoBuscar){
                datoEncontrado= true;
                numIndex = i; // En vez de guardar la posición...

            }
        }

        if (datoEncontrado){
            // ...mejor guardar el valor y mostrarlo directamente sin hacer uso del get.
            System.out.println("el dato ha sido encontrado " +listaNumeros.get(numIndex));
        }
        else {
            System.out.println("el dato a buscar no se ha encontrado");
        }

    }

    private static void eliminarDatos(){
        System.out.println("ingrese valor a eliminar");
        // Repites estas 12 líneas en 3 métodos: ¿podrías mejorarlo?
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
