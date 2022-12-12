package com.example;

import java.util.ArrayList;

public class Mensagem {

    private int idMensagem;
    private Usuario concedente;
    private Usuario requisitante;
    private Emprestimo emprestimo;
    private ArrayList<String> conteudo = new ArrayList<>();

    public Mensagem() {

    }

    public Mensagem(int idMensagem, Usuario concedente, Usuario requisitante, Emprestimo emprestimo, ArrayList<String> conteudo) {
        this.idMensagem = idMensagem;
        this.concedente = concedente;
        this.requisitante = requisitante;
        this.emprestimo = emprestimo;
        this.conteudo = conteudo;
    }

    public int getIdMensagem() {
        return this.idMensagem;
    }

    public void setIdMensagem(int idMensagem) {
        this.idMensagem = idMensagem;
    }

    public Usuario getConcedente() {
        return this.concedente;
    }

    public void setConcedente(Usuario concedente) {
        this.concedente = concedente;
    }

    public Usuario getRequisitante() {
        return this.requisitante;
    }

    public void setRequisitante(Usuario requisitante) {
        this.requisitante = requisitante;
    }

    public Emprestimo getEmprestimo() {
        return this.emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public ArrayList<String> getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(ArrayList<String> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "{" +
            " idMensagem='" + getIdMensagem() + "'" +
            ", concedente='" + getConcedente() + "'" +
            ", requisitante='" + getRequisitante() + "'" +
            ", emprestimo='" + getEmprestimo() + "'" +
            ", conteudo='" + getConteudo() + "'" +
            "}";
    }
}