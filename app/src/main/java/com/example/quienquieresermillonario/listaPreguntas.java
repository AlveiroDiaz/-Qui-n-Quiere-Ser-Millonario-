package com.example.quienquieresermillonario;

import java.util.ArrayList;

public class listaPreguntas {

    private ArrayList<Pregunta> preguntas;

    public listaPreguntas() {

        preguntas = new ArrayList<>();

        preguntas.add(new Pregunta(1,"¿Como se llama el aeropuerto de Bogota?",
                new String[]{"Rafael Nuñez", "Rafael Nuñez", "El dorado", "Palo Negro"},
                "El dorado"));

        preguntas.add(new Pregunta(2,"¿Cual es el rio mas largo del mundo?",
                new String[]{"Nilo", "Amazonas", "Misisipi", "Amarillo"},
                "Amazonas"));
        preguntas.add(new Pregunta(3,"¿Cuál es el animal que más muertes provoca cada año?",
                new String[]{"Tiburon", "Serpiente", "El mosquito", "Oso"},
                "El mosquito"));
        preguntas.add(new Pregunta(4,"¿Cuál fue la primera civilización humana?",
                new String[]{"Civilizacion babilonica", "Civilizacion sumeria", "Civilizacion asiria", "Civilizacion acadia"},
                "Civilizacion sumeria"));
        preguntas.add(new Pregunta(5,"¿Cuántos corazones tiene un gusano de tierra?",
                new String[]{"1", "3", "8", "5"},
                "5"));
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void preguntar(){




    }
}
