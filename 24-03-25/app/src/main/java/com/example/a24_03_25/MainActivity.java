package com.example.a24_03_25;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAgrega;
    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        root = findViewById(R.id.lytMain);

        btnAgrega = findViewById(R.id.btnAgrega);

        btnAgrega.setOnClickListener(v -> {
            generaImagen();
        });

    }

    void generaImagen(){

        //Se genera el inflado de vista
        LinearLayout lytItemPrueba = (LinearLayout) LinearLayout.inflate(this, R.layout.item_prueba, null);
        ImageView img = new ImageView(this);

        //Se genra la imagen
        img.setImageResource(R.mipmap.ic_launcher);
        img.setMinimumHeight(100);
        img.setMinimumWidth(MATCH_PARENT);

        //Se agrega imagen al layout
        lytItemPrueba.setGravity(Gravity.CENTER);
        lytItemPrueba.addView(img);

        //se agrega layout a la vista root
        root.addView(lytItemPrueba);
        lytItemPrueba.setMinimumWidth(MATCH_PARENT);
        lytItemPrueba.setBackgroundColor(getResources().getColor(R.color.naranja, getTheme()));
    }
}