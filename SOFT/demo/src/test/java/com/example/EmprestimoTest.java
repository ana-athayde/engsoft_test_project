package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.Executable;
import org.junit.jupiter.api.Assertions;

public class EmprestimoTest {
    @Test
    void verificarSituacaoEmprestimo() throws Exception {
        /* Verifica a situacao do emprestimo ao ser inicializado
        situacao = 1 --> emprestimo requisitado */
        Image foto1 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);
        assertEquals(1, e1.getSituacao());
    }

    @Test
    void verificarEmprestimoCancelado() throws Exception {
        /* Verifica se o emprestimo foi cancelado */
        Image foto1 = new Image();
        Image foto2 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");
        Usuario u2 = new Usuario(2, "usuario2", foto2, "12341234", "33333333333", "44444444444", "rua 456", 22, "esta e outra biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        e1.iniciarEmprestimo("null", u2);
        e1.cancelarEmprestimo();
        assertEquals(4, e1.getSituacao());
    }

    @Test
    void verificarSituacaoAposCancelamento() throws Exception {
        /* Verifica a situacao do emprestimo apos ser cancelado */
        Image foto1 = new Image();
        Image foto2 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");
        Usuario u2 = new Usuario(2, "usuario2", foto2, "12341234", "33333333333", "44444444444", "rua 456", 22, "esta e outra biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        e1.iniciarEmprestimo("null", u2);
        e1.cancelarEmprestimo();
        assertEquals(4, e1.getSituacao());
    }

    @Test
    void verificarEmprestimoJaCancelado() throws Exception {
        /* Verifica o cancelamento de um emprestimo que ja foi cancelado */
        Image foto1 = new Image();
        Image foto2 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");
        Usuario u2 = new Usuario(2, "usuario2", foto2, "12341234", "33333333333", "44444444444", "rua 456", 22, "esta e outra biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        e1.iniciarEmprestimo("null", u2);
        e1.cancelarEmprestimo();

        Exception thrown = assertThrows(Exception.class, ()->{e1.cancelarEmprestimo();});
        assertTrue(thrown.getMessage().contentEquals("Emprestimo ja foi concluido ou cancelado!"));

    }

    @Test
    void verificarInicioEmprestimoCancelado() throws Exception {
        // Iniciar emprestimo que ja foi cancelado
        Image foto1 = new Image();
        Image foto2 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");
        Usuario u2 = new Usuario(2, "usuario2", foto2, "12341234", "33333333333", "44444444444", "rua 456", 22, "esta e outra biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        e1.iniciarEmprestimo("null", u2);
        e1.cancelarEmprestimo();

        Exception thrown = assertThrows(Exception.class, ()->{e1.iniciarEmprestimo("null", u2);});
        assertTrue(thrown.getMessage().contentEquals("Emprestimo nao esta solicitado!"));
    }


    @Test
    void verificarInicioEmprestimoSemConcedente() {
        Image foto1 = new Image();

        Date dataEmp = new Date();

        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        Exception thrown = assertThrows(Exception.class, ()->{e1.iniciarEmprestimo("null", null);});
        assertTrue(thrown.getMessage().contentEquals("Concedente nao existe!"));

    }

    @Test
    void verificarCodigoConfirmacao() throws Exception {
        // Verifica se e possivel confirmar entrega com um codigo errado
        Image foto1 = new Image();
        Image foto2 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");
        Usuario u2 = new Usuario(2, "usuario2", foto2, "12341234", "33333333333", "44444444444", "rua 456", 22, "esta e outra biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        int codigo = e1.getCodigoConfirmacao() + 1;

        e1.iniciarEmprestimo("null", u2);

        Exception thrown = assertThrows(Exception.class, ()->{e1.confirmarEntrega(codigo);});
        assertTrue(thrown.getMessage().contentEquals("Codigo incorreto!"));

    }

    @Test
    void verificarSituacaoEntrega() {
        //Verifica se e possivel confirmar entrega de um emprestimo que nao esta em andamento
        Image foto1 = new Image();

        Date dataEmp = new Date();
        Date dataDev = new Date();

        Categoria c1 = new Categoria();

        Usuario u1 = new Usuario(1, "usuario1", foto1, "12345678", "11111111111", "22222222222", "rua 123", 20, "esta e uma biografia");

        Emprestimo e1 = new Emprestimo(1, u1, (float) 5.2, "endereco combinado", dataEmp, dataDev, "item requisitado", "descricao do item", c1);

        int codigo = e1.getCodigoConfirmacao();

        Exception thrown = assertThrows(Exception.class, ()->{e1.confirmarEntrega(codigo);});
        assertTrue(thrown.getMessage().contentEquals("Emprestimo nao esta em andamento!"));

    }
}
