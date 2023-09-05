package br.senai.sp.calculoformageometrica.Model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    Registro objCadastro = new Registro();

    Exibir objExibir = new Exibir();

    public void Menu(){
        System.out.println("\n||=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=||");
        System.out.println("||----- Sistema de Cálculo de Forma Geometrica  -----||");
        System.out.println("||=0=0=0=0=0=0=0=0=0=_______________=0=0=0=0=0=0=0=0=||");
        System.out.println("||------------------| 1 - Triângulo |----------------||");
        System.out.println("||------------------| 2 - Circulo   |----------------||");
        System.out.println("||------------------| 3 - Retângulo |----------------||");
        System.out.println("||------------------| 4 - Quadrado  |----------------||");
        System.out.println("||=0=0=0=0=0=0=0=0=0|_______________|0=0=0=0=0=0=0=0=||");

        System.out.println("\nQual é a sua escolha ?");

        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:

                Triangulo objTriangulo = objCadastro.CadastrarTriangulo();
                objTriangulo.CalcularArea();
                objTriangulo.CalcularPerimetro();
                objExibir.ExibirTriangulo(objTriangulo);
                break;

            case 2:

                Circulo objCirculo = objCadastro.CadastrarCirculo();
                objCirculo.CalcularArea();
                objCirculo.CalcularPerimetro();
                objExibir.ExibirCirculo(objCirculo);
                break;

            case 3:

                Retangulo objRetangulo = objCadastro.CadastrarRetangulo();
                objRetangulo.CalcularArea();
                objRetangulo.CalcularPerimetro();
                objExibir.ExibirRetangulo(objRetangulo);
                break;

            case 4:

                Quadrado objQuadrado = objCadastro.CadastrarQuadrado();
                objQuadrado.CalcularArea();
                objQuadrado.CalcularPerimetro();
                objExibir.ExibirQuadrado(objQuadrado);
                break;

        }


    }

}
