package br.padroes.strategy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.padroes.strategy.strategy.Aritmetica;

public class TestAritmetica {
    private static final double DELTA = 0.001;
    @Test
    public void testCalcularMedia() {
        Aritmetica obj = new Aritmetica();
        assertEquals(obj.calcularMedia(4, 6), 5.0);
        assertEquals(obj.calcularMedia(0, 10), 5.0);
        assertEquals(obj.calcularMedia(0.0, 3.0), 1.5);
    }

    @Test
    public void test_Verificar_Situacao_Aprovado() {
        Aritmetica obj = new Aritmetica();
        assertEquals(obj.verificarSituacao(5.0), "Aprovado");
        assertEquals(obj.verificarSituacao(10.0), "Aprovado");
    }

    @Test
    public void test_Verificar_Situacao_Reprovado() {
        Aritmetica obj = new Aritmetica();
        assertEquals(obj.verificarSituacao(4.9), "Reprovado");
        assertEquals(obj.verificarSituacao(0.0), "Reprovado");
    }
}
