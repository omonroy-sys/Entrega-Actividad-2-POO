package com.mycompany.ejercicio_resuelto_2_5;

public class Cuadrado {

    float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return (4 * lado);
    }
}
