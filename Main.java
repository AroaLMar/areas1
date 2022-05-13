package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        /*En este caso solo vamos a crear las clases que vamos a utilizar pero se podrian ir
        añadiendo diferentes tipos de figuras*/

        String opcion = "";

        double areaTotal = 0;
        double perimetroTotal=0;

        /*Vamos a crear una variable que nos permita restar el perimetro a descontar, ya que hay posibilidad de
        que las imagenes se solapen, por lo que no computa para el perimetro total, estoy hay que hacerlo de forma
        manual ya que el programa no sabe como estan colocadas las figuras
         */
        double perimetroRestar=0;

        double perimetro;
        double area;


        while (!opcion.equals("3")) {
            System.out.println("[1] -- MedioCirculo");
            System.out.println("[2] -- Rectangulo");
            System.out.println("[3] -- Calcular Area y Perimetro");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduce el diametro");
                    int diametro=sc.nextInt();
                    int radio = diametro/2;
                    sc.nextLine();
                    MedioCirculo c1 = new MedioCirculo(radio);
                    area = c1.area();
                    areaTotal += area;
                    System.out.println("¿Perimetro coincidente con otra imagen?");
                    perimetroRestar=sc.nextInt();
                    sc.nextLine();
                    perimetro=(c1.perimetro())-perimetroRestar;
                    perimetroTotal+=perimetro;
                    break;

                case "2":
                    System.out.println("Introduce la base");
                    int base = sc.nextInt();
                    System.out.println("Introduce la altura");
                    int altura = sc.nextInt();
                    sc.nextLine();
                    Rectangulo r1 = new Rectangulo(base, altura);
                    area = r1.area();
                    areaTotal += area;
                    System.out.println("¿Perimetro coincidente con otra imagen?");
                    perimetroRestar=sc.nextInt();
                    sc.nextLine();
                    perimetro=r1.perimetro()-perimetroRestar;
                    perimetroTotal+=perimetro;

                    break;

                case "3":
                    System.out.println();
                    break;

                default:
                    System.out.println("Opcion no válida");
            }

        }

        System.out.println("El area total de la figura compuesta es " + areaTotal+ " cm2");
        System.out.println("El perimetro total de la figura compuesta es " + perimetroTotal+ " cm2");



    }
}
