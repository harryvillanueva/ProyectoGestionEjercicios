package output;

public class Output {

    public  void mostrarMenuPrincipal(){
        System.out.println("""
                1.Ejercicios Basicos
                2.Ejercicios Condicionales y Bucles
                3.Ejercicios Arrays
                4.Ejercicios Strings
                5.Juego Ahorcado
                """);
    }
    public void mostrarMenuConceptosBasicos(){
        System.out.println("""
                1. area del rectangulo
                2. Conversion de Gardos
                3. area y circunferencia de un circulo
                4. Mostrar numero del 1 al 10 ciclo for
                5. Mostrar numero del 1 al 10 ciclo while
                6. determinar si numero es par o impar
                8. promedio de tres numeros ingresados por el usuario
                """);
    }
    public void mostrarMenuBucles(){
        System.out.println("""
                1.	Determina si un número es positivo, negativo o cero.
                2.	Muestra los números impares del 1 al 50
                3.  Escribe un programa que determine si un número es primo
                4.  Calcula la suma de los primeros 100 números naturales
                5.	Pide un número al usuario y muestra su tabla de multiplicar
                6.  Imprime los primeros 10 números de la serie de Fibonacci.
                7.  Calcula el factorial de un número usando un bucle for.
                8.	Verifica si un número es un palíndromo.
                9.  Escribe un programa que cuente los dígitos de un número
                """);
    }



    public void mostrarMenuArrays(){
        System.out.println("""
                1.	Crea un array de 10 números enteros y muestra su contenido.
                2.	Encuentra el número más grande en un array.
                3.  Encuentra el número más pequeño en un array.
                4.  Calcula la suma de los elementos de un array.
                5.	Calcula el promedio de los valores en un array.
                6.  Cuenta cuántas veces aparece un número en un array.
                7.  Invierte el contenido de un array.
                8.	Compara dos arrays para determinar si son iguales.
                9.  Muestra los elementos pares de un array.
                """);
    }

    public void mostrarMenuStrings(){
        System.out.println("""
                1.	Cuenta cuántas vocales hay en una cadena de texto.
                2.	Invierte una cadena sin usar funciones predefinidas.
                3.  Verifica si una palabra es un palíndromo.
                4.  Reemplaza todas las vocales de una cadena con un asterisco (*).
                5.	Lista, de manera vertical, las palabras de una frase ingresada por el usuario.
                6.  Cuenta cuántas veces aparece una palabra en una frase.
                7.  Extrae los primeros 5 caracteres de una cadena.
                8.	Convierte una cadena a mayúsculas sin usar .toUpperCase().
                9.  Concatena dos cadenas sin usar .concat().
                10. Elimina los espacios en blanco de una cadena.
                """);
    }
}
