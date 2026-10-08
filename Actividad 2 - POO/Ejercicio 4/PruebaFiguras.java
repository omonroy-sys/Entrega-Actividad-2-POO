package com.mycompany.ejercicio_resuelto_2_5;

public class PruebaFiguras {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Rombo figura5 = new Rombo(10, 16, 12);
        Trapecio figura6 = new Trapecio(5, 8, 6, 4);
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El area del rombo es = " + figura5.calc_area());
        System.out.println("El perimetro del rombo es = " + figura5.calc_perimetro());
        System.out.println();
        System.out.println("El area del trapecio es = " + figura6.calc_area());
        System.out.println("El perimetro del trapecio es = " + figura6.calc_perimetro());
        }
}
