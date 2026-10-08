package com.mycompany.ejercicio_resuelto_2_5;

public class Trapecio {

    float lado, base_mayor, base_menor, altura;

    Trapecio(float lado, float base_mayor, float base_menor, float altura) {
        this.lado = lado;
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    double calc_perimetro() {
        return (lado * 2) + base_mayor + base_menor;
    }

    double calc_area() {
        return ((base_mayor + base_menor) * altura) / 2;
    }
}
