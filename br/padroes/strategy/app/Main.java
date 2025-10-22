package br.padroes.strategy.app;

import br.padroes.strategy.model.Disciplina;
//import br.padroes.strategy.strategy.MediaStrategy;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.Geometrica;

public class Main {
    public static void main(String[] args) {
        // Testando com Média Aritmética
        Disciplina a = new Disciplina(new Aritmetica());
        // Testando com Média Geométrica
        Disciplina g = new Disciplina(new Geometrica());
        arrange(a, "Programação Orientada a Objetos", 10, 4);
        arrange(g, "Programação Orientada a Objetos", 10, 4);
        
        System.out.println("=== Aritmética ===");
        System.out.println(a);
        System.out.println("=== Geométrica ===");
        System.out.println(g);
    }

    private static void arrange(Disciplina d, String nome, double p1, double p2) {
        d.setNome(nome);
        d.setP1(p1);
        d.setP2(p2);
        d.calcularMedia();
    }
}