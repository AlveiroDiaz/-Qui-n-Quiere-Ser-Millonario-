package com.example.quienquieresermillonario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

       Collections.shuffle(nivel1);

        return   nivel1;

    }

    public ArrayList<Pregunta> nivel2 (){

        ArrayList<Pregunta> nivel1 = new ArrayList<>();

        for(int i=0; i<listaP.getPreguntas().size(); i++){

            if(listaP.getPreguntas().get(i).getNivel() == 2){

                nivel1.add(listaP.getPreguntas().get(i));

            }
        }

        Collections.shuffle(nivel1);

        return nivel1;

    }
    public ArrayList<Pregunta> nivel3 (){

        ArrayList<Pregunta> nivel1 = new ArrayList<>();

        for(int i=0; i<listaP.getPreguntas().size(); i++){

            if(listaP.getPreguntas().get(i).getNivel() == 3){

                nivel1.add(listaP.getPreguntas().get(i));

            }
        }

        Collections.shuffle(nivel1);

        return nivel1;

    }
    public ArrayList<Pregunta> nivel4 (){

        ArrayList<Pregunta> nivel1 = new ArrayList<>();

        for(int i=0; i<listaP.getPreguntas().size(); i++){

            if(listaP.getPreguntas().get(i).getNivel() == 4){

                nivel1.add(listaP.getPreguntas().get(i));

            }
        }

        Collections.shuffle(nivel1);

        return nivel1;

    }
    public ArrayList<Pregunta> nivel5 (){

        ArrayList<Pregunta> nivel1 = new ArrayList<>();

        for(int i=0; i<listaP.getPreguntas().size(); i++){

            if(listaP.getPreguntas().get(i).getNivel() == 5){

                nivel1.add(listaP.getPreguntas().get(i));

            }
        }

        Collections.shuffle(nivel1);

        return nivel1;

    }


}
