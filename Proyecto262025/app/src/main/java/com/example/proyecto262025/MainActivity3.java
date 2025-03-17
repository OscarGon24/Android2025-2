package com.example.proyecto262025;

import android.icu.math.BigDecimal;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.xml.transform.Result;

public class MainActivity3 extends AppCompatActivity {

    ICalculadoraUI calculadoraUI;
    ICalculadora calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        calculadoraUI = new CalculadoraUI(this);
        calculadora = new Calculadora();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        calculadoraUI.calculate(new CalculadoraOnResult(){
            @Override
            public void onResult(BigDecimal x, BigDecimal y, Operacion operacion) {
                calculadora
            }
        });
    }
}