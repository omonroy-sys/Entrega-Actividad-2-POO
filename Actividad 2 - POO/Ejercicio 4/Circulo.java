package com.mycompany.ejercicio_resuelto_2_5;

public class Circulo {
    
    float radio;

    Circulo(float radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
