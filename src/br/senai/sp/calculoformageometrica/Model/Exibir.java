package br.senai.sp.calculoformageometrica.Model;

public class Exibir {

    public void ExibirTriangulo(Triangulo objTriangulo){

        System.out.println("=0=0=0= Print Triângulo =0=0=0=");
        System.out.println("Base: " + objTriangulo.base);
        System.out.println("Altura: " + objTriangulo.altura);
        System.out.println("Area: " + objTriangulo.area);
        System.out.println("Perimetro: " + objTriangulo.perimetro);
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");


    }public void ExibirQuadrado(Quadrado objQuadrado){

        System.out.println("=0=0= Print Quadrado =0=0=");
        System.out.println("Base: " + objQuadrado.lado1);
        System.out.println("Altura: " + objQuadrado.lado2);
        System.out.println("Area: " + objQuadrado.area);
        System.out.println("Perimetro: " + objQuadrado.perimetro);
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");


    }public void ExibirCirculo(Circulo objCirculo){

        System.out.println("=0=0= Print Circulo =0=0=");
        System.out.println("Raio: " + objCirculo.raio);
        System.out.println("Area: " + objCirculo.area);
        System.out.println("Perimetro: " + objCirculo.perimetro);
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");


    }public void ExibirRetangulo(Retangulo objRetangulo){

        System.out.println("=0=0= Print Retangulo =0=0=");
        System.out.println("Base: " + objRetangulo.lado1);
        System.out.println("Altura: " + objRetangulo.lado2);
        System.out.println("Area: " + objRetangulo.area);
        System.out.println("Perimetro: " + objRetangulo.perimetro);
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");


    }

}
