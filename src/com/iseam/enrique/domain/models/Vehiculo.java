package com.iseam.enrique.domain.models;

public class Vehiculo {
    private Integer matricula;
    private String marca;
    private String modelo;
    private String color;

    private String añomatriculacion;

    public Integer Matricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getAñomatriculacion() {
        return añomatriculacion;
    }

    public void setAñomatriculacion(String añomatriculacion) {
        this.añomatriculacion = añomatriculacion;
    }

}
