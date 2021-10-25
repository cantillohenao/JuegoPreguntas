package com.company.modelos;

import java.util.ArrayList;

public class Opcion {
    private int numero;
    private String detalle;

    public Opcion() {
    }

    public Opcion(int numero, String detalle) {
        this.numero = numero;
        this.detalle = detalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Opcion{" +
                "numero=" + numero +
                ", detalle='" + detalle + '\'' +
                '}';
    }
}
