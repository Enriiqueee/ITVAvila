package com.iseam.enrique.presentation;

import com.iseam.enrique.domain.models.Camion;
import com.iseam.enrique.domain.models.Coche;
import com.iseam.enrique.domain.models.PropietarioCoche;
import com.iseam.enrique.domain.models.Vehiculo;
import com.iseam.enrique.domain.usercase.BuscarVehiculoUseCase;

public class Main {
    public static void main() {
        PropietarioCoche demo = new PropietarioCoche();
        demo.setCod(1);
        demo.setDni("01234329Z");
        demo.setNombre("Enrique");
        demo.setApellidos("Arenas Viñas");
        demo.setDireccion("Ávila");
        demo.setPoblacion("Ávila");
        demo.setTelefono(652826559);

        Camion camion = new Camion();
        camion.getMatricula("045 EDS");
        camion.getMarca("Megane");
        camion.getModelo("III");
        camion.getColor("Rojo");
        camion.setTara("3500kg y 12metros");

        Coche coche = new Coche();
        camion.getMatricula("045 EDS");
        camion.getMarca("Megane");
        camion.getModelo("III");
        camion.getColor("Rojo");
        camion.setTara("3500kg y 12metros");
    }
}