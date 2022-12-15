package com.iseam.enrique.data;

import com.iseam.enrique.domain.models.Vehiculo;

public class VehiculoDataStore {
    public class CrearClienteUseCase {
        private VehiculoDataStore dataStore = VehiculoDataStore
        public void execute(Vehiculo vehiculo) {
            dataStore.guardar(vehiculo);
        }
    }
}
