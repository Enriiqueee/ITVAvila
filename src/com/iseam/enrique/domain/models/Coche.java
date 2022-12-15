package com.iseam.enrique.domain.models;
public class Coche implements Vehiculo {
    private Integer cod;
    private Integer npuertas;

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public Integer getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(Integer npuertas) {
        this.npuertas = npuertas;
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

