package com.company.modelos;

import java.util.ArrayList;

public class Juego {
    private Jugador jugador;
    private Premio premio;
    private ArrayList <Ronda> rondas;

    public Juego(Jugador jugador, Premio premio, ArrayList<Ronda> rondas) {
        this.jugador = jugador;
        this.premio = premio;
        this.rondas = rondas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(ArrayList<Ronda> rondas) {
        this.rondas = rondas;
    }
}
