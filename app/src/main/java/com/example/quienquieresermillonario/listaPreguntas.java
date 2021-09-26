package com.example.quienquieresermillonario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listaPreguntas {

    private ArrayList<Pregunta> preguntas;

    public listaPreguntas() {

        preguntas = new ArrayList<>();

        preguntas.add(new Pregunta(1,"¿Como se llama el aeropuerto de Bogota?",
                new String[]{"Rafael Nuñez", "El Eden", "El dorado", "Palo Negro"},
                "El dorado"));
        preguntas.add(new Pregunta(1,"¿Cual es el rio mas largo del mundo?",
                new String[]{"Nilo", "Amazonas", "Misisipi", "Amarillo"},
                "Amazonas"));
        preguntas.add(new Pregunta(1,"¿Cuál es el animal que más muertes provoca cada año?",
                new String[]{"Tiburon", "Serpiente", "El mosquito", "Oso"},
                "El mosquito"));
        preguntas.add(new Pregunta(1,"¿Cuál fue la primera civilización humana?",
                new String[]{"Civilizacion babilonica", "Civilizacion sumeria", "Civilizacion asiria", "Civilizacion acadia"},
                "Civilizacion sumeria"));
        preguntas.add(new Pregunta(1,"¿Cuántos corazones tiene un gusano de tierra?",
                new String[]{"1", "3", "8", "5"},
                "5"));
        preguntas.add(new Pregunta(2,"¿Quién escribió La Odisea?",
                new String[]{"Dante", "Homero", "Edipo", "Shakespeare"},
                "Homero"));
        preguntas.add(new Pregunta(2,"¿Qué cantidad de huesos en el cuerpo humano?",
                new String[]{"206", "204", "200", "215"},
                "206"));
        preguntas.add(new Pregunta(2,"¿Quién pintó “la última cena”?",
                new String[]{"Leonardo da Vinci", "Van Gogh", "Miguel Angel", "Botero"},
                "Leonardo da Vinci"));
        preguntas.add(new Pregunta(2,"¿Cuál es el océano más grande?",
                new String[]{"Oceano Pacifico", "Oceano Atlantico", "Oceano Indico", "Oceano Antartico "},
                "Oceano Pacifico"));
        preguntas.add(new Pregunta(2,"¿Quién es el padre del psicoanálisis?",
                new String[]{"Descartes", "Nietzsche", "Sigmund Freud", "Adorno"},
                "Sigmund Freud"));
       preguntas.add(new Pregunta(3,"¿En qué se especializa la cartografía?",
                new String[]{"Mapas", "Mares", "Vias", "Relieves"},
                "Mapas"));
        preguntas.add(new Pregunta(3,"¿Cómo se llama el animal más rápido del mundo?",
                new String[]{"Guepardo", "Gacela", "Puma", "Halcon peregrino"},
                "Halcon peregrino"));
        preguntas.add(new Pregunta(3,"¿Cuál es el animal que más muertes provoca cada año?",
                new String[]{"Tiburon", "Serpiente", "El mosquito", "Oso"},
                "El mosquito"));
        preguntas.add(new Pregunta(3,"¿Qué enfermedad padeció Stephen Hawking?",
                new String[]{"Cancer de huesos", "Meningitis", "Esclerosis", "poliomielitis"},
                "Esclerosis"));
        preguntas.add(new Pregunta(3,"¿Cuál fue el primer metal que empleó el hombre?",
                new String[]{"El cobre", "El oro", "El hierro", "La plata"},
                "El cobre"));
        preguntas.add(new Pregunta(4,"¿Cuando se acabo la segunda guerra industrial?",
                new String[]{"1987", "1945", "1962", "1947"},
                "1947"));
        preguntas.add(new Pregunta(4,"¿Cómo se llama la estación espacial rusa?",
                new String[]{"Tiangong", "Mir", "Skylab", "Iss"},
                "Mir"));
        preguntas.add(new Pregunta(4,"¿Cuál es el único mamífero capaz de volar?",
                new String[]{"Murcielago", "Pato", "Condor", "Aguila"},
                "Murcielago"));
        preguntas.add(new Pregunta(4,"¿Cuál es el libro sagrado del Islam?",
                new String[]{"El coran", "La tora", "Brest", "Hebraica"},
                "El coran"));
        preguntas.add(new Pregunta(4,"¿A qué país pertenece la ciudad de Varsovia?",
                new String[]{"Polonia", "Estonia", "Liberia", "Sudan"},
                "Polonia"));
        preguntas.add(new Pregunta(5,"¿Cual fue el primer pais invadido en la Segunda Guerrra Mundial?",
                new String[]{"Alemania", "Italia", "Francia", "Polonia"},
                "Polonia"));
        preguntas.add(new Pregunta(5,"¿Con que pais entro en guerra india despues de su independencia?",
                new String[]{"China", "EEUU", "Pakistan", "Kazajistan"},
                "Pakistan"));
        preguntas.add(new Pregunta(5,"¿Cuál es el metal más caro del mundo?",
                new String[]{"Rodio", "Oro", "Planino", "Plata"},
                "Rodio"));
        preguntas.add(new Pregunta(5,"¿En qué país se encuentra el estadio de Wembley?",
                new String[]{"Alemania", "EEUU", "Inglaterra", "Francia"},
                "Inglaterra"));
        preguntas.add(new Pregunta(5,"¿En que año caé el muro de Berlin?",
                new String[]{"1989", "1972", "1994", "1985"},
                "1989"));

    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }


}
