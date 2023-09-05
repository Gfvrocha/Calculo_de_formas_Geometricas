package br.senai.sp.calculoformageometrica.Model;

import java.util.Scanner;

public class Registro {

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Geral */
    Triangulo objTriangulo = new Triangulo();
    Quadrado objQuadrado = new Quadrado();
    Circulo objCirculo = new Circulo();
    Retangulo objRetangulo = new Retangulo();

    public Triangulo CadastrarTriangulo(){
        System.out.println("=0=0= Triângulo =0=0=");
        System.out.println("Informe a Base: ");
        objTriangulo.base = teclado.nextDouble();
        System.out.println("Informe a Altura: ");
        objTriangulo.altura = teclado.nextDouble();
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");

        return objTriangulo;

    }
    public Quadrado CadastrarQuadrado(){
        System.out.println("=0=0= Quadrado =0=0=");
        System.out.println("Informe o lado 1: ");
        objQuadrado.lado1 = teclado.nextDouble();
        System.out.println("Informe o lado 2: ");
        objQuadrado.lado2 = teclado.nextDouble();
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");

        return objQuadrado;

    }
    public Retangulo CadastrarRetangulo(){
        System.out.println("=0=0= Retangulo =0=0=");
        System.out.println("Informe o lado 1: ");
        objRetangulo.lado1 = teclado.nextDouble();
        System.out.println("Informe o lado 2: ");
        objRetangulo.lado2 = teclado.nextDouble();
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");

        return objRetangulo;

    }

    public Circulo CadastrarCirculo(){
        System.out.println("=0=0= Circulo =0=0=");
        System.out.println("Informe o Raio: ");
        objCirculo.raio = teclado.nextDouble();
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");

        return objCirculo;

    }









}


