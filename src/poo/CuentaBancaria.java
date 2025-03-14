package poo;

public class CuentaBancaria {

    int saldo;
    int cantidad;

    public int retirarDinero(){
        return saldo -cantidad;
    }

    public int depositarDinero(){
        return saldo+cantidad;
    }
}
