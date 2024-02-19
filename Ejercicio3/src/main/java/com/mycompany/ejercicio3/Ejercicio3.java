package com.mycompany.ejercicio3;
public class Ejercicio3 {
    public static void main(String[] args) {
        double horas, valor_hora, retencion, salario_bruto, salario_neto;
        horas = 48;
        valor_hora = 5000;
        retencion = 0.125;
        salario_bruto = horas * valor_hora;
        salario_neto = salario_bruto - (salario_bruto * retencion);
        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("La retención en la fuente es: " + retencion);
        System.out.println("El salario neto del trabajador es: " + salario_neto);
    }
}
