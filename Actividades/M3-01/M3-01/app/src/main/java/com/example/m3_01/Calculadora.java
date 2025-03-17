package com.example.m3_01;

import android.util.Log;

public class Calculadora implements ICalculadora{

    @Override
    public double sumar(double a, double b) {
        return a+b;
    }

    @Override
    public double restar(double a, double b) {
        return a-b;
    }

    @Override
    public double mult(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        if(b == 0){
            return Double.NaN;
        }else{
            return a/b;
        }
    }
}
