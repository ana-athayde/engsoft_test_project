package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioTest {
    @Test
    void usuarioIncorreto() {
        Image foto1 = new Image();
        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");

        Exception thrown = assertThrows(Exception.class, ()->{u1.iniciarLogin(0, "12345678");});
        assertTrue(thrown.getMessage().contentEquals("Id incorreto!"));
    }

    @Test
    void senhaIncorreta() {
        Image foto1 = new Image();
        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");

        Exception thrown = assertThrows(Exception.class, ()->{u1.iniciarLogin(1, "0");});
        assertTrue(thrown.getMessage().contentEquals("Senha incorreta!"));
    }
}
