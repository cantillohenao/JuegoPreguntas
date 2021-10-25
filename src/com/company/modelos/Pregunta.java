package com.company.modelos;

import java.util.ArrayList;

public class Pregunta {
    private ArrayList<Opcion> opciones;
    private int respuestaCorrecta;
    private String descripcion;

    public Pregunta(ArrayList<Opcion> opciones, String descripcion, int respuestaCorrecta) {
        this.opciones = opciones;
        this.descripcion = descripcion;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Pregunta() {
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
