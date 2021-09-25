package com.example.quienquieresermillonario;

import java.util.ArrayList;

public class Pregunta {

    private int nivel;
    private String pregunta;
    private String[] opciones;
    private String respuesta;




    public Pregunta(int nivel, String pregunta, String[] opciones, String respuesta) {
        this.nivel = nivel;
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuesta = respuesta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
