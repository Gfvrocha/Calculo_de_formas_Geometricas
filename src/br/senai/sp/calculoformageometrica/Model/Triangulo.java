package br.senai.sp.calculoformageometrica.Model;

public class Triangulo {

    public double base, altura, area, perimetro;
    public double CalcularArea (){
        area = (base * altura) / 2;
        return area;

    }

    public double CalcularPerimetro(){
        perimetro = base + altura * 2;
        return perimetro;
    }



}
