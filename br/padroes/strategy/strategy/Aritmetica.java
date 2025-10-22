package br.padroes.strategy.strategy;

public class Aritmetica implements MediaStrategy {
    private final double CRITERIO_APROVACAO = 5.0;
    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= CRITERIO_APROVACAO ? "Aprovado" : "Reprovado";
    }
    
}
