package com.example.gato;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    int[] player1 = new int[9];
    int[] player2 = new int[9];
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
    int turno = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);

        img1.setOnClickListener(v -> {
            if(turno == 0 && c1 == 0){
                img1.setImageResource(R.drawable.circulo);
                player1[0] = 1;
                turno = 1;
                c1 = 1;
            }else if(turno == 1 && c1 == 0){
                img1.setImageResource(R.drawable.cruz);
                player2[0] = 1;
                turno = 0;
                c1 = 1;
            } else if (c1 == 1) {
                if (player1[0] == 1){
                    img1.setImageResource(R.drawable.circulo);
                }else{
                    img1.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img2.setOnClickListener(v -> {
            if(turno == 0 && c2 == 0){
                img2.setImageResource(R.drawable.circulo);
                player1[1] = 1;
                turno = 1;
                c2 = 1;
            }else if(turno == 1 && c2 == 0){
                img2.setImageResource(R.drawable.cruz);
                player2[1] = 1;
                turno = 0;
                c2 = 1;
            } else if (c2 == 1) {
                if (player1[1] == 1){
                    img2.setImageResource(R.drawable.circulo);
                }else{
                    img2.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img3.setOnClickListener(v -> {
            if(turno == 0 && c3 == 0){
                img3.setImageResource(R.drawable.circulo);
                player1[2] = 1;
                turno = 1;
                c3 = 1;
            }else if(turno == 1 && c3 == 0){
                img3.setImageResource(R.drawable.cruz);
                player2[2] = 1;
                turno = 0;
                c3 = 1;
            } else if (c3 == 1) {
                if (player1[2] == 1){
                    img3.setImageResource(R.drawable.circulo);
                }else{
                    img3.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img4.setOnClickListener(v -> {
            if(turno == 0 && c4 == 0){
                img4.setImageResource(R.drawable.circulo);
                player1[3] = 1;
                turno = 1;
                c4 = 1;
            }else if(turno == 1 && c4 == 0){
                img4.setImageResource(R.drawable.cruz);
                player2[3] = 1;
                turno = 0;
                c2 = 1;
            } else if (c4 == 1) {
                if (player1[3] == 1) {
                    img4.setImageResource(R.drawable.circulo);
                } else {
                    img4.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img5.setOnClickListener(v -> {
            if(turno == 0 && c5 == 0){
                img5.setImageResource(R.drawable.circulo);
                player1[4] = 1;
                turno = 1;
                c5 = 1;
            }else if(turno == 1 && c5 == 0){
                img5.setImageResource(R.drawable.cruz);
                player2[4] = 1;
                turno = 0;
                c5 = 1;
            } else if (c5 == 1) {
                if (player1[4] == 1) {
                    img5.setImageResource(R.drawable.circulo);
                } else {
                    img5.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img6.setOnClickListener(v -> {
            if(turno == 0 && c6 == 0){
                img6.setImageResource(R.drawable.circulo);
                player1[5] = 1;
                turno = 1;
                c6 = 1;
            }else if(turno == 1 && c6 == 0){
                img6.setImageResource(R.drawable.cruz);
                player2[5] = 1;
                turno = 0;
                c6 = 1;
            } else if (c6 == 1) {
                if (player1[5] == 1) {
                    img6.setImageResource(R.drawable.circulo);
                } else {
                    img6.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img7.setOnClickListener(v -> {
            if(turno == 0 && c7 == 0){
                img7.setImageResource(R.drawable.circulo);
                player1[6] = 1;
                turno = 1;
                c7 = 1;
            }else if(turno == 1 && c7 == 0){
                img7.setImageResource(R.drawable.cruz);
                player2[6] = 1;
                turno = 0;
                c7 = 1;
            } else if (c7 == 1) {
                if (player1[6] == 1) {
                    img7.setImageResource(R.drawable.circulo);
                } else {
                    img7.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img8.setOnClickListener(v -> {
            if(turno == 0 && c8 == 0){
                img8.setImageResource(R.drawable.circulo);
                player1[7] = 1;
                turno = 1;
                c8 = 1;
            }else if(turno == 1 && c8 == 0){
                img8.setImageResource(R.drawable.cruz);
                player2[7] = 1;
                turno = 0;
                c8 = 1;
            } else if (c8 == 1) {
                if (player1[7] == 1) {
                    img8.setImageResource(R.drawable.circulo);
                } else {
                    img8.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });
        img9.setOnClickListener(v -> {
            if(turno == 0 && c9 == 0){
                img9.setImageResource(R.drawable.circulo);
                player1[8] = 1;
                turno = 1;
                c9 =01;
            }else if(turno == 1 && c9 == 0){
                img9.setImageResource(R.drawable.cruz);
                player2[8] = 1;
                turno = 0;
                c9 = 1;
            } else if (c9 == 1) {
                if (player1[8] == 1) {
                    img9.setImageResource(R.drawable.circulo);
                } else {
                    img9.setImageResource(R.drawable.cruz);
                }
            }
            imprimeGanador();
        });

    }

    void imprimeGanador(){
        if(     (player1[0] == 1 && player1[1] == 1 && player1[2] == 1)
                || (player1[3] == 1 && player1[4] == 1 && player1[5] == 1)
                || (player1[6] == 1 && player1[7] == 1 && player1[8] == 1)
                || (player1[0] == 1 && player1[3] == 1 && player1[6] == 1)
                || (player1[1] == 1 && player1[4] == 1 && player1[7] == 1)
                || (player1[2] == 1 && player1[5] == 1 && player1[8] == 1)
                || (player1[0] == 1 && player1[4] == 1 && player1[8] == 1)
                || (player1[2] == 1 && player1[4] == 1 && player1[6] == 1)){

            Toast.makeText(this,"El ganador es: Circulo", Toast.LENGTH_LONG).show();
        } else if ((player2[0] == 1 && player2[1] == 1 && player2[2] == 1)
                || (player2[3] == 1 && player2[4] == 1 && player2[5] == 1)
                || (player2[6] == 1 && player2[7] == 1 && player2[8] == 1)
                || (player2[0] == 1 && player2[3] == 1 && player2[6] == 1)
                || (player2[1] == 1 && player2[4] == 1 && player2[7] == 1)
                || (player2[2] == 1 && player2[5] == 1 && player2[8] == 1)
                || (player2[0] == 1 && player2[4] == 1 && player2[8] == 1)
                || (player2[2] == 1 && player2[4] == 1 && player2[6] == 1)) {

            Toast.makeText(this,"El ganador es: Cruz", Toast.LENGTH_LONG).show();
        }
    }
}