package com.mycompany.ejercicio_resuelto_2_5;

public class TrianguloRectangulo {

    float base;
    float altura;

    public TrianguloRectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return ((base * altura) / 2);
    }

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            System.out.println("Es un triángulo equilátero");
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
