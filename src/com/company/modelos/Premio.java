package com.company.modelos;

public class Premio {
    private int puntaje;
    private String descripcion;

    public Premio(Integer puntaje, String descripcion) {
        this.puntaje = puntaje;
        this.descripcion = descripcion;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
