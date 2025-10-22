package br.padroes.strategy.strategy;

public class Geometrica implements MediaStrategy {
    private final double CRITERIO_APROVACAO = 7.0;
    @Override
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= CRITERIO_APROVACAO ? "Aprovado" : "Reprovado";
    }
    
}
