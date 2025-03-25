package com.example.infladobotones;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnIzq, btnDer;
    LinearLayout root, root2;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        root = findViewById(R.id.lytMain);
        root2 = findViewById(R.id.lytMain2);

        btnIzq = findViewById(R.id.btnIzq);
        btnDer = findViewById(R.id.btnDer);

        btnIzq.setOnClickListener(v -> {
            generaBotonIzq();
        });

        btnDer.setOnClickListener(v -> {
            generaBotonDer();
        });
    }

    void generaBotonIzq(){
        //Se genera el inflado de vista
        LinearLayout lytIzq = (LinearLayout) LinearLayout.inflate(this, R.layout.izquierda, null);
        Button izq = new Button(this);

        izq.setText("" + contador);
        contador++;
        izq.setMinimumHeight(100);
        izq.setMinimumWidth(MATCH_PARENT);

        lytIzq.addView(izq);

        //se agrega layout a la vista root
        root.addView(lytIzq);
        lytIzq.setMinimumWidth(MATCH_PARENT);
    }

    void generaBotonDer(){
        //Se genera el inflado de vista
        LinearLayout lytDer = (LinearLayout) LinearLayout.inflate(this, R.layout.derecha, null);
        Button der = new Button(this);

        der.setText(""+ contador);
        contador++;
        der.setMinimumHeight(100);
        der.setMinimumWidth(MATCH_PARENT);

        lytDer.addView(der);

        //se agrega layout a la vista root
        root2.addView(lytDer);
        lytDer.setMinimumWidth(MATCH_PARENT);
        lytDer.setBackgroundColor(getResources().getColor(R.color.white, getTheme()));
    }

}