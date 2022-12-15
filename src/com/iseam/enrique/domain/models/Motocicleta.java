package com.iseam.enrique.domain.models;

public class Motocicleta implements Vehiculo {
    private Integer cod;
    private Integer diametrorueda;
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public Integer getDiametrorueda() {
        return diametrorueda;
    }

    public void setDiametrorueda(Integer diametrorueda) {
        this.diametrorueda = diametrorueda;
    }

    @Override
    public String getMatricula() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getAñomatriculacion() {
        return null;
    }
}
