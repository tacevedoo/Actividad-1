package com.mycompany.ejercicio5;
public class Ejercicio5 {
    public static void main(String[] args) {
        double PI = Math.PI;
        double radio = 4;
        double area = PI * (Math.pow(radio, 2));
        double perimetro = 2*PI*radio;
        System.out.println("El círculo con radio: " + (int)radio);
        System.out.println("Tiene un área de: " + area);
        System.out.println("Tiene un perímetro de: " + perimetro);
    }
}
