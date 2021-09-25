package com.example.quienquieresermillonario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Juego game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.linearLayout = findViewById(R.id.linearlayout);
        this.game = new Juego();

        TextView pregunta = findViewById(R.id.pregunta);
        Button opc1 = findViewById(R.id.opcion1);
        Button opc2 = findViewById(R.id.opcion2);
        Button opc3 = findViewById(R.id.opcion3);
        Button opc4 = findViewById(R.id.opcion4);

        String pre = game.nivel1().get(0).getPregunta();
        String op1 = game.nivel1().get(0).getOpciones()[0];
        String op2 = game.nivel1().get(0).getOpciones()[1];
        String op3 = game.nivel1().get(0).getOpciones()[2];
        String op4 = game.nivel1().get(0).getOpciones()[3];
        opc1.setText(op1);
        opc2.setText(op2);
        opc3.setText(op3);
        opc4.setText(op4);
        pregunta.setText(pre);








    }
}