package com.company.modelos;

public class Jugador {
    String nombre;
    Long identificacion;
    Integer puntaje;

    public Jugador(String nombre, Long identificacion, Integer puntaje) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
}
