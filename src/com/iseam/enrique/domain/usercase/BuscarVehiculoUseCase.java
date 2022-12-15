package com.iseam.enrique.domain.usercase;

import com.iseam.enrique.domain.models.Vehiculo;

public class BuscarVehiculoUseCase {
    private Vehiculo dataStore = Vehiculo.getInstance();

    public Vehiculo execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
