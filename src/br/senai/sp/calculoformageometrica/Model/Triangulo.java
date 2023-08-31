package br.senai.sp.calculoformageometrica.Model;

public class Triangulo {

    public double altura, base;

    public double CalcularArea(){

        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    public double CalcularPerimetro(){

        double perimetroTriangulo = (base + altura) * 2;
        return perimetroTriangulo;
    }
}
