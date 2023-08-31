package br.senai.sp.calculoformageometrica.Model;

public class Quadrado {

    Exibir objExibir = new Exibir();

    public double lado1, lado2;

    public double CalcularArea(){

        double areaQuadrado = lado1 * lado2;
        return areaQuadrado;
    }

    public double CalcularPerimetro(){

        double perimetroQuadrado = 2 * (lado1 + lado2);
        return perimetroQuadrado;
    }
}
