package com.example.singleton;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TimeService {
    @GET("api/ip")
    Call<Horario> obtenerHorario();

    @GET("time")
    Call<Horario2> obtenerHorario2();
}
