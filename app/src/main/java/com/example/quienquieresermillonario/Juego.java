package com.example.quienquieresermillonario;

import java.util.ArrayList;

public class Juego {

    private listaPreguntas listaP;

    public Juego() {

        this.listaP = new listaPreguntas();

    }

    public ArrayList<Pregunta> nivel1 (){

        ArrayList<Pregunta> nivel1 = new ArrayList<>();

        for(int i=0; i<listaP.getPreguntas().size(); i++){

            if(listaP.getPreguntas().get(i).getNivel() == 1){

                nivel1.add(listaP.getPreguntas().get(i));

            }
        }

        return nivel1;

    }
}
