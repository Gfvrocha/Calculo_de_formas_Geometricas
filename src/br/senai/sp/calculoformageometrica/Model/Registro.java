package br.senai.sp.calculoformageometrica.Model;

import java.util.Scanner;

public class Registro {

    //Instanciar Exibir
    Exibir objExibir = new Exibir();

    //Instancia scanner
    Scanner teclado = new Scanner(System.in);


    //Instancia quadrado
    Quadrado objQuadrado = new Quadrado();

    //Instanciar triangulo
    Triangulo objTriangulo = new Triangulo();

    public Quadrado RegistroQuadrado(){

        System.out.println("Qual a medida do lado 1 no quadrado: ");
        objQuadrado.lado1 = teclado.nextDouble();
        System.out.println("Qual a medida do lado 2 do quadrado: ");
        objQuadrado.lado2 = teclado.nextDouble();

        return objQuadrado;

    }

    public Triangulo RegistroTriangulo(){
        System.out.println("Qual é a medida da Base do Triangulo: ");
        objTriangulo.base = teclado.nextDouble();
        System.out.println("Qual é a medida da Altura do Triangulo: ");
        objTriangulo.altura = teclado.nextDouble();

        return objTriangulo;
    }




}


