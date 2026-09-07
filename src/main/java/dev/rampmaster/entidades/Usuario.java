package dev.rampmaster.entidades;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String rut;
    protected boolean estado;

    public Usuario(String nombre, String apellido, String email, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getRut() {
        return rut;
    }

    public abstract void detalleUser();
}
