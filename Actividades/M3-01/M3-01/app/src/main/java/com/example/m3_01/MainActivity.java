package com.example.m3_01;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Calculadora calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        calculadora = new Calculadora();

        Log.d("MainActivity","Resultado de suma" + calculadora.sumar(10,5));
        Log.d("MainActivity","Resultado de resta" + calculadora.restar(10,5));
        Log.d("MainActivity","Resultado de multiplicacion" + calculadora.mult(10,5));
        Log.d("MainActivity","Resultado de division" + calculadora.div(10,5));
        Log.d("MainActivity","Resultado de division" + calculadora.div(10,0));

    }
}