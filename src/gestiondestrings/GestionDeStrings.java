package gestiondestrings;



public class GestionDeStrings {

    public int ejercicio1(String palabra){

        int longitud = palabra.length();
        palabra = palabra.toLowerCase();
        int contador = 0;

        for (int i = 0; i < longitud; i++) {
            char caracter = palabra.charAt(i);
            if (caracter == 'a' || caracter == 'e'|| caracter == 'i'|| caracter == 'o'|| caracter == 'u' ){
                contador++;
            }

        }

        return contador;
    }

    public void ejercicio2(String palabra){


        char[] listaCaracteres = palabra.toCharArray();
        int longitud = listaCaracteres.length;

        System.out.println("array original " + new String(listaCaracteres));

        for (int i = 0; i < longitud/2; i++) {

            char temp = listaCaracteres[i];
            listaCaracteres[i] = listaCaracteres[longitud-1-i];
            listaCaracteres[longitud-1-i] = temp;

        }
        System.out.println("array invertido " + new String(listaCaracteres));


    }

    public boolean ejercicio3(String palabra){


        char[] caracteres = palabra.toCharArray();
        int longitud = caracteres.length;



        boolean esPalindromo = false;
        for (int i = 0; i < longitud/2; i++) {

            if (caracteres[i] == caracteres[longitud-1-i]){
                esPalindromo = true;
            }else {
                esPalindromo = false;
            }



        }

        return esPalindromo;


    }

    public void ejercicio4(String palabra){


        char[] listaCaracteres = palabra.toCharArray();
        int longitud = listaCaracteres.length;

        System.out.println("palabra original " + new String(listaCaracteres));

        for (int i = 0; i < longitud; i++) {

            if (listaCaracteres[i] == 'a' || listaCaracteres[i] == 'e'|| listaCaracteres[i] == 'i'|| listaCaracteres[i] == 'o'|| listaCaracteres[i] == 'u' ){
                listaCaracteres[i] = '*';
            }


        }
        System.out.println("palabra invertida " + new String(listaCaracteres));


    }

    public void ejercicio5(String palabra){


        char[] listaCaracteres = palabra.toCharArray();
        int longitud = listaCaracteres.length;

        System.out.println("palabra horizontal " + new String(listaCaracteres));

        System.out.println("palabra vertical");

        for (int i = 0; i < longitud; i++) {

            System.out.println(listaCaracteres[i]);


        }



    }




}
