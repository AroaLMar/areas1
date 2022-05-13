package com.company;

public class Rectangulo implements Figuras {

    private int base;

    private int altura;


    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }



    //Calcular su area

    public double area() {
        return base * altura;

    }

    //Calcular su perimetro

    public double perimetro() {

        return ((base * 2) + (altura * 2));
    }

}
