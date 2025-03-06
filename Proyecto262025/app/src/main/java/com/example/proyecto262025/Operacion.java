package com.example.proyecto262025;

public enum Operacion {

    SUMA,RESTA, DIV, MULT,PORC,NONE;

    public static String convert(Operacion operacion){
        switch (operacion){
            case SUMA:
                return "+";
            case RESTA:
                return "-";
            case MULT:
                return "*";
            case DIV:
                return "/";
            case PORC:
                return "%";
            case NONE:
                return "";
        }
        return "";
    }
}
