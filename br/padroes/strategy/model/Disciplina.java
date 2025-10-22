package br.padroes.strategy.model;

import br.padroes.strategy.strategy.MediaStrategy;

/**
 * Classe que representa uma disciplina e usa Strategy para calcular média
 */
public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;
    
    /**
     * Construtor que recebe a estratégia de cálculo
     */
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    /**
     * Calcula a média usando a estratégia injetada
     */
    public void calcularMedia() {
        // Delega o cálculo para a estratégia
        this.media = estrategia.calcularMedia(this.p1, this.p2);
        // Delega a verificação para a estratégia
        this.situacao = estrategia.verificarSituacao(this.media);
    }
    
    /**
     * Altera o nome da disciplina
     * @param nome nome da disciplina
     */
    public void setNome(String nome) {this.nome = nome;}
    
    /**
     * Altera a nota P1
     * @param p1 nota da primeira avaliação
     */
    public void setP1(double p1) {this.p1 = p1;}
    
    /**
     * Altera a nota P2
     * @param p2 nota da segunda avaliação
     */
    public void setP2(double p2) {this.p2 = p2;}

    /**
     * @return nome da disciplina
     */
    public String getNome() {return nome;}

    /**
     * @return nota da primeira avaliação
     */
    public double getP1() {return p1;}

    /**
     * @return nota da segunda avaliação
     */
    public double getP2() {return p2;}

    /**
     * @return média calculada
     */
    public double getMedia() {return media;}

    /**
     * @return situação do aluno
     */
    public String getSituacao() {return situacao;}
}