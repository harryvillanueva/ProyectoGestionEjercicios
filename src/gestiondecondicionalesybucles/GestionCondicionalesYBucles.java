package gestiondecondicionalesybucles;

public class GestionCondicionalesYBucles {

    public boolean numeroPositivo(int numero){

        return (numero%2 ==0)? true : false;

    }

    public void numerosImpares(){
        for (int i = 1 ; i <50 ; i+=2){
            System.out.print(" " + i);
        }
    }

    public boolean numeroPrimo(int numero){

        boolean activo = true;
        for (int i = 2; i< numero; i++) {

            if (numero % i ==0) {
               activo = false;
            }
            
        }
        return activo;

    }

    public int sumaNumerosNaturales(){
        int suma = 0;
        for (int i = 1 ; i <=100 ; i++){
            suma = suma + i;
        }

        return suma;
    }

    public void tablaMultiplicar(int numero){
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x "+ i + " = "+ numero*i);
        }
    }

    public int serieFibonacci(){
        int suma = 0;
        int a =1 , b=1;
        for (int i = 1; i <= 10; i++) {

            suma = suma + a;
            int temp = a+b;
            a = b;
            b = temp;
        }
        return suma;
    }

    public long factorial(int numero){

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {

            factorial = factorial * i;
        }
        return factorial;
    }


    public boolean esPalindromo(int numero){

        int original = numero, inverso = 0;

        for (int i = numero; i >0; i/=10) {

            int digito = i % 10;
            inverso = inverso * 10 + digito;

        }
        return original == inverso;
    }

    public int contarDigitos(int numero){

       int contador = 0;

        for (int i = numero; i >0; i/=10) {

            contador++;
        }
        return contador;
    }
}
