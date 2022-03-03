package br.com.exerciciosDio;

import br.com.exerciciosDio.pojo.*;

public class ExePrinc {
    public static void main(String[] args) {

        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(5, 5);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(10, 2);

        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 5);

        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(19);

        System.out.println("Exercicio Quadrilatero");
        Quadrilatero.area(2);
        Quadrilatero.area(3,5);
        Quadrilatero.area(2, 2, 5);

        System.out.println("Exercicio QuadrilateroComReturn");
        double areaQuadrado = QuadrilateroComReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroComReturn.area(5, 5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroComReturn.area(7, 8 ,9);
        System.out.println("Área do Trapezio: " + areaTrapezio);
    }
}
