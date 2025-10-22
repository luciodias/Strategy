package br.padroes.strategy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.padroes.strategy.strategy.Geometrica;

public class TestGeometrica {
    private static final double DELTA = 0.001;
    @Test
    public void testCalcularMedia() {
        Geometrica media = new Geometrica();
        assertEquals(media.calcularMedia(4, 6), 4.898, DELTA);
        assertEquals(media.calcularMedia(0, 10), 0.0, DELTA);
        assertEquals(media.calcularMedia(1.0, 3.0), 1.732, DELTA);
    }

    @Test
    public void test_Verificar_Situacao_Aprovado() {
        Geometrica obj = new Geometrica();
        assertEquals(obj.verificarSituacao(7.0), "Aprovado");
        assertEquals(obj.verificarSituacao(10.0), "Aprovado");
    }

    @Test
    public void test_Verificar_Situacao_Reprovado() {
        Geometrica obj = new Geometrica();
        assertEquals(obj.verificarSituacao(6.9), "Reprovado");
        assertEquals(obj.verificarSituacao(0.0), "Reprovado");
    }
}
