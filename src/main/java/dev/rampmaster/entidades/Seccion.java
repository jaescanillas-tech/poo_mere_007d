package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Docente> docentes = new ArrayList<>();

    public Seccion(String nombre, String codigo, List<Estudiante> estudiantes,  List<Docente> docentes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = estudiantes;
        this.docentes = docentes;
    }

    public void addEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
        estudiante.addSeccion(this);
    }

    public void addDocente(Docente docente){
        this.docentes.add(docente);
        docente.addSeccion(this);
    }
}
