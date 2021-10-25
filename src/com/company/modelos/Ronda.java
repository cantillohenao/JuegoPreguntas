package com.company.modelos;

public class Ronda {
    private int puntaje;
    private Premio premio;
    private Pregunta preguntas;
    private Categoria categoria;

    public Ronda(Integer puntaje, Premio premio, Pregunta preguntas, Categoria categoria) {
        this.puntaje = puntaje;
        this.premio = premio;
        this.preguntas = preguntas;
        this.categoria = categoria;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Pregunta getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Pregunta preguntas) {
        this.preguntas = preguntas;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
