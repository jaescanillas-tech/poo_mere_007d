package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Usuario {
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
        System.out.println("=== Docente ===");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Rut: " + this.getRut());

    }
}
