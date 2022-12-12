package com.example;

public class Usuario {

    private int idUsuario;
    private String nome;
    private int senha;
    private Image foto;
    private String cpf;
    private String telefone;
    private String endereco;
    private int idade;
    private String biografia;

    public Usuario() {
        
    }

    public Usuario(int idUsuario, String nome, Image foto, int senha, String cpf, String telefone, String endereco, int idade, String biografia) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.foto = foto;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idade = idade;
        this.biografia = biografia;
    }

    public void iniciarLogin(int idUsuario, int senha) throws Exception{
        if (this.idUsuario != idUsuario){
            throw new Exception("Id incorreto!");
        }
        if(this.senha != senha){
            throw new Exception("Senha incorreta!");
        }
        System.out.println("Login feito com sucesso!");
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Image getFoto() {
        return this.foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBiografia() {
        return this.biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    @Override
    public String toString() {
        return "{" +
            " idUsuario='" + getIdUsuario() + "'" +
            ", nome='" + getNome() + "'" +
            ", senha='" + getSenha() + "'" +
            ", foto='" + getFoto() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", idade='" + getIdade() + "'" +
            ", biografia='" + getBiografia() + "'" +
            "}";
    }
}