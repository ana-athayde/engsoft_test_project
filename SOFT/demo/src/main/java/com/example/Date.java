package com.example;

public class Date {

    private int ano;
    private int mes;
    private int dia;

    public Date() {

    }

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "{" +
            " ano='" + getAno() + "'" +
            ", mes='" + getMes() + "'" +
            ", dia='" + getDia() + "'" +
            "}";
    }

}