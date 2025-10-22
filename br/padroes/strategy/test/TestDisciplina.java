package br.padroes.strategy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import br.padroes.strategy.model.Disciplina;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.Geometrica;

public class TestDisciplina {
    @Test
    public void test_Nome() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        a.setNome("Padrões de Desenvolvimento");
        g.setNome("Padrões de Desenvolvimento");
        assertEquals("Padrões de Desenvolvimento", a.getNome());
        assertEquals("Padrões de Desenvolvimento", g.getNome());
    }
    
    @Test
    public void test_P1_0_a_10() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        a.setP1(0.0);
        g.setP1(10.0);
        assertEquals(a.getP1(),0.0);
        assertEquals(g.getP1(),10.0);
    }
        
    @Test
    public void test_P2_0_a_10() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        a.setP2(0.0);
        g.setP2(10.0);
        assertEquals(a.getP2(),0.0);
        assertEquals(g.getP2(),10.0);
    }

    @Test
    public void test_P1_Menor_Que_Zero() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        assertThrows(IllegalArgumentException.class, () -> {
            a.setP1(-5.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            g.setP1(-0.01);
        });
        assertEquals(a.getP1(),0.0);
        assertEquals(g.getP1(),0.0);
    }

    @Test
    public void test_P2_Menor_Que_Zero() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        assertThrows(IllegalArgumentException.class, () -> {
            a.setP2(-5.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            g.setP2(-0.01);
        });
        assertEquals(a.getP2(),0.0);
        assertEquals(g.getP2(),0.0);
    }

    @Test
    public void test_P1_Maior_Que_Dez() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        assertThrows(IllegalArgumentException.class, () -> {
            a.setP1(11.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            g.setP1(10.1);
        });
        assertEquals(a.getP1(),0.0);
        assertEquals(g.getP1(),0.0);
    }

    @Test
    public void test_P2_Maior_Que_Dez() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        assertThrows(IllegalArgumentException.class, () -> {
            a.setP2(11.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            g.setP2(10.1);
        });
        assertEquals(a.getP2(),0.0);
        assertEquals(g.getP2(),0.0);
    }

    @Test
    public void test_To_String() {
        Disciplina a = new Disciplina(new Aritmetica());
        Disciplina g = new Disciplina(new Geometrica());
        assertEquals(a.toString(),"Disciplina: null, P1: 0.00, P2: 0.00, Média: 0.00, Situação: Reprovado");
        assertEquals(g.toString(),"Disciplina: null, P1: 0.00, P2: 0.00, Média: 0.00, Situação: Reprovado");
        a.setNome("Nome da Disciplina");
        a.setP1(5.126);
        a.setP2(8.321);
        assertEquals(a.toString(),"Disciplina: Nome da Disciplina, P1: 5.13, P2: 8.32, Média: 6.72, Situação: Aprovado");
        g.setNome("Nome da Disciplina");
        g.setP1(5.126);
        g.setP2(8.321);
        assertEquals(g.toString(),"Disciplina: Nome da Disciplina, P1: 5.13, P2: 8.32, Média: 6.53, Situação: Reprovado");
    }
}
