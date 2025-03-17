package com.example.proyecto262025;

import android.icu.math.BigDecimal;

public interface CalculadoraOnResult {
    void onResult(BigDecimal x, BigDecimal y, Operacion operacion);
}
