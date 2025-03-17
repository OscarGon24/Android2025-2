package com.example.proyecto262025;

import android.icu.math.BigDecimal;

public class CalculadoraMemoria implements ICalculadoraMemoria{

    private String display = "0.0";
    Operacion operacion;

    private String display = "";

    @Override
    public String concat(String numero) {
         display += numero;
         return display;
    }

    @Override
    public String concat(Operacion operacion) {
         this.operacion = operacion;

         this.x = BigDecimal.valueOf(Long.parseLong(display));

         return Operacion.convert(operacion);
    }

    @Override
    public void clear() {
        display = "";
        operacion = Operacion.NONE;
        x = BigDecimal.ZERO;
        y = BigDecimal.ZERO;
    }

    private BigDecimal obtainX(){
        return x;
    }

    private  BigDecimal obtainY(){
        return y;
    }

}
