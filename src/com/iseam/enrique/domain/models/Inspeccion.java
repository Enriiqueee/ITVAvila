package com.iseam.enrique.domain.models;

public class Inspeccion {
    private Integer inspeccion;
    private String fechainspeccion;

    public Integer getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(Integer inspeccion) {
        this.inspeccion = inspeccion;
    }

    public String getFechainspeccion() {
        return fechainspeccion;
    }

    public void setFechainspeccion(String fechainspeccion) {
        this.fechainspeccion = fechainspeccion;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    private Boolean resultado;


}
