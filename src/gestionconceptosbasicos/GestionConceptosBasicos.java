package gestionconceptosbasicos;

public class GestionConceptosBasicos {

    public int areaRectangulo(int base , int altura){

        return  base*altura;
    }

    public int convertirGrados(int grados ){

        return  ((grados *9)/5)+32;
    }

    public double areaCirculo(int radio ){

        return  Math.PI * radio *radio ;
    }

    public double circunferenciaCirculo(int radio ){

        return  Math.PI * (2*radio) ;
    }


    public boolean esPar(int numero){

  // Muchas líneas en blanco
        return (numero%2 == 0);



    }
    // Cuando haya más de una variable, podría ser útil pasarle una colección
    // de datos :)
    public int promedioTresNumeros(int numero1, int numero2, int numero3){


        return (numero1+numero2+numero3)/3 ;



    }

    public boolean numeroMayorCero(int numero){
        // lo vimos en clase: return (numero > 0);
        if (numero > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
