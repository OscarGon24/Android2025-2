package com.example.singleton;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView txvHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvHora = findViewById(R.id.txvHora);

        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://timeapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TimeService service = retrofit.create(TimeService.class);
        Call<Horario> call = service.obtenerHorario();

        call.enqueue(new Callback<Horario>() {
            @Override
            public void onResponse(Call<Horario> call, Response<Horario> response) {
                if (response.isSuccessful()) {
                    Horario horario = response.body();
                    if (horario != null) {
                        txvHora.setText(horario.getDatetime());
                    } else {
                        txvHora.setText("Sin datos");
                    }
                } else {
                    txvHora.setText("Error en la respuesta");
                }
            }

            @Override
            public void onFailure(Call<Horario> call, Throwable t) {
                txvHora.setText("Fallo en la conexión");
            }
        });*/

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://timeapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TimeService service = retrofit.create(TimeService.class);
        Call<Horario2> call = service.obtenerHorario2();

        call.enqueue(new Callback<Horario2>() {
            @Override
            public void onResponse(Call<Horario2> call, Response<Horario2> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Horario2 horario = response.body();
                    String mensaje = "Hora: " + horario.getTime() + "\n" +
                            "Zona: " + horario.getTimeZone() + "\n" +
                            "Día: " + horario.getDayOfWeek();
                    txvHora.setText(mensaje);
                } else {
                    txvHora.setText("Respuesta inválida");
                }
            }

            @Override
            public void onFailure(Call<Horario2> call, Throwable t) {
                txvHora.setText("Fallo de conexión: " + t.getMessage());
                Log.e("API_ERROR", "Error Retrofit", t);
            }
        });
    }
}

