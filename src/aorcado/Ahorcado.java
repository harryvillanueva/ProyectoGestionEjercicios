package aorcado;
import java.util.Scanner;
import java.util.Random;

public class Ahorcado {

    private static final String[] PALABRAS = {"java", "programacion", "computadora", "algoritmo", "desarrollo"};
    private static final int INTENTOS_MAXIMOS = 7;

    public static void jugar() {
        String palabraSecreta = elegirPalabraSecreta();
        char[] palabraAdivinada = inicializarPalabraAdivinada(palabraSecreta);
        int intentosFallidos = 0;
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado && intentosFallidos < INTENTOS_MAXIMOS) {
            mostrarEstadoJuego(palabraAdivinada, intentosFallidos);
            char letra = pedirLetra(scanner);
            boolean letraAdivinada = actualizarPalabraAdivinada(palabraSecreta, palabraAdivinada, letra);

            if (!letraAdivinada) {
                intentosFallidos++;
                System.out.println("¡Letra incorrecta! Te quedan " + (INTENTOS_MAXIMOS - intentosFallidos) + " intentos.");
            }

            if (esPalabraAdivinada(palabraSecreta, palabraAdivinada)) {
                System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                juegoTerminado = true;
            } else if (intentosFallidos >= INTENTOS_MAXIMOS) {
                System.out.println("\n¡Juego terminado! Has perdido. La palabra era: " + palabraSecreta);
                juegoTerminado = true;
            }
        }

        scanner.close();
    }

    public static String elegirPalabraSecreta() {
        Random random = new Random();
        return PALABRAS[random.nextInt(PALABRAS.length)];
    }

    public static char[] inicializarPalabraAdivinada(String palabraSecreta) {
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        return palabraAdivinada;
    }

    public static void mostrarEstadoJuego(char[] palabraAdivinada, int intentosFallidos) {
        System.out.println("\nPalabra: " + String.valueOf(palabraAdivinada));
        System.out.println("Intentos fallidos: " + intentosFallidos + "/" + INTENTOS_MAXIMOS);
    }

    public static char pedirLetra(Scanner scanner) {
        System.out.print("Ingresa una letra: ");
        String entrada = scanner.nextLine().toLowerCase();
        while (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
            System.out.print("Por favor, ingresa una sola letra válida: ");
            entrada = scanner.nextLine().toLowerCase();
        }
        return entrada.charAt(0);
    }

    public static boolean actualizarPalabraAdivinada(String palabraSecreta, char[] palabraAdivinada, char letra) {
        boolean letraAdivinada = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraAdivinada[i] = letra;
                letraAdivinada = true;
            }
        }
        return letraAdivinada;
    }

    public static boolean esPalabraAdivinada(String palabraSecreta, char[] palabraAdivinada) {
        return String.valueOf(palabraAdivinada).equals(palabraSecreta);
    }
}
