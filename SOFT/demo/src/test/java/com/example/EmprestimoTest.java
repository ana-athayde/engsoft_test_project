package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmprestimoTest {
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void teste1() {
        Image foto1 = new Image();
        Image foto2 = new Image();
        Usuario c1 = new Usuario(1, "usuario1", foto1, 12345678, "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");
        Usuario r1 = new Usuario(2, "usuario2", foto2, 12341234, "33333333333", "44444444444", "rua 456", 22, "esta e outra biografia");
        Emprestimo e1 = new Emprestimo();
    }
}