package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Usuario {
    private List<Seccion> seccions = new ArrayList<>();

    public Estudiante(String nombre, String apellido, String email, String rut) {
        super(nombre, apellido, email, rut);
    }

    public List<Seccion> getSecciones() {
        return seccions;
    }

    public void addSeccion(Seccion seccion){
        this.seccions.add(seccion);
    }

    @Override
    public void detalleUser() {

    }
}
