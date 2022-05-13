package com.company;


public class MedioCirculo implements Figuras{


    private int radio;


    //Constructor con un argumento(radio)

    public MedioCirculo(int radio) {

        this.radio=radio;
    }




    //Solicitar area y perimetro

    public double area() {

        return (Math.PI * radio * radio)/2;
    }

    //El perimetro es igual a la longitud, al ser medio circulo divimos el resultado entre 2
    public double perimetro() {

        return (2 * Math.PI * radio)/2;
    }



}



