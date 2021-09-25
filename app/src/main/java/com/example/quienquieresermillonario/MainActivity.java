package com.example.quienquieresermillonario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent i;
    private LinearLayout linearLayout;
    private Juego game;
    private int nivelJ = 1;
    int aux = 0;
    Button opc1,opc2,opc3,opc4;
    ImageButton reiniciar;
    TextView pregunta;
    TextView nivel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.linearLayout = findViewById(R.id.linearlayout);
        this.nivel = findViewById(R.id.nivel);
        this.game = new Juego();
        nivel.setText("Nivel 1");


      pregunta  = findViewById(R.id.pregunta);

        opc1 = findViewById(R.id.opcion1);
        opc2 = findViewById(R.id.opcion2);
        opc3 = findViewById(R.id.opcion3);
        opc4 = findViewById(R.id.opcion4);
        reiniciar = findViewById(R.id.reiniciar);

        siguientePregunta();
        opc1.setOnClickListener(this::onClick);
        opc2.setOnClickListener(this::onClick);
        opc3.setOnClickListener(this::onClick);
        opc4.setOnClickListener(this::onClick);
        reiniciar.setOnClickListener(this::onClick);




    }

    private void siguientePregunta() {



        if(aux == 5){
            aux = 0;
            nivelJ = nivelJ +1;
        }


        if(nivelJ == 1){
            pregunta.setText(game.nivel1().get(aux).getPregunta());
            opc1.setText(game.nivel1().get(aux).getOpciones()[0]);
            opc2.setText(game.nivel1().get(aux).getOpciones()[1]);
            opc3.setText(game.nivel1().get(aux).getOpciones()[2]);
            opc4.setText(game.nivel1().get(aux).getOpciones()[3]);

        }
        if(nivelJ == 2){
            pregunta.setText(game.nivel2().get(aux).getPregunta());
            opc1.setText(game.nivel2().get(aux).getOpciones()[0]);
            opc2.setText(game.nivel2().get(aux).getOpciones()[1]);
            opc3.setText(game.nivel2().get(aux).getOpciones()[2]);
            opc4.setText(game.nivel2().get(aux).getOpciones()[3]);

        }
        if(nivelJ == 3){
            pregunta.setText(game.nivel3().get(aux).getPregunta());
            opc1.setText(game.nivel3().get(aux).getOpciones()[0]);
            opc2.setText(game.nivel3().get(aux).getOpciones()[1]);
            opc3.setText(game.nivel3().get(aux).getOpciones()[2]);
            opc4.setText(game.nivel3().get(aux).getOpciones()[3]);

        }
        if(nivelJ == 4){
            pregunta.setText(game.nivel4().get(aux).getPregunta());
            opc1.setText(game.nivel4().get(aux).getOpciones()[0]);
            opc2.setText(game.nivel4().get(aux).getOpciones()[1]);
            opc3.setText(game.nivel4().get(aux).getOpciones()[2]);
            opc4.setText(game.nivel4().get(aux).getOpciones()[3]);

        }
        if(nivelJ == 5){
            pregunta.setText(game.nivel5().get(aux).getPregunta());
            opc1.setText(game.nivel5().get(aux).getOpciones()[0]);
            opc2.setText(game.nivel5().get(aux).getOpciones()[1]);
            opc3.setText(game.nivel5().get(aux).getOpciones()[2]);
            opc4.setText(game.nivel5().get(aux).getOpciones()[3]);

        }




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.opcion1:

                if(nivelJ == 1){
                    if (opc1.getText() == game.nivel1().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                    //    pregunta.setText("Perdio papi");
                        apagar(opc1.getText().toString(),game.nivel1().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 2){
                    if (opc1.getText() == game.nivel2().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc1.getText().toString(),game.nivel2().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 3){
                    if (opc1.getText() == game.nivel3().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc1.getText().toString(),game.nivel3().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 4){
                    if (opc1.getText() == game.nivel4().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc1.getText().toString(),game.nivel4().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 5){
                    if (opc1.getText() == game.nivel5().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc1.getText().toString(),game.nivel5().get(aux).getRespuesta());
                    }
                }

                break;

            case R.id.opcion2:

                if(nivelJ == 1){
                    if (opc2.getText() == game.nivel1().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc2.getText().toString(),game.nivel1().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 2){
                    if (opc2.getText() == game.nivel2().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc2.getText().toString(),game.nivel2().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 3){
                    if (opc2.getText() == game.nivel3().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc2.getText().toString(),game.nivel3().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 4){
                    if (opc2.getText() == game.nivel4().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc2.getText().toString(),game.nivel4().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 5){
                    if (opc2.getText() == game.nivel5().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc2.getText().toString(),game.nivel5().get(aux).getRespuesta());
                    }
                }

                break;

            case R.id.opcion3:

                if(nivelJ == 1){
                    if (opc3.getText() == game.nivel1().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel1().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 2){
                    if (opc3.getText() == game.nivel2().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel2().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 3){
                    if (opc3.getText() == game.nivel3().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel3().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 4){
                    if (opc3.getText() == game.nivel4().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel4().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 5){
                    if (opc3.getText() == game.nivel5().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel5().get(aux).getRespuesta());
                    }
                }

                break;

            case R.id.opcion4:

                if(nivelJ == 1){
                    if (opc4.getText() == game.nivel1().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc4.getText().toString(),game.nivel1().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 2){
                    if (opc4.getText() == game.nivel2().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel2().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 3){
                    if (opc4.getText() == game.nivel3().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel3().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 4){
                    if (opc4.getText() == game.nivel4().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel4().get(aux).getRespuesta());
                    }
                }

                if(nivelJ == 5){
                    if (opc4.getText() == game.nivel5().get(aux).getRespuesta()) {
                        aux = aux+1;
                        siguientePregunta();
                    } else {
                        apagar(opc3.getText().toString(),game.nivel5().get(aux).getRespuesta());
                    }
                }

                break;
            case R.id.reiniciar:
              //  pregunta.setText("Hijo de perra");
                reiniciar();
                break;
        }

    }

    private void reiniciar() {

        this.game = new Juego();
        nivelJ = 1;
        aux = 0;
        activarBotones();
        siguientePregunta();



    }


    private void activarBotones(){

        opc1.setEnabled(true);
        opc2.setEnabled(true);
        opc3.setEnabled(true);
        opc4.setEnabled(true);

        opc1.setBackgroundColor(Color.parseColor("#451C83"));
        opc2.setBackgroundColor(Color.parseColor("#451C83"));
        opc3.setBackgroundColor(Color.parseColor("#451C83"));
        opc4.setBackgroundColor(Color.parseColor("#451C83"));


    }


    private void apagar(String text, String respuesta) {


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