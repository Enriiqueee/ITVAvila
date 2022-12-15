package com.iseam.enrique.presentation;

import com.iseam.enrique.domain.models.Camion;
import com.iseam.enrique.domain.models.Coche;
import com.iseam.enrique.domain.models.Inspeccion;
import com.iseam.enrique.domain.models.PropietarioCoche;

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
        coche.getMatricula("034 AVF");
        coche.getMarca("Megane");
        coche.getModelo("II");
        coche.getColor("Rojo");
        coche.setNpuertas(4);

        Inspeccion inspeccion = new Inspeccion();
        inspeccion.getCod(2);
        inspeccion.getFechainspeccion("12-10-2004");

    }
}