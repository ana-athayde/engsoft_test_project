package com.example;
import java.util.Random;

public class Emprestimo {

    private int idEmprestimo;
    private Usuario concedente;
    private Usuario requisitante;
    private float distanciaMaxima;
    private String endereco;
    private int codigoConfirmacao;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private int situacao;
    private String nomeItem;
    private String descricaoItem;
    private Usuario usuario;
    private Categoria categoria;
    private Date date;

    public Emprestimo() {
    }

    public Emprestimo(int idEmprestimo, Usuario requisitante, float distanciaMaxima, String endereco, Date dataEmprestimo, Date dataDevolucao, String nomeItem, String descricaoItem, Categoria categoria) {
        this.idEmprestimo = idEmprestimo;
        this.requisitante = requisitante;
        this.distanciaMaxima = distanciaMaxima;
        this.endereco = endereco;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.categoria = categoria;

        Random rand = new Random();
        int upperbound = 9999;
        int int_random = rand.nextInt(upperbound); 

        this.codigoConfirmacao = int_random;

        //Emprestimo solicitado
        this.situacao = 1;
    }

    public void iniciarEmprestimo(String endereco, Usuario concedente) throws Exception {
        if(concedente == null){
            throw new Exception("Concedente nao existe!");
        }
        if(this.situacao != 1){
            throw new Exception("Emprestimo nao esta solicitado!");
        }
        //Emprestimo em andamento
        setEndereco(endereco);
        setConcedente(concedente);
        this.situacao = 2;
    }

    public void confirmarEntrega(int codigo) throws Exception {
        if(codigo != this.codigoConfirmacao){
            throw new Exception("Codigo incorreto!");
        } 
        if(this.situacao != 2){
            throw new Exception("Emprestimo nao esta em andamento!");
        }
        //Emprestimo concluido
        this.situacao = 3;
    }

    public void cancelarEmprestimo() throws Exception {
        if(this.situacao == 3 || this.situacao == 4){
            throw new Exception("Emprestimo ja foi concluido ou cancelado!");
        }
        //Emprestimo cancelado
        this.situacao = 4;
    }

    public int getIdEmprestimo() {
        return this.idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
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

    public float getDistanciaMaxima() {
        return this.distanciaMaxima;
    }

    public void setDistanciaMaxima(float distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigoConfirmacao() {
        return this.codigoConfirmacao;
    }

    public void setCodigoConfirmacao(int codigoConfirmacao) {
        this.codigoConfirmacao = codigoConfirmacao;
    }

    public Date getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getSituacao() {
        return this.situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getNomeItem() {
        return this.nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
            " idEmprestimo='" + getIdEmprestimo() + "'" +
            ", concedente='" + getConcedente() + "'" +
            ", requisitante='" + getRequisitante() + "'" +
            ", distanciaMaxima='" + getDistanciaMaxima() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", codigoConfirmacao='" + getCodigoConfirmacao() + "'" +
            ", dataEmprestimo='" + getDataEmprestimo() + "'" +
            ", dataDevolucao='" + getDataDevolucao() + "'" +
            ", situacao='" + getSituacao() + "'" +
            ", nomeItem='" + getNomeItem() + "'" +
            ", descricaoItem='" + getDescricaoItem() + "'" +
            ", usuario='" + getUsuario() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

}
