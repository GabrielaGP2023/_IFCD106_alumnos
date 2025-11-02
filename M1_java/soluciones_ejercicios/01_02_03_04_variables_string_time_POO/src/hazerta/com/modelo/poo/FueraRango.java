package com.softtek.modelo;

public class FueraRango extends Exception{
    public FueraRango( int indice) {
        super("el indice " + indice + " fuera de rango");
    }
}
