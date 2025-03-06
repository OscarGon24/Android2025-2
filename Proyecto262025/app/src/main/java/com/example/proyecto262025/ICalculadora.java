package com.example.proyecto262025;

import android.icu.math.BigDecimal;

public interface ICalculadora {

    BigDecimal calculate(Operacion operacion, BigDecimal x, BigDecimal y);

}
