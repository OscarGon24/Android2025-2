package com.example.proyecto262025;

import android.icu.math.BigDecimal;

public interface ICalculadoraMemoria {
    String concat(String numero);

    String concat(Operacion operacion);

    Operacion getOperacion();

    BigDecimal getX();

    BigDecimal getY();

    void clear();
}
