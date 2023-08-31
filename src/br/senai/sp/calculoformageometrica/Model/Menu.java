package br.senai.sp.calculoformageometrica.Model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    //Instancia Registro
    Registro objRegistro = new Registro();

    public void Menu(){

        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        System.out.println("Olá usuario, vamos começar!");

        int escolha;

        System.out.println("O que deseja calcular? \n1 - Quadrado \n2 - Triângulo");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                Quadrado objQuadrado = objRegistro.RegistroQuadrado();
                objQuadrado.

                break;

            case 2:
                objRegistro.RegistroTriangulo();
                break;
        }
    }
}
