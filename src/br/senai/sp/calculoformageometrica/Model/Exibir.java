package br.senai.sp.calculoformageometrica.Model;

public class Exibir {

    Registro objRegistro = new Registro();

    public void ExibirQuadrado(Quadrado objQuadrado){

        System.out.println("A Area do Quadrado é : " + objQuadrado.CalcularArea());
        System.out.println("O Perimetro do Quadrado é: " + objQuadrado.CalcularPerimetro());

        objRegistro.RegistroQuadrado();
    }
}
