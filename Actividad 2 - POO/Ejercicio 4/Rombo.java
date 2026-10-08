package com.mycompany.ejercicio_resuelto_2_5;

public class Rombo {

    float lado, diagonal_mayor, diagonal_menor;

    Rombo(float lado, float diagonal_mayor, float diagonal_menor) {
        this.lado = lado;
        this.diagonal_mayor = diagonal_mayor;
        this.diagonal_menor = diagonal_menor;
    }

    double calc_perimetro() {
        return lado * 4;
    }

    double calc_area() {
        return (diagonal_mayor * diagonal_menor) / 2;
    }
}
