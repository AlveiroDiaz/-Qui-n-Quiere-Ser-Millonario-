package com.example.quienquieresermillonario;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout;
    private Juego game;
    private static int nivelJ = 1;
    int aux = 0;
    Button opc1,opc2,opc3,opc4;
    ImageButton reiniciar;
    ImageButton cincuenta;
    TextView pregunta;
    TextView nivel;
    TextView plata;
    int puntos = 0;
    private static listaPreguntas listaP;
     Pregunta objPre = new Pregunta();
    ArrayList<Pregunta> n1 = new ArrayList<>();
    ArrayList<Pregunta> n2 = new ArrayList<>();
    ArrayList<Pregunta> n3 = new ArrayList<>();
    ArrayList<Pregunta> n4 = new ArrayList<>();
    ArrayList<Pregunta> n5 = new ArrayList<>() ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.linearLayout = findViewById(R.id.linearlayout);
        this.nivel = findViewById(R.id.nivel);
        this.plata = findViewById(R.id.plata);
        this.cincuenta = findViewById(R.id.cincuenta);
        this.game = new Juego();
        nivel.setText("Nivel 1");


      pregunta  = findViewById(R.id.pregunta);

        opc1 = findViewById(R.id.opcion1);
        opc2 = findViewById(R.id.opcion2);
        opc3 = findViewById(R.id.opcion3);
        opc4 = findViewById(R.id.opcion4);
        reiniciar = findViewById(R.id.reiniciar);

        n1 = game.nivel1();
        n2 = game.nivel2();
        n3 = game.nivel3();
        n4 = game.nivel4();
        n5 = game.nivel5();

        siguientePregunta();

        opc1.setOnClickListener(this::onClick);
        opc2.setOnClickListener(this::onClick);
        opc3.setOnClickListener(this::onClick);
        opc4.setOnClickListener(this::onClick);
        reiniciar.setOnClickListener(this::onClick);
        cincuenta.setOnClickListener(this::onClick);

    }

    private void siguientePregunta() {

        plata.setText("$" + puntos);


        activarBotones();


        if(aux == 5){
            this.aux = 0;
            this.nivelJ = nivelJ +1;
            this.nivel.setText("NIVEL " + nivelJ);
        }


        if(this.nivelJ == 1 ){
            puntos = puntos + 200000;
            objPre = n1.get(aux);
        }
        if(nivelJ == 2){
            puntos = puntos + 1000000;
            objPre = n2.get(aux);
        }
        if(nivelJ == 3){
            puntos = puntos + 2000000;
            objPre = n3.get(aux);
        }
        if(nivelJ == 4){
            puntos = puntos + 300000;
            objPre = n4.get(aux);
        }
        if(nivelJ == 5){
            puntos = puntos + 500000;
            objPre = n5.get(aux);
        }

        List<String> lista = Arrays.asList(objPre.getOpciones());
        Collections.shuffle(lista);

        opc1.setText(lista.get(0));
        opc2.setText(lista.get(1));
        opc3.setText(lista.get(2));
        opc4.setText(lista.get(3));
        pregunta.setText(objPre.getPregunta());



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.opcion1:

                if (opc1.getText() == objPre.getRespuesta()) {
                    aux = aux+1;
                    siguientePregunta();
                } else {
                    apagar(opc1.getText().toString(),objPre.getRespuesta());
                }


                break;

            case R.id.opcion2:

                if (opc2.getText() == objPre.getRespuesta()) {
                    aux = aux+1;
                    siguientePregunta();
                } else {
                    apagar(opc1.getText().toString(),objPre.getRespuesta());
                }

                break;

            case R.id.opcion3:

                if (opc3.getText() == objPre.getRespuesta()) {
                    aux = aux+1;
                    siguientePregunta();
                } else {
                    apagar(opc1.getText().toString(),objPre.getRespuesta());
                }

                break;

            case R.id.opcion4:


                if (opc4.getText() == objPre.getRespuesta()) {
                    aux = aux+1;
                    siguientePregunta();
                } else {
                    apagar(opc1.getText().toString(),objPre.getRespuesta());
                }

                break;

            case R.id.reiniciar:
                reiniciar();
                break;

            case R.id.cincuenta:

                cincuenta();
                break;
        }

    }

    private void cincuenta() {


        if(opc1.getText() == objPre.getRespuesta()){
           opc2.setEnabled(false);
           opc3.setEnabled(false);
        }

        if(opc2.getText() ==  objPre.getRespuesta()){
            opc1.setEnabled(false);
            opc4.setEnabled(false);
        }

        if(opc3.getText() ==  objPre.getRespuesta()){
            opc1.setEnabled(false);
            opc2.setEnabled(false);
        }

        if(opc4.getText() ==  objPre.getRespuesta()){
            opc2.setEnabled(false);
            opc3.setEnabled(false);
        }

        cincuenta.setEnabled(false);
        cincuenta.setBackgroundColor(Color.parseColor("#FE1808"));


    }

    private void reiniciar() {

        n1 = game.nivel1();
        n2 = game.nivel2();
        n3 = game.nivel3();
        n4 = game.nivel4();
        n5 = game.nivel5();
        this.game = new Juego();
        puntos = 0;
        nivelJ = 1;
        nivel.setText("NIVEL " + nivelJ);
        aux = 0;

        activarBotones();
        siguientePregunta();



    }


    private void activarBotones(){

        cincuenta.setEnabled(true);
        opc1.setEnabled(true);
        opc2.setEnabled(true);
        opc3.setEnabled(true);
        opc4.setEnabled(true);
        cincuenta.setBackgroundColor(Color.parseColor("#451C83"));
        opc1.setBackgroundColor(Color.parseColor("#451C83"));
        opc2.setBackgroundColor(Color.parseColor("#451C83"));
        opc3.setBackgroundColor(Color.parseColor("#451C83"));
        opc4.setBackgroundColor(Color.parseColor("#451C83"));

    }


    private void apagar(String text, String respuesta) {

        nivel.setText("¡PERDISTE TODO!");
        plata.setText("$0");


        if(opc1.getText() == respuesta){
            opc1.setBackgroundColor(Color.parseColor("#4DAB4F"));
        }else{
            opc1.setBackgroundColor(Color.parseColor("#FE1808"));
        }

        if(opc2.getText() == respuesta){
            opc2.setBackgroundColor(Color.parseColor("#4DAB4F"));
        }else{
            opc2.setBackgroundColor(Color.parseColor("#FE1808"));
        }

        if(opc3.getText() == respuesta){
            opc3.setBackgroundColor(Color.parseColor("#4DAB4F"));
        }else{
            opc3.setBackgroundColor(Color.parseColor("#FE1808"));
        }

        if(opc4.getText() == respuesta){
            opc4.setBackgroundColor(Color.parseColor("#4DAB4F"));
        }else{
            opc4.setBackgroundColor(Color.parseColor("#FE1808"));
        }

        opc1.setEnabled(false);
        opc2.setEnabled(false);
        opc3.setEnabled(false);
        opc4.setEnabled(false);

    }

}