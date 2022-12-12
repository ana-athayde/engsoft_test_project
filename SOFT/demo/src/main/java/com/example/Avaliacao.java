package com.example;

public class Avaliacao {

    private int idAvaliacao;
    private Usuario usuarioAvaliado;
    private Usuario usuarioAvaliador;
    private float nota;
    private String descricao;

    public Avaliacao(){

    }

    public Avaliacao(int idAvaliacao, Usuario usuarioAvaliado, Usuario usuarioAvaliador, float nota, String descricao) {
        this.idAvaliacao = idAvaliacao;
        this.usuarioAvaliado = usuarioAvaliado;
        this.usuarioAvaliador = usuarioAvaliador;
        this.nota = nota;
        this.descricao = descricao;
    }

    public int getIdAvaliacao() {
        return this.idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public Usuario getUsuarioAvaliado() {
        return this.usuarioAvaliado;
    }

    public void setUsuarioAvaliado(Usuario usuarioAvaliado) {
        this.usuarioAvaliado = usuarioAvaliado;
    }

    public Usuario getUsuarioAvaliador() {
        return this.usuarioAvaliador;
    }

    public void setUsuarioAvaliador(Usuario usuarioAvaliador) {
        this.usuarioAvaliador = usuarioAvaliador;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return "{" +
            " idAvaliacao='" + getIdAvaliacao() + "'" +
            ", usuarioAvaliado='" + getUsuarioAvaliado() + "'" +
            ", usuarioAvaliador='" + getUsuarioAvaliador() + "'" +
            ", nota='" + getNota() + "'" +
            ", descricao='" + getDescricao() + "'" +
            "}";
    }
    
}