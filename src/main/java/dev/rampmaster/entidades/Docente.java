package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Estudiante{
    private ArrayList<Seccion> seccions;

    public Docente(String nombre, String apellido, String email, String rut, ArrayList<Seccion> seccions) {
        super(nombre, apellido, email, rut);
        this.seccions = seccions;
    }

    public ArrayList<Seccion> getSeccions() {
        return seccions;
    }

    public void setSeccions(ArrayList<Seccion> seccions) {
        this.seccions = seccions;
    }

    public void addSeccion(Seccion seccion){
        this.seccions.add(seccion);
    }

    @Override
    public void detalleUser() {
        super.detalleUser();
    }
}
